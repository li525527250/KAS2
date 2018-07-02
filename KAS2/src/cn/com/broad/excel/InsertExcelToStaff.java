package cn.com.broad.excel;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.imageio.metadata.IIOInvalidTreeException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.eclipse.jdt.internal.compiler.ast.ThisReference;

import cn.com.broad.entity.Kpiindex;
import cn.com.broad.entity.StaffKpi;
import cn.com.broad.entity.Users;
import cn.com.broad.impl.KPIindexDaoImpl;
import cn.com.broad.impl.StaffKpiDaoimpl;
import cn.com.broad.impl.UsersDaoImpl;

/*
 * Excel导入
 * */
public class InsertExcelToStaff {
	public static int insertCount1;
	public static int addBeDefeated1;
	public static String BeDefeatedMessage1;

	private InsertExcelToStaff() {
	}

	public static void start(InputStream in, String path,String date,int kpiExamineDatePeriodID) throws FileNotFoundException, IOException {
		Workbook book = getWorkBook(in, path); // 1.获取工作簿
		List<Sheet> sheets = getSheets(book); // 2.获取所有工作表
		SheetIterator(sheets,date,kpiExamineDatePeriodID);// 3.对所有工作表进行操作
	}

	// 1.获取工作簿
	public static Workbook getWorkBook(InputStream in, String path) throws FileNotFoundException, IOException {
		return path.endsWith(".xls") ? (new HSSFWorkbook(in))
				: (path.endsWith(".xlsx") ? (new XSSFWorkbook(in)) : (null));
	}

	// 2.获取所有工作表
	private static List<Sheet> getSheets(Workbook book) {
		int numberOfSheets = book.getNumberOfSheets();
		List<Sheet> sheets = new ArrayList<Sheet>();
		for (int i = 0; i < numberOfSheets; i++) {
			sheets.add(book.getSheetAt(i));
		}
		return sheets;
	}

	// 3.对所有工作表进行操作
	private static void SheetIterator(List<Sheet> sheets,String date,int kpiExamineDatePeriodID) {
		insertCount1 = 0;
		addBeDefeated1 = 0;
		BeDefeatedMessage1 = "插入失败数据ID :";
		for (int i = 0; i < sheets.size(); i++) { // 循环每一张工作表
			Sheet sheet = sheets.get(i);
			if (sheet.getLastRowNum() >= 1) { // 判断是否为空表，获取有数据的最后一行的行数。如果为零则为空表
				System.out.println(sheet.getSheetName() + "============="); // 打印不为空的工作表名字
			}
			Iterator<Row> iterator = sheet.iterator(); // 迭代器
			// 用两个while循环遍历所有单元格
			while (iterator.hasNext()) { // 遍历每一行
				Row nextRow = iterator.next();
				if (nextRow.getRowNum() < 1) {
					continue;
					// nextRow.getRowNum()就是获取行数，由表中看出第一行(getRowNum()=0)为表头，直接跳过
				}

				// 从第二行开始是有用的数据，要保存早数据库，第二行：nextRow.getRowNum()=1
				Iterator<Cell> cellIterator = nextRow.cellIterator();
				StaffKpi staffKpi = new  StaffKpi(); 
				while (cellIterator.hasNext()) { // 遍历每一行的每一列
					Cell cell = cellIterator.next();
					switch (cell.getColumnIndex()) {
					// 将单元格内容设置为String类型，也可以这样写cell.setCellType(Cell.CELL_TYPE_STRING);
					case 1:
						cell.setCellType(1);
						staffKpi.setStaffID(Integer.parseInt(cell.getStringCellValue()));
						break;
					case 2:
						cell.setCellType(1);
						staffKpi.setStaffJobNunmber(cell.getStringCellValue());
						break;
					case 4:
						cell.setCellType(1);
						staffKpi.setModuleID(Integer.parseInt(cell.getStringCellValue()));
						break;
					case 6:
						cell.setCellType(1);
						staffKpi.setKpiindexID(Integer.parseInt(cell.getStringCellValue()));
						break;
					case 7:
						cell.setCellType(1);
						staffKpi.setCurrentReality(cell.getStringCellValue());
						break;
					case 8:
						cell.setCellType(1);
						staffKpi.setCurrentYieldRate(cell.getStringCellValue());
						break;
					case 9:
						cell.setCellType(1);
						staffKpi.setCurrentScore(Double.parseDouble(cell.getStringCellValue()));
						break;
					}
				}
				try {
					insertCount1 = insertCount1 + 1;
					StaffKpiDaoimpl staffKpiDaoimpl=new StaffKpiDaoimpl();
					staffKpi.setDate(date);
					staffKpi.setKpiExamineDatePeriodID(kpiExamineDatePeriodID);
					System.out.println(staffKpi);
					
					System.out.println(staffKpiDaoimpl.addStaffKpi(staffKpi));
				} catch (Exception e) {
					addBeDefeated1= addBeDefeated1 + 1;
					BeDefeatedMessage1 = BeDefeatedMessage1 + addBeDefeated1+ "-";
					e.printStackTrace();
				}
			}
		}
	}
}
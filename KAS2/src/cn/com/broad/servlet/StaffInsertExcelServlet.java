package cn.com.broad.servlet;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.com.broad.excel.InsertExcel;
import cn.com.broad.excel.InsertExcelToStaff;

/**
 * Servlet implementation class StaffInsertExcelServlet
 */
public class StaffInsertExcelServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StaffInsertExcelServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		String excelPuth = request.getParameter("excelFile");//获取需要导入Excel表格的绝对路径
		excelPuth = new String(excelPuth.getBytes("ISO-8859-1"), "UTF-8");//转换Excel路径字符串格式
		String date=request.getParameter("dd");
		date= new String(date.getBytes("ISO-8859-1"), "UTF-8");//转换Excel路径字符串格式
		String[] listDate = date.split("/");
		int kpiExamineDatePeriodID=0;
		String kpiExamineDatePeriod=request.getParameter("search_moduleKey");
		kpiExamineDatePeriodID= Integer.parseInt(kpiExamineDatePeriod);
		String message = "";//返回的导入是否成功的消息
		if (excelPuth.equals("E:\\staffkpiindex.xls")) {//判断是否可以
			message = "数据导入成功";
			request.setAttribute("message", message);
			InputStream in = new FileInputStream(new File(excelPuth));
			InsertExcelToStaff.start(in, excelPuth,listDate[2],kpiExamineDatePeriodID);
			int insertCount = InsertExcelToStaff.insertCount1;
			int addBeDefeated = InsertExcelToStaff.addBeDefeated1;
			String BeDefeatedMessage = InsertExcelToStaff.BeDefeatedMessage1;
			request.setAttribute("insertCount", insertCount);
			request.setAttribute("addBeDefeated", addBeDefeated);
				request.setAttribute("BeDefeatedMessage", BeDefeatedMessage);
			request.getRequestDispatcher("product-brand2.jsp").forward(request, response);
		} else {
			message = "数据源错误";
			request.setAttribute("message", message);
			request.getRequestDispatcher("product-brand2.jsp").forward(request, response);
		}
		out.flush();
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

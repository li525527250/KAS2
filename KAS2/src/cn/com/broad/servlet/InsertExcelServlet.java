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
import javax.servlet.http.HttpSession;

import cn.com.broad.entity.Users;
import cn.com.broad.excel.InsertExcel;
import cn.com.broad.impl.UsersDaoImpl;

/**
 * Servlet implementation class InsertExcelServlet
 * 导入ExcelServlet
 */
public class InsertExcelServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public InsertExcelServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		String excelPuth = request.getParameter("excelFile");//获取需要导入Excel表格的绝对路径
		excelPuth = new String(excelPuth.getBytes("ISO-8859-1"), "UTF-8");//转换Excel路径字符串格式
		String message = "";//返回的导入是否成功的消息
		if (excelPuth.equals("E:\\kpiindex.xls")) {//判断是否可以
			message = "数据导入成功";
			request.setAttribute("message", message);
			InputStream in = new FileInputStream(new File(excelPuth));
			InsertExcel.start(in, excelPuth);
			int insertCount = InsertExcel.insertCount;
			int addBeDefeated = InsertExcel.addBeDefeated;
			String BeDefeatedMessage = InsertExcel.BeDefeatedMessage;
			request.setAttribute("insertCount", insertCount);
			request.setAttribute("addBeDefeated", addBeDefeated);
			request.setAttribute("BeDefeatedMessage", BeDefeatedMessage);
			request.getRequestDispatcher("product-brand.jsp").forward(request, response);
		} else {
			message = "数据源错误";
			request.setAttribute("message", message);
			request.getRequestDispatcher("product-brand.jsp").forward(request, response);
		}
		out.flush();
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}

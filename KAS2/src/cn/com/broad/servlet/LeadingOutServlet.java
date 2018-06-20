package cn.com.broad.servlet;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.com.broad.entity.KpiIndexModule;
import cn.com.broad.excel.InsertExcel;
import cn.com.broad.excel.LeadingOut;
import cn.com.broad.impl.KpiIndexModuleDaoImp;

/**
 * Servlet implementation class LeadingOutServlet
 */
public class LeadingOutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LeadingOutServlet() {
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
		String excelPuth = request.getParameter("excelFile1");
		excelPuth = new String(excelPuth.getBytes("ISO-8859-1"), "UTF-8");
		String message1 = "";
		if (excelPuth.equals("E:\\kpiindex.xls")) {
			message1 = "数据导出成功";
			request.setAttribute("message1", message1);
			KpiIndexModuleDaoImp kpiIndexModuleDaoImp=new KpiIndexModuleDaoImp();
	        List<KpiIndexModule> list=kpiIndexModuleDaoImp.getKpiIndexModule();
	        LeadingOut.createExcel(list,excelPuth);
			request.getRequestDispatcher("product-brand.jsp").forward(request, response);
		} else {
			message1 = "数据源错误";
			request.setAttribute("message1", message1);
			request.getRequestDispatcher("product-brand.jsp").forward(request, response);
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

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

import cn.com.broad.entity.KpiExamineDateType;
import cn.com.broad.excel.InsertExcelToStaff;
import cn.com.broad.impl.KpiExamineDateTypeDaoImpl;

/**
 * Servlet implementation class SerlectKpiExamineDateTypeServlet
 */
public class SerlectKpiExamineDateTypeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SerlectKpiExamineDateTypeServlet() {
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
		KpiExamineDateTypeDaoImpl kpiExamineDateTypeDaoImpl=new KpiExamineDateTypeDaoImpl();
		List<KpiExamineDateType> list = kpiExamineDateTypeDaoImpl.getExamineDateTypes();
		request.setAttribute("list", list);
		request.getRequestDispatcher("product-brand2.jsp").forward(request, response);
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

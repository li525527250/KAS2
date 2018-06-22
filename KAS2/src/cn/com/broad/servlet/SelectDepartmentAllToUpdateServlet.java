package cn.com.broad.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.com.broad.entity.Department;
import cn.com.broad.entity.Kpiindex;
import cn.com.broad.impl.DepartmentDaoImpl;
import cn.com.broad.impl.KPIindexDaoImpl;

/**
 * Servlet implementation class SelectDepartmentAllToUpdateServlet
 */
public class SelectDepartmentAllToUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
	 * @see HttpServlet#HttpServlet()
	 */
	public SelectDepartmentAllToUpdateServlet() {
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
		DepartmentDaoImpl departmentDaoImpl = new DepartmentDaoImpl();
		int kpiID = Integer.parseInt(request.getParameter("kpiID"));
		KPIindexDaoImpl kpIindexDaoImpl = new KPIindexDaoImpl();
		Kpiindex kpiindex = kpIindexDaoImpl.getKpiIndexByKpiID(kpiID);
		List<Department> list = departmentDaoImpl.getDepertmentAll();
		if (list != null) {
			request.setAttribute("kpiindex1", kpiindex);
			request.setAttribute("departmentlist", list);
			request.getRequestDispatcher("article-add.jsp").forward(request, response);
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

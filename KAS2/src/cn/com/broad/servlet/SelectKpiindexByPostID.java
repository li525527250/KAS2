package cn.com.broad.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.com.broad.entity.Department;
import cn.com.broad.entity.Kpiindex;
import cn.com.broad.impl.DepartmentDaoImpl;
import cn.com.broad.impl.KPIindexDaoImpl;

/**
 * Servlet implementation class SelectKpiindexByPostID
 */
public class SelectKpiindexByPostID extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SelectKpiindexByPostID() {
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
		int postID = Integer.parseInt(request.getParameter("postID"));
		KPIindexDaoImpl kpIindexDaoImpl = new KPIindexDaoImpl();
		List<Kpiindex> list = kpIindexDaoImpl.getKPIindexByPostID(postID);
		HttpSession session = request.getSession();
		session.setAttribute("kpilist", list);
		request.getRequestDispatcher("SelectDepartmentAllServlet").forward(request, response);
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

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
import cn.com.broad.entity.Users;
import cn.com.broad.impl.DepartmentDaoImpl;
import cn.com.broad.impl.UsersDaoImpl;

/**
 * Servlet implementation class SelectDepartmentAllServlet
 * 查询出所有的部门
 */
public class SelectDepartmentAllServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	public SelectDepartmentAllServlet() {
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
		List<Department> list = departmentDaoImpl.getDepertmentAll();//调用部门实现类查询出所有的部门list集合
		if (list != null) {
			request.setAttribute("departmentlist", list);
			request.getRequestDispatcher("article-list.jsp").forward(request, response);
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

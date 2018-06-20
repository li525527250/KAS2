package cn.com.broad.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import cn.com.broad.entity.Posts;
import cn.com.broad.impl.PostDaoImpl;

/**
 * Servlet implementation class SelectPostsByDepartmentToAddKpiServlet
 */
public class SelectPostsByDepartmentToAddKpiServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SelectPostsByDepartmentToAddKpiServlet() {
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
		PostDaoImpl postDaoImpl=new PostDaoImpl();
		int departmentID=Integer.parseInt(request.getParameter("value"));
		List<Posts> list=postDaoImpl.getPostByDepartmentId(departmentID);
		Gson gson = new Gson();  
        try {  
        response.getWriter().print(gson.toJson(list));  
    } catch (IOException e) {  
        e.printStackTrace();  
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

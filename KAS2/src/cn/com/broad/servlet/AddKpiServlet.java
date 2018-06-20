package cn.com.broad.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.com.broad.entity.Kpiindex;
import cn.com.broad.entity.Users;
import cn.com.broad.impl.KPIindexDaoImpl;
import cn.com.broad.impl.UsersDaoImpl;

/**
 * Servlet implementation class AddKpiServlet
 *添加KP指标Servlet
 *  */
public class AddKpiServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddKpiServlet() {
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
		String kpiIndexName = request.getParameter("kpiindexName");
		int moduleID=Integer.parseInt(request.getParameter("search_systemKey1"));
		int postID=Integer.parseInt(request.getParameter("search_moduleKey"));
		String weight=request.getParameter("weight");
		String span=request.getParameter("span");
		String indexDefinition=request.getParameter("indexDefinition");
		String dateSources=request.getParameter("dateSources");
		String computationalFormula=request.getParameter("computationalFormula");
		String annualObjectives=request.getParameter("annualObjectives");
		String quarterlyAccounting=request.getParameter("quarterlyAccounting");
		String currentTarget=request.getParameter("currentTarget");
		String currentReality=request.getParameter("currentReality");
		String currentYieldRate=request.getParameter("currentYieldRate");
		String currentScore=request.getParameter("currentScore");
		Kpiindex kpiindex=new Kpiindex(kpiIndexName,moduleID,postID,weight,span,indexDefinition,dateSources,
				computationalFormula,annualObjectives,quarterlyAccounting,currentTarget,currentReality,
				currentYieldRate,currentScore);
		KPIindexDaoImpl kpIindexDaoImpl=new KPIindexDaoImpl();
		boolean flag=kpIindexDaoImpl.addKPIindex(kpiindex);
		String message="";
		if(flag){
			message="添加成功";
			request.setAttribute("message", message);
			request.getRequestDispatcher("system-base.jsp").forward(request, response);
		}else{
			message="添加失败";
			request.setAttribute("message", message);
			request.getRequestDispatcher("system-base.jsp").forward(request, response);
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

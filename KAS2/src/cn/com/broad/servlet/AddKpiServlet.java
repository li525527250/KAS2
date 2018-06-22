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
 * Servlet implementation class AddKpiServlet 添加KP指标Servlet
 */
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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		String kpiIndexName = request.getParameter("kpiindexName");//获取KPI指标ID
		int moduleID = Integer.parseInt(request.getParameter("search_systemKey1"));//获取KPI指标模块
		int postID = Integer.parseInt(request.getParameter("search_moduleKey"));//获取岗位ID
		String weight = request.getParameter("weight");//获取权重
		String span = request.getParameter("span");//获取取值范围
		String indexDefinition = request.getParameter("indexDefinition");//获取指标释意
		String dateSources = request.getParameter("dateSources");//获取数据来源
		String computationalFormula = request.getParameter("computationalFormula");//获取计算公式
		String annualObjectives = request.getParameter("annualObjectives");//获取季度考核
		String quarterlyAccounting = request.getParameter("quarterlyAccounting");//获取年度目标
		String currentTarget = request.getParameter("currentTarget");//获取当期目标
		String currentReality = request.getParameter("currentReality");//获取当期实际
		String currentYieldRate = request.getParameter("currentYieldRate");//获取当期达成率
		String currentScore = request.getParameter("currentScore");//获取当期得分
		Kpiindex kpiindex = new Kpiindex(kpiIndexName, moduleID, postID, weight, span, indexDefinition, dateSources,
				computationalFormula, annualObjectives, quarterlyAccounting, currentTarget, currentReality,
				currentYieldRate, currentScore);//KPI指标实体类
		KPIindexDaoImpl kpIindexDaoImpl = new KPIindexDaoImpl();
		boolean flag = kpIindexDaoImpl.addKPIindex(kpiindex);//添加KPI指标
		String message = "";//添加成功失败返回消息
		if (flag) {
			message = "添加成功";
			request.setAttribute("message", message);
			request.getRequestDispatcher("SelectDepartmentAllServletToAddKpi").forward(request, response);
		} else {
			message = "添加失败";
			request.setAttribute("message", message);
			request.getRequestDispatcher("SelectDepartmentAllServletToAddKpi").forward(request, response);
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

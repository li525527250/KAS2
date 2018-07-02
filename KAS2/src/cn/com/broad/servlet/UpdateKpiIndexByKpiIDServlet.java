package cn.com.broad.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.com.broad.entity.Kpiindex;
import cn.com.broad.impl.KPIindexDaoImpl;

/**
 * Servlet implementation class UpdateKpiIndexByKpiIDServlet
 */
public class UpdateKpiIndexByKpiIDServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UpdateKpiIndexByKpiIDServlet() {
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
		int kpiindexID = Integer.parseInt(request.getParameter("kpiindexID"));
		String kpiIndexName = request.getParameter("kpiindexName");
		kpiIndexName = new String(kpiIndexName.getBytes("ISO-8859-1"), "UTF-8");
		int postID = Integer.parseInt(request.getParameter("search_moduleKey"));
		String weight = request.getParameter("weight");
		weight = new String(weight.getBytes("ISO-8859-1"), "UTF-8");
		String span = request.getParameter("span");
		span = new String(span.getBytes("ISO-8859-1"), "UTF-8");
		String indexDefinition = request.getParameter("indexDefinition");
		indexDefinition = new String(indexDefinition.getBytes("ISO-8859-1"), "UTF-8");
		String dateSources = request.getParameter("dateSources");
		dateSources = new String(dateSources.getBytes("ISO-8859-1"), "UTF-8");
		String computationalFormula = request.getParameter("computationalFormula");
		computationalFormula = new String(computationalFormula.getBytes("ISO-8859-1"), "UTF-8");
		String annualObjectives = request.getParameter("annualObjectives");
		annualObjectives = new String(annualObjectives.getBytes("ISO-8859-1"), "UTF-8");
		String quarterlyAccounting = request.getParameter("quarterlyAccounting");
		quarterlyAccounting = new String(quarterlyAccounting.getBytes("ISO-8859-1"), "UTF-8");
		String currentTarget = request.getParameter("currentTarget");
		currentTarget = new String(currentTarget.getBytes("ISO-8859-1"), "UTF-8");
		Kpiindex kpiindex = new Kpiindex(kpiindexID, kpiIndexName, postID, weight, span, indexDefinition, dateSources,
				computationalFormula, annualObjectives, quarterlyAccounting, currentTarget);
		KPIindexDaoImpl kpIindexDaoImpl = new KPIindexDaoImpl();
		boolean flag = kpIindexDaoImpl.updateKPIindex(kpiindex);
		String message = "";
		if (flag) {
			message = "修改成功";
			request.setAttribute("message", message);
			request.getRequestDispatcher("SelectDepartmentAllToUpdateServlet?kpiID="+kpiindexID).forward(request, response);
		} else {
			message = "修改失败";
			request.setAttribute("message", message);
			request.getRequestDispatcher("SelectDepartmentAllToUpdateServlet?kpiID="+kpiindexID).forward(request, response);
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

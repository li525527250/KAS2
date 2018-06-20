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

import com.google.gson.Gson;

import cn.com.broad.entity.Kpiindex;
import cn.com.broad.impl.KPIindexDaoImpl;
import net.sf.json.JSON;

/**
 * Servlet implementation class HideKpiIndexServlet
 */
public class HideKpiIndexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HideKpiIndexServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("delete----------");
		response.setContentType("text/html;charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		int kpiID= Integer.parseInt(request.getParameter("kpiID"));
		KPIindexDaoImpl kpIindexDaoImpl=new KPIindexDaoImpl();
		boolean flag= kpIindexDaoImpl.hideKpiIndex(kpiID);
		Gson gson=new Gson();
		String msg="";
		if(flag){
			msg="删除成功";
		}else{
			msg="删除失败";
		}
		String json= gson.toJson(msg);
		out.print(json);
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doGet(request, response);
	}

}

package cn.com.broad.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.util.SystemOutLogger;

import cn.com.broad.dao.BaseDao;
import cn.com.broad.dao.KpiIndexModuleDao;
import cn.com.broad.entity.KpiIndexModule;
import cn.com.broad.entity.Posts;

public class KpiIndexModuleDaoImp implements KpiIndexModuleDao {
	// 获取KPI模型
	@Override
	public List<KpiIndexModule> getKpiIndexModule() {
		// TODO Auto-generated method stub
		List<KpiIndexModule> list = new ArrayList<KpiIndexModule>();
		String sql = "SELECT d.departmentID,d.depaertmantName,p.postName,"
				+ "p.postID,m.moduleID,m.moduleName,k.KPAIndexID,k.KPAIndexName from"
				+ " kpiindex k INNER JOIN module m on k.moduleID = m.moduleID INNER JOIN"
				+ " posts p on p.postID = m.postID inner JOIN department d" + " on p.departmentID=d.departmentID";
		Connection con = BaseDao.conn();
		Statement psta = null;
		ResultSet rs = null;
		try {
			psta = con.createStatement();
			rs = psta.executeQuery(sql);
			while (rs.next()) {
				KpiIndexModule kpiIndexModule = new KpiIndexModule();
				kpiIndexModule.setDepartmentID(rs.getInt(1));
				kpiIndexModule.setDepaertmantName(rs.getString(2));
				kpiIndexModule.setPostName(rs.getString(3));
				kpiIndexModule.setPostID(rs.getInt(4));
				kpiIndexModule.setModuleID(rs.getInt(5));
				kpiIndexModule.setModuleName(rs.getString(6));
				kpiIndexModule.setKPAIndexID(rs.getInt(7));
				kpiIndexModule.setKPAIndexName(rs.getString(8));
				list.add(kpiIndexModule);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}

}

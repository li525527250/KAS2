package cn.com.broad.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import cn.com.broad.dao.BaseDao;
import cn.com.broad.dao.StaffKpiIndexModuleDao;
import cn.com.broad.entity.StaffKpiIndexModule;

public class StaffKpiIndexModuleDaoImpl implements StaffKpiIndexModuleDao{

	@Override
	public List<StaffKpiIndexModule> getStaffKpiIndexModule() {
		// TODO Auto-generated method stub
		List<StaffKpiIndexModule> list = new ArrayList<StaffKpiIndexModule>();
		String sql = "SELECT s.staffName,s.staffID,s.StaffJobNumber"
				+ ",m.moduleName,m.moduleID,k.KPAIndexName,k.KPAIndexID"
				+ " from staff s INNER join module m on s.postID = m.postID"
				+ " INNER JOIN kpiindex k on m.moduleID = k.moduleID";
		Connection con = BaseDao.conn();
		Statement psta = null;
		ResultSet rs = null;
		try {
			psta = con.createStatement();
			rs = psta.executeQuery(sql);
			while (rs.next()) {
				StaffKpiIndexModule kpiIndexModule = new StaffKpiIndexModule();
				kpiIndexModule.setStaffName(rs.getString(1));
				kpiIndexModule.setStaffID(rs.getInt(2));
				kpiIndexModule.setStaffJobNumber(rs.getString(3));
				kpiIndexModule.setModuleName(rs.getString(4));
				kpiIndexModule.setModuleID(rs.getInt(5));
				kpiIndexModule.setKPAIndexName(rs.getString(6));
				kpiIndexModule.setKPAIndexID(rs.getInt(7));
				list.add(kpiIndexModule);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}

}

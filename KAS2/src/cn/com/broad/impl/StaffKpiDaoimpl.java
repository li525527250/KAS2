package cn.com.broad.impl;

import cn.com.broad.dao.BaseDao;
import cn.com.broad.dao.StaffKpiDao;
import cn.com.broad.entity.StaffKpi;

public class StaffKpiDaoimpl implements StaffKpiDao{

	@Override
	public boolean addStaffKpi(StaffKpi staffKpi) {
		// TODO Auto-generated method stub
		String sql = "insert into staffkpiindex VALUES(null,?,?,?,?,?,?,?,?)";
		Object[] args = new Object[] { staffKpi.getStaffID(),staffKpi.getModuleID(),
				staffKpi.getKpiindexID(),staffKpi.getCurrentReality(),staffKpi.getCurrentYieldRate(),staffKpi.getCurrentScore()
				,staffKpi.getDate(),staffKpi.getKpiExamineDatePeriodID()};
		return BaseDao.executeUpdate(sql, args);
	}

}

package cn.com.broad.dao;

import java.util.List;

import cn.com.broad.entity.StaffKpiIndex;

/*
 * 员工KPI指标接口
 * */
public interface StaffKpiIndexDao {
	// ͨ通过员工工号查询员工KPI指标
	public List<StaffKpiIndex> getStaffKpiIndexByStaffBobNumber(String staffBobNumber);
}

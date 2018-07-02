package cn.com.broad.dao;

import java.util.List;

import cn.com.broad.entity.StaffKpiIndexModule;
/*
 * 员工KPI指标模板Dao类
 * */
public interface StaffKpiIndexModuleDao {
	public List<StaffKpiIndexModule> getStaffKpiIndexModule();//查询所有员KPI指标模板数据
}

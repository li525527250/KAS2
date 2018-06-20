package cn.com.broad.dao;

import java.util.List;

import cn.com.broad.entity.Kpiindex;

/*
 * KPI指标接口
 * */
public interface KPIindexDao {
	public boolean addKPIindex(Kpiindex kpiindex);// 添加KPI指标

	public boolean deleteKPIindex(int kpiindexID);// 通过KPI指标ID删除KPI指标

	public boolean updateKPIindex(Kpiindex kpiindex);// 通过KPI指标ID修改KPI指标

	public List<Kpiindex> getAllKPIindex();// 获取所有KPI指标

	public List<Kpiindex> getKPIindexByPostID(int postID);// ͨ通过岗位ID获取KPI指标

	public boolean hideKpiIndex(int kpiindexID);// 通过KPI指标ID隐藏某个KPI指标

	public Kpiindex getKpiIndexByKpiID(int kpiID);// 通过KPI指标ID获取某个KPI指标详情

}

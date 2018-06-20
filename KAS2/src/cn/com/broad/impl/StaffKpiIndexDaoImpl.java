package cn.com.broad.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import cn.com.broad.dao.BaseDao;
import cn.com.broad.dao.StaffKpiIndexDao;
import cn.com.broad.entity.StaffKpiIndex;

/*
 * 员工KPI实现类
 * */
public class StaffKpiIndexDaoImpl implements StaffKpiIndexDao {
	// ͨ通过员工工号获取员工KPI指标
	@Override
	public List<StaffKpiIndex> getStaffKpiIndexByStaffBobNumber(String staffBobNumber) {
		// TODO Auto-generated method stub
		List<StaffKpiIndex> list = new ArrayList<StaffKpiIndex>();
		String sql = "SELECT s.staffName,p.postName,m.moduleName,k.KPAIndexName,"
				+ "k.weight,k.span,k.indexDefinition,k.dateSources,k.computationalFormula,"
				+ "k.annualObjectives,k.quarterlyAccounting,k.currentTarget,k.currentReality"
				+ ",k.currentYieldRate,k.currentScore from kpiindex k"
				+ " INNER JOIN module m on k.moduleID = m.moduleID INNER JOIN"
				+ " posts p on p.postID = m.postID inner JOIN staff s on s.postID=m.postID WHERE s.StaffJobNumber=?";
		Connection con = BaseDao.conn();
		PreparedStatement psta = null;
		ResultSet rs = null;
		try {
			psta = con.prepareStatement(sql);
			psta.setString(1, staffBobNumber);
			rs = psta.executeQuery();
			while (rs.next()) {
				StaffKpiIndex staffKpiIndex = new StaffKpiIndex();
				staffKpiIndex.setStaffName(rs.getString(1));
				staffKpiIndex.setPostName(rs.getString(2));
				staffKpiIndex.setModuleName(rs.getString(3));
				staffKpiIndex.setKpiIndexName(rs.getString(4));
				staffKpiIndex.setWeight(rs.getString(5));
				staffKpiIndex.setSpan(rs.getString(6));
				staffKpiIndex.setIndexDefinition(rs.getString(7));
				staffKpiIndex.setDateSources(rs.getString(8));
				staffKpiIndex.setComputationalFormula(rs.getString(9));
				staffKpiIndex.setAnnualObjectives(rs.getString(10));
				staffKpiIndex.setQuarterlyAccounting(rs.getString(11));
				staffKpiIndex.setCurrentTarget(rs.getString(12));
				staffKpiIndex.setCurrentReality(rs.getString(13));
				staffKpiIndex.setCurrentYieldRate(rs.getString(14));
				staffKpiIndex.setCurrentScore(rs.getString(15));
				list.add(staffKpiIndex);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}

}

package cn.com.broad.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import cn.com.broad.dao.BaseDao;
import cn.com.broad.dao.KpiExamineDatePeriodDao;
import cn.com.broad.entity.Department;
import cn.com.broad.entity.KpiExamineDatePeriod;

public class KpiExamineDatePeriodDaoImpl implements KpiExamineDatePeriodDao{

	@Override
	public List<KpiExamineDatePeriod> getKpiExamineDatePeriod(int kpiExamineDateTypeID) {
		// TODO Auto-generated method stub
		List<KpiExamineDatePeriod> list = new ArrayList<KpiExamineDatePeriod>();
		String sql = "SELECT * from kpiexaminedateperiod where kpiExamineDateTypeID=?";
		Connection con = BaseDao.conn();
		PreparedStatement psta = null;
		ResultSet rs = null;
		try {
			psta = con.prepareStatement(sql);
			psta.setInt(1, kpiExamineDateTypeID);
			rs = psta.executeQuery();
			while (rs.next()) {
				KpiExamineDatePeriod kpiExamineDatePeriod = new KpiExamineDatePeriod();
				kpiExamineDatePeriod.setKpiExamineDatePeriodID(rs.getInt(1));
				kpiExamineDatePeriod.setKpiExamineDatePeriodName(rs.getString(2));
				kpiExamineDatePeriod.setKpiExamineDateTypeID(rs.getInt(3));
				list.add(kpiExamineDatePeriod);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}

}

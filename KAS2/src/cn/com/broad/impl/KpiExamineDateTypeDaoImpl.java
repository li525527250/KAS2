package cn.com.broad.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import cn.com.broad.dao.BaseDao;
import cn.com.broad.dao.KpiExamineDateTypeDao;
import cn.com.broad.entity.Department;
import cn.com.broad.entity.KpiExamineDateType;

public class KpiExamineDateTypeDaoImpl implements KpiExamineDateTypeDao{

	@Override
	public List<KpiExamineDateType> getExamineDateTypes() {
		// TODO Auto-generated method stub
		List<KpiExamineDateType> list = new ArrayList<KpiExamineDateType>();
		String sql = "SELECT * from kpiexaminedatetype";
		Connection con = BaseDao.conn();
		Statement psta = null;
		ResultSet rs = null;
		try {
			psta = con.createStatement();
			rs = psta.executeQuery(sql);
			while (rs.next()) {
				KpiExamineDateType kpiExamineDateType = new KpiExamineDateType();
				kpiExamineDateType.setKpiExamineDateTypeID(rs.getInt(1));
				kpiExamineDateType.setKpiExamineDateTypeName(rs.getString(2));
				list.add(kpiExamineDateType);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}

}

package cn.com.broad.dao;

import java.util.List;

import cn.com.broad.entity.KpiExamineDatePeriod;

public interface KpiExamineDatePeriodDao {
	public List<KpiExamineDatePeriod> getKpiExamineDatePeriod(int kpiExamineDateTypeID);
}

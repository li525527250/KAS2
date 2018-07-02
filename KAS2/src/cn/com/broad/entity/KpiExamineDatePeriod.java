package cn.com.broad.entity;

public class KpiExamineDatePeriod {
	private int kpiExamineDatePeriodID;
	private String kpiExamineDatePeriodName;
	private int kpiExamineDateTypeID;
	public int getKpiExamineDatePeriodID() {
		return kpiExamineDatePeriodID;
	}
	public void setKpiExamineDatePeriodID(int kpiExamineDatePeriodID) {
		this.kpiExamineDatePeriodID = kpiExamineDatePeriodID;
	}
	public String getKpiExamineDatePeriodName() {
		return kpiExamineDatePeriodName;
	}
	public void setKpiExamineDatePeriodName(String kpiExamineDatePeriodName) {
		this.kpiExamineDatePeriodName = kpiExamineDatePeriodName;
	}
	public int getKpiExamineDateTypeID() {
		return kpiExamineDateTypeID;
	}
	public void setKpiExamineDateTypeID(int kpiExamineDateTypeID) {
		this.kpiExamineDateTypeID = kpiExamineDateTypeID;
	}
	public KpiExamineDatePeriod(int kpiExamineDatePeriodID, String kpiExamineDatePeriodName, int kpiExamineDateTypeID) {
		super();
		this.kpiExamineDatePeriodID = kpiExamineDatePeriodID;
		this.kpiExamineDatePeriodName = kpiExamineDatePeriodName;
		this.kpiExamineDateTypeID = kpiExamineDateTypeID;
	}
	public KpiExamineDatePeriod() {
		super();
	}
	@Override
	public String toString() {
		return "KpiExamineDatePeriod [kpiExamineDatePeriodID=" + kpiExamineDatePeriodID + ", kpiExamineDatePeriodName="
				+ kpiExamineDatePeriodName + ", kpiExamineDateTypeID=" + kpiExamineDateTypeID + "]";
	}
	
}

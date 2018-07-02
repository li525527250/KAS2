package cn.com.broad.entity;

public class KpiExamineDateType {
	private int kpiExamineDateTypeID;
	private String kpiExamineDateTypeName;
	public int getKpiExamineDateTypeID() {
		return kpiExamineDateTypeID;
	}
	public void setKpiExamineDateTypeID(int kpiExamineDateTypeID) {
		this.kpiExamineDateTypeID = kpiExamineDateTypeID;
	}
	public String getKpiExamineDateTypeName() {
		return kpiExamineDateTypeName;
	}
	public void setKpiExamineDateTypeName(String kpiExamineDateTypeName) {
		this.kpiExamineDateTypeName = kpiExamineDateTypeName;
	}
	public KpiExamineDateType(int kpiExamineDateTypeID, String kpiExamineDateTypeName) {
		super();
		this.kpiExamineDateTypeID = kpiExamineDateTypeID;
		this.kpiExamineDateTypeName = kpiExamineDateTypeName;
	}
	public KpiExamineDateType() {
		super();
	}
	@Override
	public String toString() {
		return "KpiExamineDateType [kpiExamineDateTypeID=" + kpiExamineDateTypeID + ", kpiExamineDateTypeName="
				+ kpiExamineDateTypeName + "]";
	}
	
}

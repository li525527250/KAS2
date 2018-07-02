package cn.com.broad.entity;
/*
 * 员工KPI指标
 * */
public class StaffKpi {
	private int staffKpiIndexID;//员工KPI指标ID
	private int staffID;//员工ID
	private String staffJobNunmber;//员工工号
	private int moduleID;//模块ID
	private int kpiindexID;//KPI指标ID
	private String currentReality;//当期实际
	private String currentYieldRate;//当期达成率
	private double currentScore;//当期得分
	private String date;
	private int kpiExamineDatePeriodID;
	
	public StaffKpi(int staffKpiIndexID, int staffID, String staffJobNunmber, int moduleID, int kpiindexID,
			String currentReality, String currentYieldRate, double currentScore, String date,
			int kpiExamineDatePeriodID) {
		super();
		this.staffKpiIndexID = staffKpiIndexID;
		this.staffID = staffID;
		this.staffJobNunmber = staffJobNunmber;
		this.moduleID = moduleID;
		this.kpiindexID = kpiindexID;
		this.currentReality = currentReality;
		this.currentYieldRate = currentYieldRate;
		this.currentScore = currentScore;
		this.date = date;
		this.kpiExamineDatePeriodID = kpiExamineDatePeriodID;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getKpiExamineDatePeriodID() {
		return kpiExamineDatePeriodID;
	}
	public void setKpiExamineDatePeriodID(int kpiExamineDatePeriodID) {
		this.kpiExamineDatePeriodID = kpiExamineDatePeriodID;
	}
	public int getStaffKpiIndexID() {
		return staffKpiIndexID;
	}
	public void setStaffKpiIndexID(int staffKpiIndexID) {
		this.staffKpiIndexID = staffKpiIndexID;
	}
	public int getStaffID() {
		return staffID;
	}
	public void setStaffID(int staffID) {
		this.staffID = staffID;
	}
	public int getModuleID() {
		return moduleID;
	}
	public void setModuleID(int moduleID) {
		this.moduleID = moduleID;
	}
	public int getKpiindexID() {
		return kpiindexID;
	}
	public void setKpiindexID(int kpiindexID) {
		this.kpiindexID = kpiindexID;
	}
	public String getCurrentReality() {
		return currentReality;
	}
	public void setCurrentReality(String currentReality) {
		this.currentReality = currentReality;
	}
	public String getCurrentYieldRate() {
		return currentYieldRate;
	}
	public void setCurrentYieldRate(String currentYieldRate) {
		this.currentYieldRate = currentYieldRate;
	}
	public double getCurrentScore() {
		return currentScore;
	}
	public void setCurrentScore(double currentScore) {
		this.currentScore = currentScore;
	}
	public StaffKpi(int staffKpiIndexID, int staffID, int moduleID, int kpiindexID, String currentReality,
			String currentYieldRate, double currentScore) {
		super();
		this.staffKpiIndexID = staffKpiIndexID;
		this.staffID = staffID;
		this.moduleID = moduleID;
		this.kpiindexID = kpiindexID;
		this.currentReality = currentReality;
		this.currentYieldRate = currentYieldRate;
		this.currentScore = currentScore;
	}
	
	public String getStaffJobNunmber() {
		return staffJobNunmber;
	}
	public void setStaffJobNunmber(String staffJobNunmber) {
		this.staffJobNunmber = staffJobNunmber;
	}
	public StaffKpi(int staffID, int moduleID,String staffJobNunmber, int kpiindexID, String currentReality, String currentYieldRate,
			double currentScore) {
		super();
		this.staffJobNunmber=staffJobNunmber;
		this.staffID = staffID;
		this.moduleID = moduleID;
		this.kpiindexID = kpiindexID;
		this.currentReality = currentReality;
		this.currentYieldRate = currentYieldRate;
		this.currentScore = currentScore;
	}
	
	public StaffKpi() {
		super();
	}
	@Override
	public String toString() {
		return "StaffKpi [staffKpiIndexID=" + staffKpiIndexID + ", staffID=" + staffID + ", staffJobNunmber="
				+ staffJobNunmber + ", moduleID=" + moduleID + ", kpiindexID=" + kpiindexID + ", currentReality="
				+ currentReality + ", currentYieldRate=" + currentYieldRate + ", currentScore=" + currentScore
				+ ", date=" + date + ", kpiExamineDatePeriodID=" + kpiExamineDatePeriodID + "]";
	}
	
	
}

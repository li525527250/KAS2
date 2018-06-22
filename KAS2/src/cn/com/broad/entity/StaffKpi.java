package cn.com.broad.entity;

public class StaffKpi {
	private int staffKpiIndexID;
	private int staffID;
	private String staffJobNunmber;
	private int moduleID;
	private int kpiindexID;
	private String currentReality;
	private String currentYieldRate;
	private double currentScore;
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
				+ currentReality + ", currentYieldRate=" + currentYieldRate + ", currentScore=" + currentScore + "]";
	}
	
}

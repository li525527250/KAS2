package cn.com.broad.entity;

public class StaffKpiIndexModule {
	private String staffName;
	private int staffID;
	private String StaffJobNumber;
	private String moduleName;
	private int moduleID;
	private String KPAIndexName;
	private int KPAIndexID;
	public String getStaffName() {
		return staffName;
	}
	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}
	public int getStaffID() {
		return staffID;
	}
	public void setStaffID(int staffID) {
		this.staffID = staffID;
	}
	public String getStaffJobNumber() {
		return StaffJobNumber;
	}
	public void setStaffJobNumber(String staffJobNumber) {
		StaffJobNumber = staffJobNumber;
	}
	public String getModuleName() {
		return moduleName;
	}
	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}
	public int getModuleID() {
		return moduleID;
	}
	public void setModuleID(int moduleID) {
		this.moduleID = moduleID;
	}
	public String getKPAIndexName() {
		return KPAIndexName;
	}
	public void setKPAIndexName(String kPAIndexName) {
		KPAIndexName = kPAIndexName;
	}
	public int getKPAIndexID() {
		return KPAIndexID;
	}
	public void setKPAIndexID(int kPAIndexID) {
		KPAIndexID = kPAIndexID;
	}
	public StaffKpiIndexModule(String staffName, int staffID, String staffJobNumber, String moduleName, int moduleID,
			String kPAIndexName, int kPAIndexID) {
		super();
		this.staffName = staffName;
		this.staffID = staffID;
		StaffJobNumber = staffJobNumber;
		this.moduleName = moduleName;
		this.moduleID = moduleID;
		KPAIndexName = kPAIndexName;
		KPAIndexID = kPAIndexID;
	}
	@Override
	public String toString() {
		return "StaffKpiIndexModule [staffName=" + staffName + ", staffID=" + staffID + ", StaffJobNumber="
				+ StaffJobNumber + ", moduleName=" + moduleName + ", moduleID=" + moduleID + ", KPAIndexName="
				+ KPAIndexName + ", KPAIndexID=" + KPAIndexID + "]";
	}
	public StaffKpiIndexModule() {
		super();
	}
	
}

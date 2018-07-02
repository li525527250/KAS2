package cn.com.broad.entity;

/*
 * 员工个人KPI指标模板
 * */
public class StaffKpiIndexModule {
	private String staffName;//员工名字
	private int staffID;//员工ID
	private String StaffJobNumber;//员工工号
	private String moduleName;//模板名称
	private int moduleID;//模板ID
	private String KPAIndexName;//KPI指标名称
	private int KPAIndexID;//KPI指标ID
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

package cn.com.broad.entity;

/*
 * KPI指标模型类
 * */
public class KpiIndexModule {
	private int departmentID;// 部门ID
	private String depaertmantName;// 部门名称
	private String postName;// 岗位名称
	private int postID;// 岗位ID
	private int moduleID;// 模块ID
	private String moduleName;// 模块名称
	private int KPAIndexID;// KPI指标ID
	private String KPAIndexName;// KPI指标名称

	public int getDepartmentID() {
		return departmentID;
	}

	public void setDepartmentID(int departmentID) {
		this.departmentID = departmentID;
	}

	public String getDepaertmantName() {
		return depaertmantName;
	}

	public void setDepaertmantName(String depaertmantName) {
		this.depaertmantName = depaertmantName;
	}

	public String getPostName() {
		return postName;
	}

	public void setPostName(String postName) {
		this.postName = postName;
	}

	public int getPostID() {
		return postID;
	}

	public void setPostID(int postID) {
		this.postID = postID;
	}

	public int getModuleID() {
		return moduleID;
	}

	public void setModuleID(int moduleID) {
		this.moduleID = moduleID;
	}

	public String getModuleName() {
		return moduleName;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}

	public int getKPAIndexID() {
		return KPAIndexID;
	}

	public void setKPAIndexID(int kPAIndexID) {
		KPAIndexID = kPAIndexID;
	}

	public String getKPAIndexName() {
		return KPAIndexName;
	}

	public void setKPAIndexName(String kPAIndexName) {
		KPAIndexName = kPAIndexName;
	}

	@Override
	public String toString() {
		return "KpiIndexModule [departmentID=" + departmentID + ", depaertmantName=" + depaertmantName + ", postName="
				+ postName + ", postID=" + postID + ", moduleID=" + moduleID + ", moduleName=" + moduleName
				+ ", KPAIndexID=" + KPAIndexID + ", KPAIndexName=" + KPAIndexName + "]";
	}

	public KpiIndexModule(int departmentID, String depaertmantName, String postName, int postID, int moduleID,
			String moduleName, int kPAIndexID, String kPAIndexName) {
		super();
		this.departmentID = departmentID;
		this.depaertmantName = depaertmantName;
		this.postName = postName;
		this.postID = postID;
		this.moduleID = moduleID;
		this.moduleName = moduleName;
		KPAIndexID = kPAIndexID;
		KPAIndexName = kPAIndexName;
	}

	public KpiIndexModule() {
		super();
	}

}

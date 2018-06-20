package cn.com.broad.entity;

/*
 * 部门类
 * */
public class Department {
	private int departmentID;// 部门ID
	private String depaertmantName;// 部门名称
	private int companyID;// 公司ID
	private int ifDelete;// 是否删除1--隐藏，0---显示

	public int getIfDelete() {
		return ifDelete;
	}

	public void setIfDelete(int ifDelete) {
		this.ifDelete = ifDelete;
	}

	public int getCompanyID() {
		return companyID;
	}

	public void setCompanyID(int companyID) {
		this.companyID = companyID;
	}

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

	public Department(int departmentID, String depaertmantName, int companyID, int ifDelete) {
		super();
		this.departmentID = departmentID;
		this.depaertmantName = depaertmantName;
		this.companyID = companyID;
		this.ifDelete = ifDelete;
	}

	public Department() {
		super();
	}

}

package cn.com.broad.entity;

/*
 * 员工类
 */
public class Staff {
	private int staffID;// 员工ID
	private String staffName;// 员工名称
	private String StaffJobNumber;// 员工工号
	private int postID;// 岗位ID
	private int companyID;// 公司ID

	public int getStaffID() {
		return staffID;
	}

	public void setStaffID(int staffID) {
		this.staffID = staffID;
	}

	public String getStaffName() {
		return staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	public String getStaffJobNumber() {
		return StaffJobNumber;
	}

	public void setStaffJobNumber(String staffJobNumber) {
		StaffJobNumber = staffJobNumber;
	}

	public int getPostID() {
		return postID;
	}

	public void setPostID(int postID) {
		this.postID = postID;
	}

	public int getCompanyID() {
		return companyID;
	}

	public void setCompanyID(int companyID) {
		this.companyID = companyID;
	}

	public Staff(int staffID, String staffName, String staffJobNumber, int postID, int companyID) {
		super();
		this.staffID = staffID;
		this.staffName = staffName;
		StaffJobNumber = staffJobNumber;
		this.postID = postID;
		this.companyID = companyID;
	}

	public Staff() {
		super();
	}

}

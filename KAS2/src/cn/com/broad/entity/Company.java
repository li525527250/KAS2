package cn.com.broad.entity;

/*
 * 公司类
 * */
public class Company {
	private int companyID;// 公司ID
	private String companyName;// 公司名称
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

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Company(int companyID, String companyName, int ifDelete) {
		super();
		this.companyID = companyID;
		this.companyName = companyName;
		this.ifDelete = ifDelete;
	}

	public Company() {
		super();
	}

}

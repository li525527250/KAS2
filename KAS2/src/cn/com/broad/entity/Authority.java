package cn.com.broad.entity;

/*
 * 权限类
 * */
public class Authority {
	private int authorityID;// 权限ID
	private String authorityName;// 权限名称

	public int getAuthorityID() {
		return authorityID;
	}

	public void setAuthorityID(int authorityID) {
		this.authorityID = authorityID;
	}

	public String getAuthorityName() {
		return authorityName;
	}

	public void setAuthorityName(String authorityName) {
		this.authorityName = authorityName;
	}

	public Authority(int authorityID, String authorityName) {
		super();
		this.authorityID = authorityID;
		this.authorityName = authorityName;
	}

	public Authority() {
		super();
	}

}

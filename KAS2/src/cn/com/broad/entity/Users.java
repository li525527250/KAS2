package cn.com.broad.entity;

/*
 * 用户表
 * */
public class Users {
	private int userID;// 用户ID
	private String userName;// 用户名称
	private String userPassword;// 用户密码
	private int authorityID;// 权限ID

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public int getAuthorityID() {
		return authorityID;
	}

	public void setAuthorityID(int authorityID) {
		this.authorityID = authorityID;
	}

	public Users(int userID, String userName, String userPassword, int authorityID) {
		super();
		this.userID = userID;
		this.userName = userName;
		this.userPassword = userPassword;
		this.authorityID = authorityID;
	}

	public Users() {
		super();
	}

	public Users(String userName, String userPassword, int authorityID) {
		super();
		this.userName = userName;
		this.userPassword = userPassword;
		this.authorityID = authorityID;
	}

	public Users(String userName, String userPassword) {
		super();
		this.userName = userName;
		this.userPassword = userPassword;
	}

	@Override
	public String toString() {
		return "Users [userID=" + userID + ", userName=" + userName + ", userPassword=" + userPassword
				+ ", authorityID=" + authorityID + "]";
	}

}

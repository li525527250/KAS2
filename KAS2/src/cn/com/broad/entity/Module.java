package cn.com.broad.entity;

/*
 * 模块类
 * */
public class Module {
	private int moduleID;// 模板ID
	private String moduleName;// 模板名称
	private int postID;// 岗位ID
	private int ifDelete;// 是否删除1--隐藏，0---显示

	public int getIfDelete() {
		return ifDelete;
	}

	public void setIfDelete(int ifDelete) {
		this.ifDelete = ifDelete;
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

	public int getPostID() {
		return postID;
	}

	public void setPostID(int postID) {
		this.postID = postID;
	}

	public Module(int moduleID, String moduleName, int postID, int ifdelete) {
		super();
		this.moduleID = moduleID;
		this.moduleName = moduleName;
		this.postID = postID;
		this.ifDelete = ifdelete;
	}

	public Module() {
		super();
	}

}

package cn.com.broad.dao;

import java.util.List;

import cn.com.broad.entity.Module;

/*
 * 模块接口
 * */
public interface ModuleDao {
	public boolean addModule(Module module);// 添加模块

	public boolean deleteModule(int moduleID);// 通过模块ID删除某一个模块

	public boolean updateModule(Module module);// 修改某一个模块

	public List<Module> getAllModule();// 获取所有模块

	public List<Module> getModuleByPostID(int postId);// ͨ通过岗位ID获取模块ID
}

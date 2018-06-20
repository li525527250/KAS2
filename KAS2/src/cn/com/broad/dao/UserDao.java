package cn.com.broad.dao;

import cn.com.broad.entity.Users;

/*
 *用户接口 
 * */
public interface UserDao {
	public boolean addUser(Users users);// 添加用户

	public boolean deleteUser(int userID);// 铜鼓用户iD删除某个用户

	public boolean updateUserpwd(Users users);// 修改用户密码

	public boolean loginUser(Users users);// 登录用户
}

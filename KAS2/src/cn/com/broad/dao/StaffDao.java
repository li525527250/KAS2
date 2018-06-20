package cn.com.broad.dao;

import java.util.List;

import cn.com.broad.entity.Staff;

/*
 * 员工接口
 * */
public interface StaffDao {
	public boolean addStaff(Staff staff);// 添加员工

	public boolean deleteStaff(int staffID);// 通过员工ID删除员工

	public boolean updateStaff(Staff staff);// 修改员工

	public List<Staff> getAllStaff();// 获取所有员工

	public List<Staff> getStaffByPostID(int postId);// ͨ通过岗位ID获取员工
}

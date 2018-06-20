package cn.com.broad.dao;

import java.util.List;

import cn.com.broad.entity.Staffscore;

/*
 * 员工得分接口
 * */
public interface StaffScoreDao {
	public boolean addStaffScore(Staffscore staffscore);// 添加员工的分

	public boolean deleteStaffScore(int staffID);// 通过员工ID删除员工得分

	public boolean updateStaffScore(Staffscore staff);// 修改员工得分

	public List<Staffscore> getAllStaffScore();// 获取所有员工得分

	public Staffscore getStaffscoreByStaffID(String staffjobnumber);// ͨ通过员工工号获取员工得分详情
}

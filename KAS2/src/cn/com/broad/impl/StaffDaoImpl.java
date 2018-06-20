package cn.com.broad.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import cn.com.broad.dao.BaseDao;
import cn.com.broad.dao.StaffDao;
import cn.com.broad.entity.Staff;

/*
 * 员工实现类
 * */
public class StaffDaoImpl implements StaffDao {
	// 添加员工
	@Override
	public boolean addStaff(Staff staff) {
		// TODO Auto-generated method stub
		String sql = "insert into staff VALUES(null,?,?,?,?)";
		Object[] args = new Object[] { staff.getStaffName(), staff.getStaffJobNumber(), staff.getPostID(),
				staff.getCompanyID() };
		return BaseDao.executeUpdate(sql, args);
	}

	// 通过员工id删除员工
	@Override
	public boolean deleteStaff(int staffID) {
		// TODO Auto-generated method stub
		String sql = "DELETE from staff WHERE staff.staffID=?";
		Object[] args = new Object[] { staffID };
		return BaseDao.executeUpdate(sql, args);
	}

	// 修改员工
	@Override
	public boolean updateStaff(Staff staff) {
		// TODO Auto-generated method stub
		String sql = "UPDATE staff s set s.StaffJobNumber=?,s.StaffJobNumber=?,s.postID=?,s.companyID=? where s.staffID=?";
		Object[] args = new Object[] { staff.getStaffName(), staff.getStaffJobNumber(), staff.getPostID(),
				staff.getCompanyID(), staff.getStaffID() };
		return BaseDao.executeUpdate(sql, args);
	}

	// 获取所有员工
	@Override
	public List<Staff> getAllStaff() {
		// TODO Auto-generated method stub
		List<Staff> list = new ArrayList<Staff>();
		String sql = "SELECT * from staff";
		Connection con = BaseDao.conn();
		Statement psta = null;
		ResultSet rs = null;
		try {
			psta = con.createStatement();
			rs = psta.executeQuery(sql);
			while (rs.next()) {
				Staff staff = new Staff();
				staff.setStaffID(rs.getInt(1));
				staff.setStaffName(rs.getString(2));
				staff.setStaffJobNumber(rs.getString(3));
				staff.setPostID(rs.getInt(4));
				staff.setCompanyID(rs.getInt(5));
				list.add(staff);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}

	// 通过岗位id获取员工
	@Override
	public List<Staff> getStaffByPostID(int postId) {
		// TODO Auto-generated method stub
		List<Staff> list = new ArrayList<Staff>();
		String sql = "SELECT * from staff where postId=?";
		Connection con = BaseDao.conn();
		PreparedStatement psta = null;
		ResultSet rs = null;
		try {
			psta = con.prepareStatement(sql);
			psta.setInt(1, postId);
			rs = psta.executeQuery();
			while (rs.next()) {
				Staff staff = new Staff();
				staff.setStaffID(rs.getInt(1));
				staff.setStaffName(rs.getString(2));
				staff.setStaffJobNumber(rs.getString(3));
				staff.setPostID(rs.getInt(4));
				staff.setCompanyID(rs.getInt(5));
				list.add(staff);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}

}

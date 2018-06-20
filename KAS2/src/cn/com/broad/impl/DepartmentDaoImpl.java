package cn.com.broad.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import cn.com.broad.dao.BaseDao;
import cn.com.broad.dao.DepartmentDao;
import cn.com.broad.entity.Department;

/*
 * 部门实现类
 * */
public class DepartmentDaoImpl implements DepartmentDao {
	// 添加部门
	@Override
	public boolean addDepartment(Department department) {
		// TODO Auto-generated method stub
		String sql = "insert into department VALUES(null,?,?,?)";
		Object[] args = new Object[] { department.getDepaertmantName(), department.getCompanyID(),
				department.getIfDelete() };
		return BaseDao.executeUpdate(sql, args);
	}

	// 通过部门ID删除部门
	@Override
	public boolean deleteDepartment(int departmentID) {
		// TODO Auto-generated method stub
		String sql = "DELETE FROM department WHERE department.companyID=?";
		Object[] args = new Object[] { departmentID };
		return BaseDao.executeUpdate(sql, args);
	}

	// 修改部门详情
	@Override
	public boolean updateDepartment(Department department) {
		// TODO Auto-generated method stub
		String sql = "UPDATE department set depaertmantName=?,companyID=?,ifdelete=? WHERE departmentID=?";
		Object[] args = new Object[] { department.getDepaertmantName(), department.getCompanyID(),
				department.getIfDelete(), department.getDepartmentID() };
		return BaseDao.executeUpdate(sql, args);
	}

	// 获取所有部门
	@Override
	public List<Department> getDepertmentAll() {
		// TODO Auto-generated method stub
		List<Department> list = new ArrayList<Department>();
		String sql = "SELECT * from department";
		Connection con = BaseDao.conn();
		Statement psta = null;
		ResultSet rs = null;
		try {
			psta = con.createStatement();
			rs = psta.executeQuery(sql);
			while (rs.next()) {
				Department department = new Department();
				department.setDepartmentID(rs.getInt(1));
				department.setDepaertmantName(rs.getString(2));
				department.setCompanyID(rs.getInt(3));
				department.setIfDelete(rs.getInt(4));
				list.add(department);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}

	// 通过公司ID获取部门
	@Override
	public List<Department> getDepertmentByCompanyID(int companyID) {
		// TODO Auto-generated method stub
		List<Department> list = new ArrayList<Department>();
		String sql = "SELECT * from department where companyID=?";
		Connection con = BaseDao.conn();
		PreparedStatement psta = null;
		ResultSet rs = null;
		try {
			psta = con.prepareStatement(sql);
			psta.setInt(1, companyID);
			rs = psta.executeQuery();
			while (rs.next()) {
				Department department = new Department();
				department.setDepartmentID(rs.getInt(1));
				department.setDepaertmantName(rs.getString(2));
				department.setCompanyID(rs.getInt(3));
				department.setIfDelete(rs.getInt(4));
				list.add(department);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}

}

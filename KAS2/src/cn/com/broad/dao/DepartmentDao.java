package cn.com.broad.dao;

import java.util.List;

import cn.com.broad.entity.Department;

/*
 * 部门接口
 * */
public interface DepartmentDao {
	public boolean addDepartment(Department department);// 添加部门

	public boolean deleteDepartment(int departmentID);// 通过部门ID删除部门

	public boolean updateDepartment(Department department);// 修改部门

	public List<Department> getDepertmentAll();// 获取所有部门

	public List<Department> getDepertmentByCompanyID(int companyID);// ͨ通过公司ID获取该公司所有部门
}

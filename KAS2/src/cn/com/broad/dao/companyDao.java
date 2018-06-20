package cn.com.broad.dao;

import java.util.List;

import cn.com.broad.entity.Company;

/*
 * 公司接口
 * */
public interface companyDao {
	public boolean addCompany(Company companyVO);// 添加公司

	public boolean updateCompany(Company companyVO);// 修改公司

	public List<Company> getCompanyAll();// 查询所有公司

	public boolean deleteCompanyByID(String companyID);// 通过公司ID删除某一个公司
}

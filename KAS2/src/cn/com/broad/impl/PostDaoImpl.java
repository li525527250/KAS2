package cn.com.broad.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import cn.com.broad.dao.BaseDao;
import cn.com.broad.dao.PostsDao;
import cn.com.broad.entity.Posts;

/*
 * 岗位实现类
 * */
public class PostDaoImpl implements PostsDao {
	// 添加岗位
	@Override
	public boolean addPost(Posts posts) {
		// TODO Auto-generated method stub
		String sql = "insert into posts VALUES(null,?,?,?)";
		Object[] args = new Object[] { posts.getPostName(), posts.getDepartmentID(), posts.getIfDelete() };
		return BaseDao.executeUpdate(sql, args);
	}

	// 通过安慰iD删除岗位
	@Override
	public boolean deletePost(int postID) {
		// TODO Auto-generated method stub
		String sql = "DELETE from posts where posts.postID=?";
		Object[] args = new Object[] { postID };
		return BaseDao.executeUpdate(sql, args);
	}

	// 修改岗位
	@Override
	public boolean updatePost(Posts posts) {
		// TODO Auto-generated method stub
		String sql = "UPDATE posts p set p.postName=?,p.departmentID=?,p.ifdelete=? WHERE p.postID=?";
		Object[] args = new Object[] { posts.getPostName(), posts.getDepartmentID(), posts.getIfDelete(),
				posts.getPostID() };
		return BaseDao.executeUpdate(sql, args);
	}

	// 获取所有岗位
	@Override
	public List<Posts> getAllPost() {
		// TODO Auto-generated method stub
		List<Posts> list = new ArrayList<Posts>();
		String sql = "SELECT * from posts";
		Connection con = BaseDao.conn();
		Statement psta = null;
		ResultSet rs = null;
		try {
			psta = con.createStatement();
			rs = psta.executeQuery(sql);
			while (rs.next()) {
				Posts posts = new Posts();
				posts.setPostID(rs.getInt(1));
				posts.setPostName(rs.getString(2));
				posts.setDepartmentID(rs.getInt(3));
				posts.setIfDelete(rs.getInt(4));
				list.add(posts);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}

	// 通过部门ID获取岗位
	@Override
	public List<Posts> getPostByDepartmentId(int departmentID) {
		// TODO Auto-generated method stub
		List<Posts> list = new ArrayList<Posts>();
		String sql = "SELECT * from posts where departmentID=?";
		Connection con = BaseDao.conn();
		PreparedStatement psta = null;
		ResultSet rs = null;
		try {
			psta = con.prepareStatement(sql);
			psta.setInt(1, departmentID);
			rs = psta.executeQuery();
			while (rs.next()) {
				Posts posts = new Posts();
				posts.setPostID(rs.getInt(1));
				posts.setPostName(rs.getString(2));
				posts.setDepartmentID(rs.getInt(3));
				posts.setIfDelete(rs.getInt(4));
				list.add(posts);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}

}

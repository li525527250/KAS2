package cn.com.broad.dao;

import java.util.List;

import cn.com.broad.entity.Posts;

/*
 * 岗位接口
 * */
public interface PostsDao {
	public boolean addPost(Posts posts);// 添加岗位

	public boolean deletePost(int postID);// 通过岗位ID删除某一个岗位

	public boolean updatePost(Posts posts);// 修改某一个岗位详情

	public List<Posts> getAllPost();// 获取所有岗位

	public List<Posts> getPostByDepartmentId(int departmentID);// 通过部门ID获取岗位
}

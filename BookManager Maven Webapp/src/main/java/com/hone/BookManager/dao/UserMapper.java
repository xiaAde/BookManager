package com.hone.BookManager.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.hone.BookManager.database.User;

public interface UserMapper {
	
	/**
	 * 根据删除用户
	 * @param uid
	 * @return  删除的用户数
	 */
	int deleteByPrimaryKey(Long uid);
	
	/**
	 * 插入user
	 * @param record
	 * @return
	 */
	int insert(User record);
	
	/**
	 * 插入修改的用户
	 * @param record
	 * @return
	 */
	int insertSelective(User record);
	
	/**
	 * 根据uid查找用户
	 * @param uid
	 * @return
	 */
	User selectByPrimaryKey(Long uid);
	
	/**
	 * 更改选择的用户
	 * @param record
	 * @return
	 */
	int updateByPrimaryKeySelective(User record);
	
	/**
	 * 更新用户
	 * @param record
	 * @return
	 */
	int updateByPrimaryKey(User record);
	
	/**
	 * 根据登录名
	 * @param username
	 * @return
	 */
	User selectByLoginname(String username);
	
	/**
	 * 根据邮箱查找用户
	 * @param email
	 * @return
	 */
	User selectByEmail(String email);
	
	/**
	 * 根据uid查找该用户所有的信息
	 * @param uid
	 * @return
	 */
//	UserDetailInfo selectDetailByUid(Long uid);
	
	/**
	 * 根据邮箱或者登录名查找用户
	 * @param loginname
	 * @param email
	 * @return
	 */
	User selectByLoingnameOrEmail(@Param("loginname")String loginname,@Param("email") String email);
	
//	List<User> queryUserByCondition(Map<String,Object> map);
}

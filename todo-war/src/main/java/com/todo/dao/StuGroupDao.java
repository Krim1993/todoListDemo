package com.todo.dao;

import com.todo.pojo.StuGroup;

import java.util.List;

/**
 * 组织CRUD接口
 * Created by njw20 on 2017/7/26.
 */
public interface StuGroupDao {

	void addGroup(StuGroup group);

	StuGroup getGroupById(Integer groupId);

	List<StuGroup> listAllGroups();

	void updateGroup(StuGroup group);

	void deleteGroupById(Integer groupId);
}

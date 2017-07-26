package com.todo.service;

import com.todo.dao.StuGroupDao;
import com.todo.pojo.StuGroup;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Group逻辑操作层
 * Created by njw20 on 2017/7/26.
 */
@Service
public class GroupService {

	@Resource
	private StuGroupDao groupDao;

	public void addGroup(String groupName) {
		StuGroup group = new StuGroup();
		group.setGroupName(groupName);
		groupDao.addGroup(group);
	}

	public List<StuGroup> listAllGroups() {
		return groupDao.listAllGroups();
	}
}

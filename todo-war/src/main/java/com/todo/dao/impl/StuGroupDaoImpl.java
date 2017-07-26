package com.todo.dao.impl;

import com.todo.dao.StuGroupDao;
import com.todo.pojo.StuGroup;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 组织CRUD实现类
 * Created by njw20 on 2017/7/26.
 */
@Repository
public class StuGroupDaoImpl extends BaseDao implements StuGroupDao {

	public void addGroup(StuGroup group) {
		saveEntity(group);
	}

	@SuppressWarnings("unchecked")
	public StuGroup getGroupById(Integer groupId) {
		String hql = "from StuGroup g where g.groupId = ?";
		List<StuGroup> groups = (List<StuGroup>) getHibernateTemplate().find(hql, groupId);
		if (groups.size() > 0) {
			return groups.get(0);
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	public List<StuGroup> listAllGroups() {
		String hql = "from StuGroup";
		return (List<StuGroup>) getHibernateTemplate().find(hql);
	}

	public void updateGroup(StuGroup group) {
		updateEntity(group);
	}

	public void deleteGroupById(Integer groupId) {
		StuGroup group = getGroupById(groupId);
		if (group != null) {
			deleteEntity(group);
		}
	}
}

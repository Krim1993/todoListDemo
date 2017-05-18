package com.todo.dao.impl;

import com.todo.dao.TaskDao;
import com.todo.pojo.Task;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2017/5/18.
 */
@Repository
public class TaskDaoImpl extends BaseDao implements TaskDao {
    public void addNewTask(Task task) {
        saveEntity(task);
    }

    @SuppressWarnings("unchecked")
    public List<Task> listAllTasks() {
        String hql = "from Task";
        return (List<Task>) this.getHibernateTemplate().find(hql);
    }

    public void updateTask(Task task) {
        updateEntity(task);
    }

    public void deleteTask(Task task) {
        deteleEntity(task);
    }
}

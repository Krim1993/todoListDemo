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
        deleteEntity(task);
    }


    public Task getTaskById(Task task) {
        String hql = "from Task t where t.taskId = ?";
        List<Task> tasks = (List<Task>) this.getHibernateTemplate().find(hql, task.getTaskId());
        if (tasks.size() > 0) {
            task = tasks.get(0);
        }
        return task;
    }
}

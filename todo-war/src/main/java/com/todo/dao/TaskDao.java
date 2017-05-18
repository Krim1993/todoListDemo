package com.todo.dao;

import com.todo.pojo.Task;

import java.util.List;

/**
 * Created by njw20 on 2017/5/18.
 */
public interface TaskDao {

	/**
	 * 新建任务
	 * @param task
	 */
	void addNewTask(Task task);

	/**
	 * 获取所有任务
	 * @return
	 */
	List<Task> listAllTasks();

	/**
	 * 更新任务状态
	 * @param task
	 */
	void updateTask(Task task);

	/**
	 * 删除任务
	 * @param task
	 */
	void deleteTask(Task task);
}

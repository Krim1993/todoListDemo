package com.todo.service;

import com.todo.dao.TaskDao;
import com.todo.pojo.Task;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by njw20 on 2017/5/29.
 */
@Service
public class TaskService {

	@Resource
	private TaskDao taskDao;

	/**
	 * 新建任务
	 * @param task
	 */
	public void createNewTask(Task task) {
		taskDao.addNewTask(task);
	}

	public List<Task> listAllTasks() {
		return taskDao.listAllTasks();
	}

	public Task getTaskById(Task task) {
		return taskDao.getTaskById(task);
	}
}

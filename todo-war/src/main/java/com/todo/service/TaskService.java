package com.todo.service;

import com.todo.dao.TaskDao;
import com.todo.pojo.Task;
import com.todo.tools.GetTimeTool;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
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
	 * @param taskName
	 */
	public void createNewTask(String taskName) {
		Task task = new Task();
		task.setTaskName(taskName);
		task.setStatus("未完成");
		taskDao.addNewTask(task);
	}

	/**
	 * 完成任务
	 * @param taskId
	 */
	public void finishTask(Integer taskId) {
		Task task = new Task();
		task.setTaskId(taskId);
		task = getTaskById(task);
		task.setStatus("已完成");
		task.setDoneTime(GetTimeTool.getToday(new Date()));
		taskDao.updateTask(task);
	}

	/**
	 * 删除任务
	 * @param taskId
	 */
	public void deleteTask(Integer taskId) {
		Task task = new Task();
		task.setTaskId(taskId);
		task = getTaskById(task);
		taskDao.deleteTask(task);
	}

	public List<Task> listAllTasks() {
		return taskDao.listAllTasks();
	}

	public Task getTaskById(Task task) {
		return taskDao.getTaskById(task);
	}
}

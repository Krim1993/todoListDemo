package com.todo.controller;

import com.todo.pojo.Task;
import com.todo.service.TaskService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by njw20 on 2017/6/6.
 */
@Controller
public class TaskController {

	@Resource
	private TaskService taskService;

	@RequestMapping("/")
	public String index(Model model) {
		List<Task> tasks = taskService.listAllTasks();
		model.addAttribute("tasks", tasks);
		return "index";
	}

	@RequestMapping(value = "/addTask", method = RequestMethod.POST)
	@ResponseBody
	public void createTask(@RequestParam("taskName") String taskName) {
		taskService.createNewTask(taskName);
	}

	@RequestMapping(value = "/finishTask", method = RequestMethod.POST)
	@ResponseBody
	public void finishTask(@RequestParam("taskId") Integer taskId) {
		taskService.finishTask(taskId);
	}
}

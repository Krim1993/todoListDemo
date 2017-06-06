package com.todo.controller;

import com.todo.pojo.Task;
import com.todo.service.TaskService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
}

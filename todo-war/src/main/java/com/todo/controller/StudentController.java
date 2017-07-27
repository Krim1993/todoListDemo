package com.todo.controller;

import com.todo.pojo.StuGroup;
import com.todo.pojo.Student;
import com.todo.service.GroupService;
import com.todo.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.List;

/**
 * 学生页面控制器
 * Created by njw20 on 2017/7/26.
 */
@Controller
@RequestMapping("/student")
public class StudentController {

	@Resource
	private StudentService studentService;

	@Resource
	private GroupService groupService;

	@RequestMapping("/all")
	public String studentsList(Model model) {
		List<Student> students = studentService.listAllStudents();
		model.addAttribute("students", students);
		return "studentInfo";
	}

	@RequestMapping("/add")
	public String addStudent(Model model) {
		List<StuGroup> groups = groupService.listAllGroups();
		model.addAttribute("groups", groups);
		return "addStudent";
	}

	@RequestMapping(value = "/saveAdd", method = RequestMethod.POST)
	public String saveAdd(@RequestParam("studentName") String studentName, @RequestParam("groupId") Integer groupId) {
		studentService.addStudent(studentName, groupId);
		return "redirect:/student/all";
	}
}

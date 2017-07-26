package com.todo.controller;

import com.todo.pojo.Student;
import com.todo.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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

	@RequestMapping("/all")
	public String studentsList(Model model) {
		List<Student> students = studentService.listAllStudents();
		model.addAttribute("students", students);
		return "studentInfo";
	}
}

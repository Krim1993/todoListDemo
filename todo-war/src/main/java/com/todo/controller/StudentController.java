package com.todo.controller;

import com.todo.pojo.StuGroup;
import com.todo.pojo.Student;
import com.todo.service.GroupService;
import com.todo.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

	@RequestMapping("/{studentId}")
	public String studentDetail(@PathVariable("studentId") Integer studentId, Model model) {
		Student student = studentService.getStudentById(studentId);
		List<StuGroup> groups = groupService.listAllGroups();
		model.addAttribute("student", student);
		model.addAttribute("groups", groups);
		return "studentDetail";
	}

	@RequestMapping("/update")
	public String updateStudent(@RequestParam("studentId") Integer studentId, @RequestParam("studentName") String studentName,
	                            @RequestParam("groupId") Integer groupId) {
		studentService.updateStudent(studentId, studentName, groupId);
		return "redirect:/student/all";
	}

	@RequestMapping("/delete")
	@ResponseBody
	public void deleteStudent(@RequestParam("studentId") Integer studentId) {
		studentService.deleteStudentById(studentId);
	}
}

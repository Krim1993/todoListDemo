package com.todo.service;

import com.todo.dao.StuGroupDao;
import com.todo.dao.StudentDao;
import com.todo.pojo.StuGroup;
import com.todo.pojo.Student;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 学生操作逻辑判断层
 * Created by njw20 on 2017/7/26.
 */
@Service
public class StudentService {

	@Resource
	private StudentDao studentDao;

	@Resource
	private StuGroupDao groupDao;

	public List<Student> listAllStudents() {
		return studentDao.listAllStudents();
	}

	public void addStudent(String studentName, Integer groupId) {
		Student student = new Student();
		student.setStudentName(studentName);
		StuGroup group = groupDao.getGroupById(groupId);
		if (group != null) {
			student.setGroup(group);
			studentDao.addStudent(student);
		} else {
			System.out.println("该部门不存在!");
		}
	}
}

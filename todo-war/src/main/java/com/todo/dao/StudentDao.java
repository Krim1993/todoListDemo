package com.todo.dao;

import com.todo.pojo.Student;

import java.util.List;

/**
 * 学生CRUD接口
 * Created by njw20 on 2017/7/26.
 */
public interface StudentDao {

	void addStudent(Student student);

	void updateStudent(Student student);

	void deleteStudentById(Integer studentId);

	Student getStudentById(Integer studentId);

	List<Student> listAllStudents();

	List<Student> listStudentsByGroup(Integer groupId);
}

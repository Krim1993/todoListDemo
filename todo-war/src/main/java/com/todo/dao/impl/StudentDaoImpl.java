package com.todo.dao.impl;

import com.todo.dao.StudentDao;
import com.todo.pojo.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 学生CRUD实现类
 * Created by njw20 on 2017/7/26.
 */
@Repository
public class StudentDaoImpl extends BaseDao implements StudentDao {

	public void addStudent(Student student) {
		saveEntity(student);
	}

	public void updateStudent(Student student) {
		updateEntity(student);
	}

	public void deleteStudentById(Integer studentId) {
		Student student = getStudentById(studentId);
		if (student != null) {
			deleteEntity(student);
		}
	}

	@SuppressWarnings("unchecked")
	public Student getStudentById(Integer studentId) {
		String hql = "from Student s where s.studentId = ?";
		List<Student> students = (List<Student>) getHibernateTemplate().find(hql, studentId);
		if (students.size() > 0) {
			return students.get(0);
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	public List<Student> listAllStudents() {
		String hql = "from Student";
		return (List<Student>) getHibernateTemplate().find(hql);
	}

	@SuppressWarnings("unchecked")
	public List<Student> listStudentsByGroup(Integer groupId) {
		String hql = "from Student s where s.group.groupId = ?";
		return (List<Student>) getHibernateTemplate().find(hql, groupId);
	}
}

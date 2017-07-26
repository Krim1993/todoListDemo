package com.todo.service;

import com.todo.dao.StudentDao;
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

	public List<Student> listAllStudents() {
		return studentDao.listAllStudents();
	}
}

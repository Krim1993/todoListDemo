package com.todo.pojo;

import javax.persistence.*;

/**
 * 学生实体类
 * Created by njw20 on 2017/7/26.
 */
@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer studentId;

	private String studentName;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "groupId")
	private StuGroup group;

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public StuGroup getGroup() {
		return group;
	}

	public void setGroup(StuGroup group) {
		this.group = group;
	}
}

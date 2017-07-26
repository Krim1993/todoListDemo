package com.todo.pojo;

import javax.persistence.*;
import java.util.Set;

/**
 * 学生组织类
 * Created by njw20 on 2017/7/26.
 */
@Entity
public class StuGroup {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer groupId;

	private String groupName;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "groupId")
	private Set<Student> students;

	public Integer getGroupId() {
		return groupId;
	}

	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}
}

<%--
  Created by IntelliJ IDEA.
  User: njw20
  Date: 2017/7/26
  Time: 14:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>学生信息展示</title>
    <link href="/css/bootstrap.css" rel="stylesheet">
</head>
<body>
<%@include file="/resources/commons/header.jsp"%>
<div class="ibox float-e-margins">
    <div class="ibox-title text-center">
        <h2>学生列表</h2>
    </div>

    <div class="container">
        <table class="table">
            <thead>
            <tr>
                <th>ID</th>
                <th>学生姓名</th>
                <th>所属小组</th>
                <th>操作</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${students}" var="student" varStatus="status">
                <tr>
                    <td>${status.index + 1}</td>
                    <td>${student.studentName}</td>
                    <td>${student.group.groupName}</td>
                    <td>
                        <a href="/student/${student.studentId}" class="btn btn-primary btn-sm">编辑</a>
                        <button class="btn btn-primary btn-sm" onclick="deleteStudent('${student.studentId}')">删除</button>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</div>
</body>

<script src="/js/jquery-2.1.1.js"></script>
<script type="text/javascript">
	/**
     * 删除学生操作
	 * @param studentId
	 */
	function deleteStudent(studentId) {

		$.post("/student/delete", {studentId: studentId}, function () {
            alert("删除成功!");
            location.reload(true);
		});
    }
</script>
</html>

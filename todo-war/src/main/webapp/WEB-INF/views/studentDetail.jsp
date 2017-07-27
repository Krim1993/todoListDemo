<%--
  Created by IntelliJ IDEA.
  User: njw20
  Date: 2017/7/27
  Time: 10:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>学生详情页面</title>
    <link href="/css/bootstrap.css" rel="stylesheet">
</head>
<body>
<%@include file="/resources/commons/header.jsp"%>
<div class="ibox float-e-margins">
    <div class="ibox-title text-center">
        <h2>学生信息详情</h2>
    </div>

    <form class="form-horizontal" action="/student/update" method="post">
        <div class="form-group">
            <label class="col-sm-2 control-label">学生姓名</label>
            <div class="col-sm-8">
                <input type="hidden" id="studentId", name="studentId" value="${student.studentId}">
                <input type="text" class="form-control"  id="studentName" name="studentName" value="${student.studentName}" readonly = readonly>
            </div>
        </div>

        <div class="form-group">
            <label class="col-sm-2 control-label">所属小组</label>
            <div class="col-sm-8">
                <select name="groupId" class="form-control">
                    <c:forEach items="${groups}" var="group">
                    <option id="group${group.groupId}" value="${group.groupId}">${group.groupName}</option>
                    </c:forEach>
                </select>
            </div>
        </div>

        <div class="form-group">
            <div class="col-sm-12 text-center">
                <button class=" btn btn-primary" type="submit" id="updateStudent">保存修改</button>
            </div>
        </div>
    </form>
</div>

</body>

<script src="/js/jquery-2.1.1.js"></script>
<script type="text/javascript">
	$(function () {

		var groupOption = $("#group${student.group.groupId}");

		groupOption.attr("selected", "selected");
	});
</script>
</html>

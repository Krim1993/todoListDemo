<%--
  Created by IntelliJ IDEA.
  User: njw20
  Date: 2017/7/28
  Time: 9:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>部门信息详情</title>
    <link href="/css/bootstrap.css" rel="stylesheet">
</head>
<body>
<%@include file="/resources/commons/header.jsp"%>
<div class="ibox float-e-margins">
    <div class="ibox-title text-center">
        <h2>部门信息详情</h2>
        <div class="group-error">${groupError}</div>
    </div>
    <form class="form-horizontal" action="/group/update" method="post">
        <div class="form-group">
            <label class="col-sm-2 control-label">部门名称</label>
            <div class="col-sm-8">
                <input type="hidden" name="groupId" id="groupId" value="${group.groupId}">
                <input type="text" class="form-control" name="groupName" id="groupName" value="${group.groupName}">
            </div>
        </div>

        <div class="form-group text-center">
            <button class="btn btn-primary" type="submit">保存修改</button>
            <a href="/group/all" class="btn btn-primary">返回部门列表</a>
        </div>
    </form>

    <!--展示属于该小组的学生-->
    <div class="container">
        <table class="table">
            <thead>
            <tr>
                <th>ID</th>
                <th>学生姓名</th>
                <th>所属小组</th>

            </tr>
            </thead>
            <tbody>
            <c:forEach items="${students}" var="student" varStatus="status">
                <tr>
                    <td>${status.index + 1}</td>
                    <td>${student.studentName}</td>
                    <td>${student.group.groupName}</td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</div>
</body>

<script src="/js/jquery-2.1.1.js"></script>
<script type="text/javascript">
    $(function () {

    	var error = $(".group-error").text();
    	if (error == null || error.trim() == "") {
		    $(".group-error").text("");
        }
    });
</script>
</html>

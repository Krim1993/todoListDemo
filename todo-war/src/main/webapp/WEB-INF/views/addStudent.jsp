<%--
  Created by IntelliJ IDEA.
  User: njw20
  Date: 2017/7/26
  Time: 16:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>添加学生</title>
    <link href="/css/bootstrap.css" rel="stylesheet">
</head>
<body>
<%@include file="/resources/commons/header.jsp"%>
<div class="ibox float-e-margins">
    <div class="ibox-title text-center">
        <h2>添加学生</h2>
    </div>

    <form class="form-horizontal" action="/student/saveAdd" method="post">
        <div class="form-group">
            <label class="col-sm-2 control-label">学生姓名</label>
            <div class="col-sm-8">
                <input type="text" class="form-control"  id="studentName" name="studentName">
            </div>
        </div>

        <div class="form-group">
            <label class="col-sm-2 control-label">所属小组</label>
            <div class="col-sm-8">
                <select name="groupId" class="form-control">
                    <c:forEach items="${groups}" var="group">
                        <option value="${group.groupId}">${group.groupName}</option>
                    </c:forEach>
                </select>
            </div>
        </div>

        <div class="form-group">
            <div class="col-sm-12 text-center">
                <button class=" btn btn-primary" type="submit" id="addNewStudent">确认添加</button>
            </div>
        </div>
    </form>
</div>

</body>
</html>

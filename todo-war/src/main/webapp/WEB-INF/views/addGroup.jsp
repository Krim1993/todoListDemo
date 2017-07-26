<%--
  Created by IntelliJ IDEA.
  User: njw20
  Date: 2017/7/26
  Time: 15:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>添加部门</title>
    <link href="/css/bootstrap.css" rel="stylesheet">
</head>
<body>
<%@include file="/resources/commons/header.jsp"%>
<div class="ibox float-e-margins">
    <div class="ibox-title text-center">
        <h2>添加部门</h2>
    </div>
    <form class="form-horizontal" action="/group/add" method="post">
        <div class="form-group">
            <label class="col-sm-2 control-label">部门名称</label>
            <div class="col-sm-8">
                <input type="text" class="form-control"  id="groupName" name="groupName">
            </div>
            <div class="col-sm-2">
                <button class=" btn btn-primary" type="submit" id="addNewGroup">添加新部门</button>
            </div>
        </div>
    </form>

    <div class="container">

        <table class="table">
            <thead>
            <tr>
                <th>ID</th>
                <th>部门名称</th>
                <th>操作</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${groups}" var="group" varStatus="status">
                <tr>
                    <td>${status.index + 1}</td>
                    <td>${group.groupName}</td>
                    <td><a href="#" class="btn btn-primary btn-sm">编辑</a></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>

    </div>
</div>
</body>
</html>

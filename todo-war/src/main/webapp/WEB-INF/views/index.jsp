<%@ page import="java.util.List" %>
<%@ page import="com.todo.pojo.Task" %>
<%@page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<title>TODO LIST DEMO</title>
<link href="/css/bootstrap.css" rel="stylesheet">

<body style="">
<div class="ibox float-e-margins">
    <div class="ibox-title text-center">
        <h2>TODO LIST</h2>
    </div>
<form class="form-horizontal" action="">
    <div class="form-group">
        <label class="col-sm-2 control-label">任务名称</label>
        <div class="col-sm-8">
            <input type="text" class="form-control"  id="taskName" name="taskName">
        </div>
        <div class="col-sm-2">
            <button class=" btn btn-primary">添加新任务</button>
        </div>
    </div>
</form>

    <div class="container">

        <table class="table">
            <thead>
            <tr>
                <th>ID</th>
                <th>任务名称</th>
                <th>任务状态</th>
                <th>完成时间</th>
                <th>操作</th>
            </tr>
            </thead>
            <tbody>

            </tbody>
        </table>

    </div>
</div>
</body>
</html>

$(function () {

	$("#addNewTask").click(function () {
		var taskName = $("#taskName").val();

		$.ajax({
			url:"/addTask",
			type:"post",
			data:{
				taskName:taskName
			},
			success:function (data) {
				alert("添加成功" + data);
				window.location.reload(true);
			},
			error:function () {
				console.log("ERROR！");
			}
		});
	});
});

/**
 * 完成任务
 * @param taskId
 */
function finishTask(taskId) {
	$.ajax({
		url:"/finishTask",
		type:"post",
		data:{
			taskId:taskId
		},
		success:function () {
			alert("任务已完成");
			window.location.reload(true);
		},
		error:function () {
			console.log("ERROR！");
		}
	});
}

/**
 * 删除任务
 * @param taskId
 * @param taskStatus
 */
function deleteTask(taskId, taskStatus) {

	var checkTask = false;

	if (taskStatus.trim() == "未完成") {
		checkTask = confirm("任务未完成，是否要删除");
	} else {
		checkTask = true;
	}

	if (checkTask) {
		$.ajax({
			url:"/deleteTask",
			type:"post",
			data:{
				taskId:taskId
			},
			success:function () {
				window.location.reload(true);
			},
			error:function () {
				console.log("ERROR！");
			}
		});
	}
}
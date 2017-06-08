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

function deleteTask(taskId) {

}
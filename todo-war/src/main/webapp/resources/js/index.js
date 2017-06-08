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
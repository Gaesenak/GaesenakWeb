<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
<title>Geasenak</title>
<style>
/* �ʱ�ȭ */
* {margin:0 auto; padding:0}
a {text-decoration:none}
p {font-size:14px}
input, select, button {outline:none}
</style>
</head>
<body>
<h1>Regi Page</h1>
<h2>�͸�Խ��� �� �ۼ��ϴ� ������</h2>

<table>
	<tr>
		<th>����</th>
		<td>
			<input type="text" id="title" name="title" placeholder="������ �Է����ּ���" />
		</td>
	</tr>
	<tr>
		<th>�ۼ���</th>
		<td>
			<input type="text" id="writer" name="writer" value="�͸�"/>
		</td>
	</tr>
	<tr>
		<th>����</th>
		<td>
			<textarea id="content" name="content"></textarea>
		</td>
	</tr>
	<tr>
		<td><input type="button" id="save" value="����"/></td>
		<td><input type="button" id="cancel" value="���"/></td>
	</tr>
</table>

<script>
$(document).ready(function(){
	$("#save").click(function(){
		var title 	= $.trim($("#title").val());
		var writer	= $.trim($("#writer").val());
		var content = $.trim($("#content").val());
		
		if(title==""){
			alert("������ �Է����ּ���.");
			event.preventDefault();
		}else{
			$.ajax({
				type:'post',
				url:'/anony/anonyRegi',
				headers:{
					"Content-Type": "application/json; charset=UTF-8",
					"X-HTTP-Method-Override": "POST"},
				dataType:'text',
				data: JSON.stringify({
					title	: title, 
					writer	: writer, 
					content	: content
				}),
				success:function(result){
					console.log("result: " + result);
					if(result == "success"){
						location.href = "/anony/anonyBoard";
					}else{
						alert("�Խù� ��Ͽ� �����߽��ϴ�.");
					}
				}
			});
		}
	});
});
</script>
</body>
</html>
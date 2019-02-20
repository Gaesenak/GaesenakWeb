<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="f" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Geasenak</title>
<style type="text/css">
body{
	margin : 0;
	padding : 0;
}
.tbl1{
	border : 1px solid #969696;
	border-radius : 2px;
	align : center;
	width : 800px;
}
.tbl1>tr{
	text-align: center;
	
}
.tbl1 td{
	border : 1px solid #969696;
}
</style>
</head>
<body>
	<jsp:include page="../common/common.jsp"></jsp:include>
	<jsp:include page="../common/header.jsp"></jsp:include>
	
	<h3>���� �Խ���</h3>
	<label>��¥ �˻�</label> <input type="text" name="startDate"/> ~ <input type="text" name="endDate"/>
	<select>
		<option name="title" selected="selected">����</option>
		<option name="writer">�ۼ���</option>
		<option name="content">����</option>
	</select>
	<input type="text" name="search"/>
	<button id="goSearch" onclick="">�˻�</button>
	<button id="goInsert" onclick="">���</button>
	
	<table class="tbl1">
		<tr>
			<td>��ȣ</td>
			<td style="width:35%;">����</td>
			<td>�ۼ���</td>
			<td>�����</td>
			<td>��ȸ��</td>
		</tr>
		<tr id="m-list">
			<c:forEach var="soList" items="${soList}" varStatus="status1">
				<td></td>
				<td>${soList.title}</td>
				<td>${soList.writer}</td>
				<td><f:formatDate value=" ${soList.date}" pattern="YYYY-MM-DD"/></td>
				<td>${soList.hitCnt}</td>
			</c:forEach> 
		</tr>	
	</table>
	
	<jsp:include page="../common/footer.jsp"></jsp:include>
</body>
<script type="text/javascript">
	function (){
		
	}
</script>
</html>
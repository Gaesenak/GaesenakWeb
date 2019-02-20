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
	
	<h3>말종 게시판</h3>
	<label>날짜 검색</label> <input type="text" name="startDate"/> ~ <input type="text" name="endDate"/>
	<select>
		<option name="title" selected="selected">제목</option>
		<option name="writer">작성자</option>
		<option name="content">내용</option>
	</select>
	<input type="text" name="search"/>
	<button id="goSearch" onclick="">검색</button>
	<button id="goInsert" onclick="">등록</button>
	
	<table class="tbl1">
		<tr>
			<td>번호</td>
			<td style="width:35%;">제목</td>
			<td>작성자</td>
			<td>등록일</td>
			<td>조회수</td>
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
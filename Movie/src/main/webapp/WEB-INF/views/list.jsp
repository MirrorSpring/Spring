<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>영화 리스트</h2>
총 ${size}건
<table border="1">
	<tr>
		<th>영화 이미지</th>
		<th>영화 제목</th>
	</tr>
	<c:forEach items="${list}" var="dto">
		<tr>
			<td><img src="${dto.image}"></td>
			<td>${dto.title}</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>
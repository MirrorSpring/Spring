<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h5>Get</h5>
<form action="/getpost" method="get">
student id: <input type="text" name="id"><br>
<input type="submit" value="전송">
</form>
<hr>
<h5>Post</h5>
<form action="/getpost" method="post">
student id: <input type="text" name="id"><br>
<input type="submit" value="전송">
</form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
function addForm(){
	var form=document.calc;
	form.action="/addCalc";
	form.submit();
}

function multForm(){
	var form=document.calc;
	form.action="/multCalc";
	form.submit();
}
</script>
<style>
td{
	padding:10px;
}
</style>
</head>
<body>
<form action="#" name="calc" method="post">
	<table border="1">
		<tr>
			<td>첫 번째 숫자: </td>
			<td><input type="text" name="num1" size="10"></td>
		</tr>
		<tr>
			<td>두 번째 숫자: </td>
			<td><input type="text" name="num2" size="10"></td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="button" value="+" onclick="addForm()">
				<input type="button" value="*" onclick="multForm()">
			</td>
		</tr>
	</table>
</form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="addPerson" method = "GET">
	<input type="text" name="pid">
	<input type="text" name="pname">
	<input type="submit"/>
</form>

<form action="getPerson" method = "GET">
The Name is ${Person.pname}
<input type="text" name="pId"/>
<input type="submit"/>
</form>

</body>
</html>
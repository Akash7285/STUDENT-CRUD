<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
    <title>Update Student</title>
</head>
<body>
<h2>Update Student</h2>
<form action="/saveStudent" method="post">
    <input type="hidden" name="id" value="${student.id}" />
    Name: <input type="text" name="name" value="${student.name}" /><br/>
    Email: <input type="email" name="email" value="${student.email}" /><br/>
    Course: <input type="text" name="course" value="${student.course}" /><br/>
    <input type="submit" value="Update" />
</form>
</body>
</html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
    <title>Add Student</title>
</head>
<body>
<h2>Add New Student</h2>
<form action="saveStudent" method="post">
    Name: <input type="text" name="name" /><br/>
    Email: <input type="email" name="email" /><br/>
    Course: <input type="text" name="course" /><br/>
    <input type="submit" value="Save" />
</form>
</body>
</html>

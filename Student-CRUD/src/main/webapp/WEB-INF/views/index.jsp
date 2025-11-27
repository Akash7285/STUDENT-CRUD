<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Student List</title>
</head>
<body>
<h2>Student List</h2>
<a href="showNewStudentForm">Add New Student</a>
<table border="1">
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Email</th>
        <th>Course</th>
        <th>Actions</th>
    </tr>
    <c:forEach var="student" items="${listStudents}">
        <tr>
            <td>${student.id}</td>
            <td>${student.name}</td>
            <td>${student.email}</td>
            <td>${student.course}</td>
            <td>
                <a href="showFormForUpdate/${student.id}">Edit</a>
                <a href="deleteStudent/${student.id}">Delete</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>

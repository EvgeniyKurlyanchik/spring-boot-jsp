<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 12.02.2023
  Time: 15:47
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Students</title>
    <link rel="stylesheet" href="styles/w3.css">
</head>
<body class="w3-light-grey">
<div class="w3-container w3-blue-grey w3-opacity w3-right-align">
    <h2>Студенты</h2>
</div>

<br/>
<div>
    <button onclick="location.href='/students/new'">Add student</button>
</div>
<br/>
<table border="3">
    <thead>
    <tr>
        <th>ID</th>
        <th>First Name</th>
        <th >Last Name</th>
        <th >Age</th>
        <th >Actions</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${students}" var="col">
        <tr>
            <td> ${col.id} <br/></td>
            <td> ${col.firstName} </td>
            <td> ${col.lastName} </td>
            <td> ${col.age} </td>
            <td>  <a href = "/students/${col.id}"
               class = "btn btn-danger">Delete</a>
            </td>
            <td>  <a href = "/students/edit/${col.id}"
                     class = "btn btn-primary">Edit</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>

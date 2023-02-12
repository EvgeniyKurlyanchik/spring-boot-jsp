<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 12.02.2023
  Time: 17:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Add Students</title>
</head>
<body>
<section>
    <jsp:useBean id="student" scope="request" type="com.company.app.model.Student "/>
    <form method="post" action="/students">
        <dl>
            <dt>FirstName: </dt>
            <dd><input type="text" name="firstName" value="${student.firstName}" placeholder="${student.firstName}" /></dd>
        </dl>
        <dl>
            <dt>LastName: </dt>
            <dd><input type="text" name="lastName" value="${student.lastName}" placeholder="${student.lastName}" /></dd>
        </dl>
        <dl>
            <dt>AGE: </dt>
            <dd><input type="number" name="age" value="${student.age}" placeholder="${student.age}" /></dd>
        </dl>
        <button type="submit">Save</button>
    </form>
</section>
</body>
</html>



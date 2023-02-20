<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. -->
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- Formatting (dates) -->
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/jquery/jquery.min.js"></script>
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <title>Document</title>
</head>
<body>
<div class="container">
<h1>Add a Book </h1>


<form:form action="/books" method="post" modelAttribute="book">
    <form:hidden path="user" value="${userId}"></form:hidden>
    <div class="form-control">
        <form:label path="title">Title</form:label>
        <form:errors path="title"></form:errors>
        <form:input path="title"></form:input>
    </div>
    <div class="form-control">
        <form:label path="author">author</form:label>
        <form:errors path="author"></form:errors>
        <form:input path="author"></form:input>
    </div>
    <div class="form-control">
        <form:label path="myThoughts">myThoughts</form:label>
        <form:errors path="myThoughts"></form:errors>
        <form:input path="myThoughts"></form:input>
    </div>

    <input type="submit" value="add book">
</form:form>



</div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. --> 
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!-- Formatting (dates) --> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Tacos</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="/js/app.js"></script><!-- change to match your file/naming structure -->
</head>
<body>
    <h1>Burger Tracker</h1>

    <table class="table">
        <thead>
            <th>Name</th>
            <th>Rest. Name</th>
            <th>rating</th>
        </thead>
            <tbody>
                <c:forEach var="burger" items="${burgers}">
                    <tr>
                        <td>${burger.name}</td>
                        <td>${burger.restaurantName}</td>
                        <td>${burger.rating}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    

    <h2>Add A burger</h2>

    <form:form action="/burgers" method="post" modelAttribute="burger">
        <div class="form-control">
            <form:label path="name">name</form:label>
            <form:errors path="name"></form:errors>
            <form:input path="name"></form:input>
        </div>
        <div class="form-control">
            <form:label path="restaurantName">restaurantName</form:label>
            <form:errors path="restaurantName"></form:errors>
            <form:input path="restaurantName"></form:input>
        </div>
        <div class="form-control">
            <form:label path="rating">rating</form:label>
            <form:errors path="rating"></form:errors>
            <form:input path="rating"></form:input>
        </div>
        <div class="form-control">
            <form:label path="notes">notes</form:label>
            <form:errors path="notes"></form:errors>
            <form:input path="notes"></form:input>
        </div>

        <input type="submit" value="create burger">

    </form:form>
   
</body>
</html>
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
    <script src="/webjars/jquery/jquery.min.js"></script>
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="/js/app.js"></script><!-- change to match your file/naming structure -->
</head>
<body>
    <table class="table">
        <thead>
            <th>title</th>
            <th>author</th>
            <th>pages</th>
            <th>Actions</th>
        </thead>
        <c:forEach var="book" items="${books}">
            <tr>
                <td>
                    <a href="/books/${book.id}">
                        ${book.title}
                    </a>
                </td>
                <td>${book.author}</td>
                <td>${book.pages}</td>
                <td>
                    <a href="/books/edit/${book.id}">edit</a>
                    <form action="/books/${book.id}" method="post">
                        <input type="hidden" name="_method" value="delete">
                        <input type="submit" value="Delete">
                    </form>   
                </td>
            </tr>
        </c:forEach>
    </table>

   <a class="btn btn-primary" href="/books/new">Add a Book</a>
</body>
</html>


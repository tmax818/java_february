# book club

# Checklist

- [ ] update [application.properties](src/main/resources/application.properties)

```
# Where are jsp files? HERE!
spring.mvc.view.prefix=/WEB-INF/
# Data Persistence
spring.datasource.url=jdbc:mysql://localhost:3306/bookclub
spring.datasource.username=root
spring.datasource.password=root
spring.jpa.hibernate.ddl-auto=update
# For Update and Delete method hidden inputs
spring.mvc.hiddenmethod.filter.enabled=true
```

- [ ] [pom.xml](pom.xml)

```xml 
        <!-- DEPENDENCIES FOR DISPLAYING JSPS AND USING JSTL TAGS -->
        <dependency>
            <groupId>org.apache.tomcat.embed</groupId>
            <artifactId>tomcat-embed-jasper</artifactId>
        </dependency>
        <dependency>
            <groupId>javax.servlet</groupId>
            <artifactId>jstl</artifactId>
        </dependency>
        <!-- DEPENDENCY FOR USING VALIDATION ANNOTATIONS -->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-validation</artifactId>
        </dependency>
        <!-- DEPENDENCY FOR USING BCRYPT  -->
        <dependency>
            <groupId>org.mindrot</groupId>
            <artifactId>jbcrypt</artifactId>
            <version>0.4</version>
        </dependency>
        <!-- DEPENDENCIES FOR BOOTSTRAP -->
        <dependency>
            <groupId>org.webjars</groupId>
            <artifactId>webjars-locator</artifactId>
            <version>0.46</version>
        </dependency>
        <dependency>
            <groupId>org.webjars</groupId>
            <artifactId>bootstrap</artifactId>
            <version>5.2.3</version>
        </dependency>
```

- [ ] add [index.jsp](src/main/webapp/WEB-INF/index.jsp)

```html
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
<h1  class="align-content-center">Login and Registration</h1>
    <div class="row">
        <div class="col">
            <h2>Register</h2>
            <form:form action="/register" method="post" modelAttribute="newUser">
                <div>
                    <div class="form-group">
                    <form:label path="userName">userName</form:label>
                    <form:input  class="form-control" path="userName"/>
                    <form:errors path="userName"/>
                    </div>
                    <div class="form-group">
                    <form:label path="email">email</form:label>
                    <form:input  class="form-control" path="email"/>
                    <form:errors path="email"/>
                    </div>
                    <div>
                    <form:label path="password">password</form:label>
                    <form:input  class="form-control" path="password"/>
                    <form:errors path="password"/>
                    </div>
                    <div>
                    <form:label path="confirm">confirm password</form:label>
                    <form:input  class="form-control" path="confirm"/>
                    <form:errors path="confirm"/>
                    </div>
                </div>
                <input type="submit" value="register">
            </form:form>
        </div>
        <div class="col">
            <h2>Login</h2>
            <div class="form-group">
                <form:form action="/login" method="post" modelAttribute="newLogin">
                    <div class="form-group">
                        <form:label path="email">email</form:label>
                        <form:input  class="form-control" path="email"/>
                        <form:errors path="email"/>
                    </div>
                    <div>
                        <form:label path="password">password</form:label>
                        <form:input  class="form-control" path="password"/>
                        <form:errors path="password"/>
                    </div>
                <input type="submit" value="login">
                </form:form>
            </div>
        </div>

    </div>
</div>
</body>
</html>
```

## Models

- [ ] add [User](src/main/java/tyler/bookclub/models/User.java)
- [ ] add [LoginUser](src/main/java/tyler/bookclub/models/LoginUser.java)
- [ ] add [Book](src/main/java/tyler/bookclub/models/Book.java)

## Controllers

- [ ] add [MainController](src/main/java/tyler/bookclub/controllers/MainController.java)
- [ ] add [BookController](src/main/java/tyler/bookclub/controllers/BookController.java)

## Services

- [ ] add [User service](src/main/java/tyler/bookclub/services/UserService.java)
- [ ] add [Book service](src/main/java/tyler/bookclub/services/BookService.java)


## Repositories

- [ ] add [User repository](src/main/java/tyler/bookclub/repositories/UserRepository.java)
- [ ] add [Book repository](src/main/java/tyler/bookclub/repositories/BookRepository.java)

# session demo

- [ ] update [application.properties](src/main/resources/application.properties)

```
# Where are jsp files? HERE!
spring.mvc.view.prefix=/WEB-INF/
# Data Persistence
spring.datasource.url=jdbc:mysql://localhost:3306/<<YOUR_SCHEMA_NAME>>
spring.datasource.username=root
spring.datasource.password=root
spring.jpa.hibernate.ddl-auto=update
# For Update and Delete method hidden inputs
spring.mvc.hiddenmethod.filter.enabled=true
```

- [ ] [pom.xml](pom.xml)

```xml

        <!-- DEPENDENCIES FOR STARTING SPRING PROJECTS-->


        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-tomcat</artifactId>
            <scope>provided</scope>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
        </dependency>
        <!-- DEPENDENCIES FOR DISPLAYING JSPS AND USING JSTL TAGS -->
        <dependency>
            <groupId>org.apache.tomcat.embed</groupId>
            <artifactId>tomcat-embed-jasper</artifactId>
        </dependency>
        <dependency>
            <groupId>javax.servlet</groupId>
            <artifactId>jstl</artifactId>
        </dependency>
        <!-- DEPENDENCIES FOR INTEGRATING SQL DATABASE AND USING JPA -->
        <!-- Note: Project will not run until a schema has been created and the 
            proper settings in application properties are present for 
            connecting to a database. -->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-j</artifactId>
            <scope>runtime</scope>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-data-jpa</artifactId>
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
            <version>0.30</version>
        </dependency>
        <dependency>
            <groupId>org.webjars</groupId>
            <artifactId>bootstrap</artifactId>
            <version>5.0.1</version>
        </dependency>
        <dependency>
            <groupId>org.webjars</groupId>
            <artifactId>jquery</artifactId>
            <version>3.6.0</version>
        </dependency>
```

- [ ] add [index.jsp](src/main/webapp/WEB-INF/index.jsp)

- [ ] add [MainController.java](src/main/java/com/tyler/session_demo/controllers/MainController.java)
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

Hello1 ${name1} 
Your password : ${password}

<p>

this Spring mvc uses - maven for build.
embedded tomcat 7 webserver, which is defined in pom.xml as dependency.

to run it - run->configuration-><br/> 
Goals -> tomcat7:run  
http://localhost:8080/spring-mvc/hello1
</p>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Detalles de los estudiantes</title>
</head>
<body>

<!-- JSP buscara un bean llamado studentDetails en la request y dentro la property "id" -->
Id del estudiante: <jsp:getProperty property="id" name="studentDetails"/>
Nombre del estudiante: <jsp:getProperty property="name" name="studentDetails"/>

</body>
</html>
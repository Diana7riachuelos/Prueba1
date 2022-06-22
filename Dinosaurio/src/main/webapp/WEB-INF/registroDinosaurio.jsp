<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<meta charset="UTF-8">
<head>
    <title>Registro</title>

</head>
<body>
<div>
    <%--@elvariable id="usuario" type=""--%>
    <c:if test="${msgError!=null}">
        <C:out> "${msgError}"</C:out>
    </c:if>
    <%--@elvariable id="dinosaurio" type=""--%>
    <form:form action="/registroDinosaurio/completo" method ="post" modelAttribute="dinosaurio">
        <form:label  path = "nombre"> Nombre:</form:label>
        <form:input path="nombre" />
        <br>
        <form:label  path = "color"> Color:</form:label>
        <form:input path="color" />
        <br>
        <form:label  path = "altura"> Altura:</form:label>
        <form:input path="altura" type = "number" />
        <br>
        <form:label  path = "especie"> Especie:</form:label>
        <form:input path="especie" />
        <br>
        <input type = "submit"  value ="Registrar">


    </form:form>

</div>
</body>
</html>
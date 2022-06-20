<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dinosaurio</title>
</head>
<body>
<div>

<form action="/registroDinosaurio" method="post">

<label for="color"> Color: </label>
<input type="text" id="nombre" name="gato"> 
<br>
<label for="especie"> Especie: </label>
<input type="text" id="especie" name="especie"> 
<br>
<label for="altura"> Altura: </label>
<input type="number" id="altura" name="altura"> 
<br>
<!-- submit para el envio de información -->
<input type="Submit" value="Registrar"> <input type="button" value="enviar">

</form>

</div>
</body>
</html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title> Captura Datos</title>
</head>
<body>
	<%@ page import="com.welcome.MiServlet" %>

	<h1> Esta es la página de inicio</h1>
	<h2> Aquí se piden los datos </h2>
	<p> Hola, por favor introduce la información </p>

	
	<form action="MiServlet" method="post">
		<table cellspacing="3" cellpadding="3" border="1">
			<tr>
				<td align="right">Nombre:</td>
				<td><input type="text" name="nombre"></td>
			</tr>
			<tr>
				<td align="right">Minuto inicial:</td>
				<td><input type="text" name="inicial"></td>
			</tr>
			<tr>
				<td align="right">Minuto final:</td>
				<td><input type="text" name="final"></td>
			</tr>
			<tr>
				<td align="right">Distancia recorrida (en metros):</td>
				<td><input type="text" name="distancia"></td>
			</tr>
		</table>
	
	<input type="reset" value="Borrar">
	<input type="submit" value="Enviar">
	
	</form>

</body>
</html>
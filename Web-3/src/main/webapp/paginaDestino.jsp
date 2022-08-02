<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Página Destino JSP</title>
</head>
<body>

<%@ page import="com.welcome.Calculo" %>

<%
// RECUPERAMOS EL OBJETO ENVIADO POR EL SERVLET
	Calculo calculo = (Calculo) request.getAttribute("datosEnviados");

%>

<h2>Resultado</h2>
<p> Hola <%= calculo.getNombre() %> </p>
<table cellspacing="3" cellpadding="3" border="1">
	<tr>
		<td align="right"> Tu tiempo total fue: </td>
		<td> <%= calculo.getTiempoTotal() %> minutos </td>
	</tr>
	<tr>
		<td align="right"> Y tu velocidad: </td>
		<td> <%= calculo.getVelocidad() %> metros/minuto </td>
	</tr>
</table>

<form action="index.jsp" method="post">
	<input type="submit" value="Regresar">
</form>



</body>
</html>
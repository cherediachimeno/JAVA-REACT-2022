<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Details - Result to Delete</title>
</head>
<body>
  
    <h1>This information will be delete</h1>

	<form action="./FinalDelete" method="post">
		<input type="hidden" name="stid"
			value="<%=request.getParameter("id")%>">

		<table>
			<tr>
				<td>Try again to write the ID to delete it</td>
				<td><input type="text" name="id" /></td>
				<br />

			</tr>
			<tr>
				<td>Name:</td>
				<td><%=request.getParameter("name")%></td>
			</tr>
			<tr>
				<td>Email Id:</td>
				<td><%=request.getParameter("email")%></td>
			</tr>
			<tr>
				<td>Phone Number:</td>
				<td><%=request.getParameter("phone")%></td>
			</tr>
			<tr />
		</table>
		<br /> <input type="submit" value="Borrar definitivamente" />
	</form>
	<br />

	<input type="button" value="Return to Home"
        onclick="window.location.href='index.jsp'" />
  
</body>
  

</html>
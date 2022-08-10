<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome Page</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
  
    <h2 align="center">Welcome to Student database management system</h2>
    <br />
    <table align="center">
    <div class="container">
  
        
		<tr>
			<td>To insert your details into the Database:</td>
			<td><input type="button" class="btn btn-primary btn-block"
				value="Insert data" onclick="window.location.href='Insert.jsp'" /></td>
		</tr>
		<tr>
			<td>To delete your details from the Database:</td>
			<td><input type="button" class="btn btn-primary btn-block" value="Delete data"
				onclick="window.location.href='Delete.jsp'" /></td>
		</tr>
		<tr>
            <td>To view your details from the Database:</td>
            <td><input type="button" class="btn btn-primary btn-block" value="Select data"
                onclick="window.location.href='Select.jsp'" /></td>
        </tr>
    </table>
    </div>
  
</body>
  
  
</html>
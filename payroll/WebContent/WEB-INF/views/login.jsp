<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<title>Payroll - Login</title>
<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/style.css"/>">
</head>
<body>
	<div class="header">Payroll Application</div>
	<h1>Login</h1>
	<c:out value="${error}" />
	<form action="authenticate" method="post">
		<table>
			<tr>
				<td>Username</td>
				<td><input type="text" name="userName" value="${userName}"></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="password"></td>
			</tr>
		</table>
		<input type="submit" value="Login">
	</form>
</body>
</html>
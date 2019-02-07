<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>

<!DOCTYPE html>
<html>
<head>
<title>Employee List</title>
<link rel="stylesheet" type="text/css" href="css/style.css">

</head>
<body>
	<div class="header">  Payroll Application</div>
	<div class="menu">
		<div class="menu-item selected"><a href="">Employees</a></div>
		<div class="menu-item"><a href="">Departments</a></div>
		<div class="menu-item"><a href="">Skills</a></div>

	</div>
	<div class="activity">
		
		<h1>Employee List</h1>
		<table border="1" id="employees">
			<tr>
				<th>ID</th>
				<th>NAME</th>
				<th>DATE OF BIRTH</th>
				<th>GENDER</th>
				<th>SALARY</th>
				<th>EMAIL</th>
				<th>DEPARTMENT</th>
				<th>SKILLS</th>
				<th>ADDRESS</th>
			</tr>
			<c:forEach items="${employees}" var="employee">
				<tr>
					<td>${employee.id}</td>
					<td>${employee.name}</td>
					<td>${employee.dob}</td>
					<td>${employee.gender}</td>
					<td>${employee.salary}</td>
					<td>${employee.email}</td>
					<td>${employee.department.name}</td>
					<td>${employee.skills}</td>
					<td>${employee.address.address1},${employee.address.address2},
						${employee.address.locality}, ${employee.address.pincode}</td>
					<td><a href="employee/show/${employee.id}">Edit</a></td>
				</tr>
			</c:forEach>

		</table>
	</div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<head>
<title>Customer-List</title>
<style type="text/css">
table, tr, th, td {
	border: 1px black solid;
	padding: 5px;
}
</style>
</head>
<body>
	<div id="wrapper">
		<div id="header">
			<h1 align = "center" >Customer Management</h1>
		</div>
	</div>
	<div id="container">
		<div id="content">
			<h2>List of Customers</h2>
			<table>
				<tr>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Email</th>
					<th>Action</th>
				</tr>
				<c:forEach var="tempCustomer" items="${customers}">
					<c:url var="updateLink" value="/customer/showFormForUpdate">
						<c:param name="customerId" value="${tempCustomer.id}" />
					</c:url>
					<c:url var="deleteLink" value="/customer/delete">
						<c:param name="customerId" value="${tempCustomer.id}" />
					</c:url>
					<tr>
						<td>${tempCustomer.firstName}</td>
						<td>${tempCustomer.lastName}</td>
						<td>${tempCustomer.email}</td>
						<td><a href="${updateLink}">Update</a> | <a
							href="${deleteLink}"
							onclick="return confirm('Are You Sure You Want to Delete This Customer?')">Delete</a></td>
					</tr>
				</c:forEach>
			</table>
			<br><br>
			<input type="button" value="Add Customer"
				onclick="window.location.href='showFormForAdd';return false;"
				class="add-button" />
		</div>
	</div>
</body>
</html>

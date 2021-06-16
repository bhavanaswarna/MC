<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<title>Customer-List</title>
<body>
	<div id="wrapper">
		<div id="header">
			<h1 align = "center">Customer Management</h1>
		</div>
	</div>
	<div id="container">
		<h2>Save Customer</h2>
		<form:form action="saveCustomer" modelAttribute="customer"
			method="POST">
			<form:hidden path="id" />
			<table>
				<tbody>
					<tr>
						<td><label>First Name:</label></td>
						<td><form:input path="firstName" /></td>
					</tr>
					<tr>
						<td><label>Last Name:</label></td>
						<td><form:input path="lastName" /></td>
					</tr>
					<tr>
						<td><label>Email:</label></td>
						<td><form:input path="email" /></td>
					</tr>
					
					<tr>
					<br>
						<td><label></label></td>
						<td><input type="submit" value="Save" class="save" /></td>
					</tr>
				</tbody>
			</table>
		</form:form>
		<br>
		<p>
			<a href="${pageContext.request.contextPath}/customer/list">Back To List</a>
	</div>
</body>
</html>

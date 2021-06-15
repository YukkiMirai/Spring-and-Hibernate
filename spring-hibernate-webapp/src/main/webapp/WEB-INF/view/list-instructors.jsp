<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>

<html>

<head>
	<title>List Structors</title>
	
	<!-- reference our style sheet -->

	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/style.css" />

</head>

<body>

	<div id="wrapper">
		<div id="header">
			<a href="${pageContext.request.contextPath}"><h2>Instructor Manager</h2></a>
		</div>
	</div>
	
	<div id="container">
	
		<div id="content">
			
			<!-- put new button: Add Customer -->
			<input type="button" value="Add Instructor"
				onclick="window.location.href='showFormForAdd'; return false"
				class="add-button"
			/>
			<!--  add our html table here -->
			
			<table>
				<tr>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Email</th>
					<th>Action</th>
				</tr>
				<!-- loop over and print our customers -->
				<c:forEach var="tempInstructor" items="${instructors}">
					<!-- construct an "update" link with customer id -->
						<c:url var="tempLink" value="/instructor/showFormForUpdate">						
							<c:param name="instructorId" value="${tempInstructor.id}"></c:param>
						</c:url>
						<c:url var="deleteLink" value="/instructor/delete">
							<c:param name="instructorId" value="${tempInstructor.id}"></c:param>
						</c:url>
						<c:url var="detailLink" value="/instructor/detail">
							<c:param name="instructorId" value="${tempInstructor.id}"></c:param>
						</c:url>
					<tr>
						<td> ${tempInstructor.firstName} </td>
						<td> ${tempInstructor.lastName} </td>
						<td> ${tempInstructor.email} </td>
						<td><a href="${detailLink}">Detail</a>|	<a href="${tempLink}">Update</a>|<a href="${deleteLink}"
							   onclick="if (!(confirm('Are you sure you want to delete this structor?'))) return false">Delete</a></td>
						
					</tr>
				
				</c:forEach>
			</table>
				
		</div>
	
	</div>
	

</body>

</html>










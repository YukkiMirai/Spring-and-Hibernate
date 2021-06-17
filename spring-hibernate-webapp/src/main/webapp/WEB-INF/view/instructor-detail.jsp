<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Detail</title>
</head>

<body>
	<h2>INSTRUCTOR</h2>
	<h1>${instructor.firstName }
		<%=" "%>
		${instructor.lastName }
	</h1>
	<h2>Youtube Channel</h2>
	<h3>${instructor.instructorDetail.youtubeChannel }</h3>
	<h2>Hobby</h2>
	<h3>${instructor.instructorDetail.hobby }</h3>
	<c:url var="tempLink" value="/instructor/showFormForUpdateDetail">
		<c:param name="instructorId" value="${instructor.id}"></c:param>
	</c:url>
		
	<a href="${tempLink}">Update</a>
	<h3>Courses List</h3>
	<c:forEach var="tempCourse" items="${instructor.courses}">
		<ul>
			<li>${tempCourse.title}</li>
		</ul>
	</c:forEach>
	<c:url var="addCourse" value="/instructor/showFormForAddCourse">
		<c:param name="instructorId" value="${instructor.id}"></c:param>
	</c:url>
	<a href="${addCourse}">AddCourse</a>
</body>
</html>
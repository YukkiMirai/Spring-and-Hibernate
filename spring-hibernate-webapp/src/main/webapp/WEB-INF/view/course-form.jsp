<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<h1>Form add Course</h1>

<c:set var="instructorId" value="${instructorId }"></c:set>

<form:form modelAttribute="course" action="saveCourse" method="POST">
	Input Title<form:input path="title"/>
	<input value="Submit" type="submit"/>
</form:form>
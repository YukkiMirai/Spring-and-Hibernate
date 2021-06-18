<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<h1>Form add Course</h1>

<form:form modelAttribute="course" action="saveCourse" method="post">
	Input Title<form:input path="title"/>
	<form:hidden path="instructor.id"/>
	<input value="Submit" type="submit"/>	
</form:form>

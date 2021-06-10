<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!doctype html>
<html>

<head>
<title>Student Confirmation</title>
</head>

<body>
	The Student is confirmed: ${student.firstName } ${student.lastName }
	<br><br>
	The Country: ${student.country }
	<br><br>
	Faverite Programing Languages: ${student.faveriteLanguage }
	Operation System: 
	<ul>
		<c:forEach var="temp" items="${student.operatingSystems }">
			<li>${temp}</li>
		</c:forEach>
	
	</ul>
</body>

</html>
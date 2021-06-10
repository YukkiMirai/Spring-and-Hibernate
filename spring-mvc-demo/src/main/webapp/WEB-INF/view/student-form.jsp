<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!doctype html>
<html>

<head>
<title>Student Registration Form</title>
</head>

<body>
	<!--modelAttribute="student" mapping to addAttribute "student" in controller -->
	<form:form action="processForm" modelAttribute="student">
	First name: <form:input path="firstName" />
		<br>
		<br>
		<!-- when form loaded. spring mvc call student.getfirstname, getlastname -->
	Last name: <form:input path="lastName" />
		<br>
		<br>
	
	Country:
	<form:select path="country">
			<form:options items="${student.countryOptions}"></form:options>

		</form:select>
		<br>
		<br>
<%-- 		Java<form:radiobutton path="faveriteLanguage" value="Java" />
		C#<form:radiobutton path="faveriteLanguage" value="C#" />
		PHP<form:radiobutton path="faveriteLanguage" value="PHP" />
		Ruby<form:radiobutton path="faveriteLanguage" value="Ruby" /> --%>
		<form:radiobuttons path="faveriteLanguage" items="${student.faveriteLanguageOptions}"/>
		<br>
		<br>
		Linux<form:checkbox path="operatingSystems" value="Linux"/>
		Mac OS<form:checkbox path="operatingSystems" value="Mac OS"/>
		MS Windows<form:checkbox path="operatingSystems" value="MS Windows"/>
		<br>
		<br>
		<input type="submit" value="Submit" />
	</form:form>

</body>

</html>
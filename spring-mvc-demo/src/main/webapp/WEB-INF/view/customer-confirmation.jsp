<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!doctype html>
<html>
<head>
<title></title>
</head>
<body>

The customer is confirmed: ${customer.firstName } ${customer.lastName }
<br><br>
Free Passes: ${customer.freePasses}
<br><br>
Postal Code: ${customer.postalCode}
<br><br>
Course Code: ${customer.courseCode}
</body>
</html>
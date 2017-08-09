<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<title>Person Details</title>
</head>
<body>
	<div>
		<!-- Modern JSP, no need for Java code. .firstname implicitly calls the getter -->
		Firstname: ${myPerson.firstname}
		Lastname: ${myPerson.lastname}
	</div>
</body>
</html>
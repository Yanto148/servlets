<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<title>Person Details</title>
</head>
<body>
	<h1>Person List</h1>
	${myPersonList}
	<table border="1">
		<c:forEach items="${myPersonList}" var="p">
			<tr>
				<td>${p.firstname}</td>
				<td>${p.lastname}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>
<%@page import="java.util.Date"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome to my first JSP page!</h1>
	<%
		out.println(new Date());
	%>
	<%= new Date() %>
	<form method='post' action='hello.html'> <!-- GEEN / toevoegen, anders is het geen relatief pad -->
		<div>
		Voornaam: 
			<input type='text' name='firstname' id='firstname'>
		</div>
		<div>
		Achternaam: 
			<input type='text' name='lastname' id='lastname'>
		</div>
		<div>
		Leeftijd: 
			<input type='text' name='age' id='age'>
		</div>
		<div>
			<input type='submit' value='Verzenden'>
		</div>
	</form>

</body>
</html>
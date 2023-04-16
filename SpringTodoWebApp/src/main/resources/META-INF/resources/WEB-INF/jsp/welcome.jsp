<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
	<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet" >
	<title>Login</title>
</head>
<body>
	<%@ include file="common/navigation.jspf" %>
	<div class="container">
		<div>Welcome to the TodoApp ${name}, powered by SpringBoot!</div>
		<hr style="color: blue">
		<a href="list-todos">Manage</a>Your todos.
	</div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>******</title>
 
	
</head>
<body>
	<div style="text-align: center">
		<h1>login</h1>
		<form action="login" method="post" id="loginForm">
			<label for="email">Email:</label>
			<input name="email" size="30" />
			<br><br>
			<label for="password">Password:</label>
			<input type="password" name="password" size="30" />
			<br>${message}
			<br><br>			
			<button type="submit">Login</button>
		</form>
	</div>
</body>
<script type="text/javascript">

	$(document).ready(function() {
		$("#loginForm").validate({
			rules: {
				email: {
					required: true,
					email: true
				},
		
				password: "required",
			},
			
			messages: {
				email: {
					required: "Please enter email",
					email: "Please enter a valid email address"
				},
				
				password: "Please enter password"
			}
		});

	});
</script>
</html>
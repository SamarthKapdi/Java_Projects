<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="HelloServlet" method="post">

		<table>

			<tr>
				<th>First Name</th>
				<td><input type="text" value="" name="firstName"
					placeholder="Enter first Name"></td>
			</tr>

			<tr>
				<th>Last Name</th>
				<td><input type="text" value="" name="lastName"
					placeholder="Enter last Name"></td>
			</tr>

			<tr>
				<th>Login</th>
				<td><input type="email" value="" name="login"
					placeholder="Enter yor email"></td>
			</tr>

			<tr>
				<th>Password</th>
				<td><input type="password" value="" name="password"
					placeholder="Enter yor password"></td>
			</tr>

			<tr>
				<th></th>
				<td><input type="submit" value="save"></td>
			</tr>

		</table>

	</form>

</body>
</html>
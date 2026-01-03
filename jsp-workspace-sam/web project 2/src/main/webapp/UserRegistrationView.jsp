<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="Header.jsp"%>

	<div align="center">

		<h1>User Registration</h1>

		<form action="UserRegistrationCtl" method="post">

			<table>
				<tr>
					<th>First Name</th>
					<td><input type="text" value="" name="firstName"
						placeholder="Enter First Name"></td>
				</tr>

				<tr>
					<th>Last Name</th>
					<td><input type="text" value="" name="lastName"
						placeholder="Enter Last Name"></td>
				</tr>


				<tr>
					<th>Login Id</th>
					<td><input type="email" value="" name="login"
						placeholder="Enter your Email Id"></td>
				</tr>

				<tr>
					<th>Password</th>
					<td><input type="password" value="" name="password"
						placeholder="Enter your password"></td>
				</tr>

				<tr>
					<th>Enter DOB</th>
					<td><input type="date" value="" name="dob"></td>
				</tr>

				<tr>
					<th></th>
					<td><input type="submit" value="SignUp"></td>
				</tr>

			</table>
		</form>
	</div>
</body>
</html>
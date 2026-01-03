<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Firdt</title>
</head>
<body>


	<form action="GetFormData.jsp">

		<body>
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
					<th>Mobile No</th>
					<td><input type="number" value="" number="MobileNo"
						placeholder="Enter Mobile Number"></td>
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
					<td><input type="date" value="" name="dob" placeholder="Enter DOB"></td>
				</tr>

				<tr>
					<th>Enter Location</th>
					<td><input type="text" value="" name="location"
						placeholder="Enter Your Location"></td>
				</tr>
				<th>Upload</th>
				<td><input type="file" value="" text="file upload"
					placeholder="upload"></td>
				</tr>
				<tr>
					<th>Are you an Indian Citizen</th>
					<td><input type="checkbox" value="" text="check"
						placeholder="Check nationality"></td>
				</tr>

				
					<tr>
				<th></th>
				<td><input type="submit" value="save" name=""></td>

				
			</table>

		</body>
	</form>
</body>
</html>
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

		<h1>Add Marksheet</h1>

		<form action="MarksheetCtl" method="post">

			<table>
				<tr>
					<th>name</th>
					<td><input type="text" value="" name="name"
						placeholder="Enter Your Name"></td>
				</tr>

				<tr>
					<th>Roll No</th>
					<td><input type="number" value="" name="rollNo"
						placeholder="Enter Your roll no"></td>
				</tr>


				<tr>
					<th>phy</th>
					<td><input type="number" value="" name="phy"
						placeholder="Enter Your roll no"></td>
				</tr>

				<tr>
					<th>chm</th>
					<td><input type="number" value="" name="chm"
						placeholder="Enter Your roll no"></td>
				</tr>

				<tr>
					<th>maths</th>
					<td><input type="number" value="" name="maths"
						placeholder="Enter Your roll no"></td>
				</tr>

				<tr>
					<th></th>
					<td><input type="submit" value="save"></td>
				</tr>

			</table>
		</form>
	</div>
</body>
</html>
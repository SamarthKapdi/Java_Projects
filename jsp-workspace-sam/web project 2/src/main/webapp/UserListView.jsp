<%@page import="com.rays.bean.UserBean"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
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

	<form action="UserListCtl" method="post">
		<%
		List list = (List) request.getAttribute("list");
		%>

		<div align="center">
			<h1>User list</h1>
			<table width="100%" border="1px">

				<tr>
					<th>Select</th>
					<th>id</th>
					<th>firstName</th>
					<th>lastName</th>
					<th>login</th>
					<th>dob</th>
				</tr>

				<%
				Iterator it = list.iterator();

				while (it.hasNext()) {
					UserBean bean = (UserBean) it.next();
				%>
				<tr align="center">
					<td><input type="checkbox" name="ids"
						value="<%=bean.getId()%>"></td>
					<td><%=bean.getId()%></td>
					<td><%=bean.getFirstName()%></td>
					<td><%=bean.getLastName()%></td>
					<td><%=bean.getLogin()%></td>
					<td><%=bean.getDob()%></td>
				</tr>
				<%
				}
				%>


			</table>
			<table>
				<tr>
					<td><input type="submit" name="operation" value="delete"></td>
				</tr>
			</table>

		</div>

	</form>
</body>
</html>
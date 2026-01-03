<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Form data</h1>

	<h1>
		<%=request.getParameter("firstName")%>
		<%=request.getParameter("lastName")%>
		<%=request.getParameter("login")%>
		<%=request.getParameter("password")%>
		<%=request.getParameter("mobile")%>
	</h1>

</body>
</html>
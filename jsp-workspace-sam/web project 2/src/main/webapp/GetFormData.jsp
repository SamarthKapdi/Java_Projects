<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>Form Data:</h1>

	<h2>
		<%=request.getParameter("firstName")%>
		<%=request.getParameter("lastName")%>
		<%=request.getParameter("MobileNo")%>
		<%=request.getParameter("login")%>
		<%=request.getParameter("password")%>
		<%=request.getParameter("dob")%>
		<%=request.getParameter("location")%>
		<%=request.getParameter("file upload")%>
		<%=request.getParameter("check")%>
		<%=request.getParameter("save")%>

	</h2>
</body>
</html>
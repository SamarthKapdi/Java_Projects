<%@ page import="java.util.*, com.rays.bean.MarksheetBean"%>
<meta charset="UTF-8">
<title>Marksheet List</title>
</head>
<body>
	<%@ include file="Header.jsp"%>

	<form action="MarksheetListCtl" method="post">
		<%
		List list = (List) request.getAttribute("list");
		%>

		<div align="center">
			<h1>Marksheet List</h1>
			<table width="100%" border="1px">
				<tr>
					<th>Select</th>
					<th>S.No</th>
					<th>Roll No</th>
					<th>Name</th>
					<th>Physics</th>
					<th>Chemistry</th>
					<th>Maths</th>
				</tr>
				<%
				Iterator it = list.iterator();
				int index = 1;
				while (it.hasNext()) {
					MarksheetBean bean = (MarksheetBean) it.next();
				%>
				<tr align="center">
					<td><input type="checkbox" name="ids"
						value="<%=bean.getId()%>"></td>
					<td><%=index++%></td>
					<td><%=bean.getRollno()%></td>
					<td><%=bean.getName()%></td>
					<td><%=bean.getPhy()%></td>
					<td><%=bean.getChm()%></td>
					<td><%=bean.getMaths()%></td>
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

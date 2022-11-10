<%@page import="com.model.Model"%>
<%@page import="java.util.List"%>
<%@page import="com.dao.UserDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<a href="index.html">Add Data</a>
	<table border="1" width="50%">
	<tr><th>Id</th><th>Name</th><th>Surname</th><th>Email</th><th>Password</th><th>Edit</th><th>Delete</th></tr>
	<%
		List<Model>list =UserDao.viewdata();
	
	
		for(Model m :list)
		{
			
		
	
	
	%>
	
	
	
	
		
		
		<tr><td><%=m.getId() %></td><td><%=m.getName() %></td><td><%=m.getSurname() %></td><td><%=m.getEmail() %></td><td><%=m.getPass() %></td><td><a href="edit.jsp?id=<%=m.getId()%>">Edit</a></td><td><a href="delete.jsp?id=<%=m.getId()%>">Delete</a></td></tr>
		

	
	<%
		}
	%>
		</table>
	

</body>
</html>
<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>Primeiro JSP</title>
<style>
	h1 {
		color: red
	}
</style>
</head>
<body>
<%
	try {
		Class.forName("org.hsqldb.jdbc.JDBCDriver" );
	} catch (ClassNotFoundException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	
	String url = "jdbc:hsqldb:mem:mymemdb";
	String user = "SA";	
	String password = "";
	Connection connection = null;
	
	try {
		connection = DriverManager.getConnection(url,user,password);
		//resp.getWriter().append("Conectou <br>");
		out.append("<h1>Conectado </h1>");
		System.out.println("Conectado");
	} catch (SQLException e) {
		e.printStackTrace();
	}
%>
</body>
</html>
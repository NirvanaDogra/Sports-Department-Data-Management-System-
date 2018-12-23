<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import= "java.sql.*" %>
    
<!DOCTYPE html>
<html>
<form method="post">

<table border="2">
<tr>
<td>ID</td>
<td>NAME</td>
<td>SKILL</td>
<td>ACTION</td>
</tr>
<%

//Class.forName("com.mysql.jdbc.Driver");
String url="jdbc:mysql://localhost/mydb";
String username="root";
String password="";
String query="select * from persons6";
Connection conn=DriverManager.getConnection(url,username,password);
Statement stmt=conn.createStatement();


%>
    

</form>
</html> 

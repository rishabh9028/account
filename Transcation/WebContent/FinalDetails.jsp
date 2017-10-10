<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
int id = Integer.parseInt(session.getAttribute("id").toString());
String Acc_Type = session.getAttribute("Acc_Type").toString();
int total = Integer.parseInt(session.getAttribute("total").toString());
int withdrawl = Integer.parseInt(session.getAttribute("withdrawl").toString());
int balance = Integer.parseInt(session.getAttribute("balance").toString());

%>
<table>
<tr>
<td>Account ID:</td><td><%=id %></td>
</tr>
<tr>
<td>Account Type:</td><td><%=Acc_Type %></td>
</tr>
<tr>
<td>Total Amount:</td><td><%=total %></td>
</tr>
<tr>
<td>Withdrawl Amount:</td><td><%=withdrawl %></td>
</tr>
<tr>
<td>Balance Amount:</td><td><%=balance%></td>
</tr>
</table>
</body>
</html>
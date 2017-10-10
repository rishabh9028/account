<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib 
    uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ADD DETAILS</title>
</head>
<body>
<form action="insert.obj">


<table align="center"  cellspacing="0" cellpadding="1">

<tr><td>Acc_Id</td>
<td>
<select id="Acc_Id" name="Acc_Id">
	<c:forEach items="${sessionScope.list }" var="Acc_Id">
	<option value="${Acc_Id}">${Acc_Id} </option>
	</c:forEach>
	</select>
	</td>
		</tr>
<tr><td>Account Type</td>
<td><select id=Acc_Type name=Acc_Type>
<option value="SelectValue">--Select value--</option>
		<option value=Savings>Savings</option>
		<option value=Current>Current</option>
		</select>
	</td>
	</tr>
	<tr>
<td>Total Amount</td>
<td><input type="text" name="Amount"></td>
</tr>

<tr>
<td>Withdrawl Amount</td>
<td><input type="text" name="AmountW"></td>
</tr>

<th>
<input class ="btn" type="submit" value="Submit">
</th>
</body>
</html>
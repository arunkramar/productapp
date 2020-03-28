<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>List of Products</h1>
<a href="/addProduct">Add Product</a>
<table>
<tr>
<th>Id</th>
<th>Name</th>
<th>Description</th>
<th>Price</th>
</tr>
<c:forEach items="${products}" var="product">
<tr>
<td>${product.id }</td>
<td>${product.name }</td>
<td>${product.description }</td>
<td>${product.price }</td>
</tr>
</c:forEach>
</table>
</body>
</html>
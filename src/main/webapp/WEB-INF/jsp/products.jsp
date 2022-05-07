<%@page pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="styles/main.css"/>
    <title>Product Maintenance</title>
</head>
<body>
<h1>Products</h1>
<p style="color: red">${delete}</p>
<table>
    <tr>
        <th>Code</th>
        <th>Description</th>
        <th>Price</th>
        <th colspan="2"></th>
    </tr>
    <c:forEach items="${products}" var="p">
        <tr>
            <td>${p.code}</td>
            <td>${p.description}</td>
            <td>$ ${p.price}</td>
            <td class="w-50"><a href="/editProduct">Edit</a></td>
            <td class="w-50"><a href="/deleteProduct">Delete</a></td>
        </tr>
    </c:forEach>
</table>
<p></p>
<button><a href="/addProduct">Add Product</a></button>
</body>
</html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<%--header--%>
<body>
<%@ include file="header.jsp" %>
<h1>To jest strona</h1>

<h1>To jest wynik: ${c}</h1>

<%--<c:out value="${param.d}" default="Brak parametru"/>--%>
<table width="100%">
    <tr><th>ID</th><th>Name</th></tr>
<c:forEach var="product" items="${productList}">
<tr>
    <td>${product.id}</td>
    <td>${product.name}</td>
</tr>
</c:forEach>
</table>




<%--footer--%>
<%--http://localhost:8080/home?a=100&b=13--%>
<%@ include file="footer.jsp" %>
</body>
</html>

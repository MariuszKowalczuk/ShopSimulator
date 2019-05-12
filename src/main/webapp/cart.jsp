<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach items="${sessionScope.get('cart').positions}" var="position">
    <p>
        <c:out value="${position.toString()}"/>
    </p>
</c:forEach>
</body>
</html>

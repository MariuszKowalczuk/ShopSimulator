<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach items="${applicationScope.get('positions')}" var="position">
    <p>
        <c:out value="${position}"/>
    </p>
</c:forEach>
</body>
</html>

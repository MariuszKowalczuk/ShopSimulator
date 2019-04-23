<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Sklep</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <c:if test="${sessionScope.get('login') ne null}">
    <p> Witaj użytkowniku ${sessionScope.get('login')}</p></c:if>
    <c:if test="${sessionScope.get('login') eq null}">
        <form name="log-form" method="post" action="/login">
            <input type="text" name="login" placeholder="login"/>
            <input type="password" name="password" placeholder="password"/>
            <button type="submit">
                zaloguj
            </button>
        </form>
    </c:if>
</div>
<%

%>

</body>
<html>
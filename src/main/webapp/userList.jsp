<%--
  Created by IntelliJ IDEA.
  User: ZHOU
  Date: 2020/11/9
  Time: 12:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false"%>
<html>
    <head>
        <title>Title</title>
    </head>
    <body>
        <table border="1">
            <tr>
                <th>id</th>
                <th>姓名</th>
                <th>性别</th>
                <th>地址</th>
            </tr>
            <c:forEach items="${users}" var="user">
                <tr>
                    <th>${user.id}</th>
                    <th>${user.username}</th>
                    <th>${user.sex}</th>
                    <th>${user.address}</th>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: ZHOU
  Date: 2020/11/9
  Time: 20:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<html>
    <head>
        <title>Title</title>
    </head>
    <body>
        <form action="update" method="post" >
            <input hidden type="text" name="id" value="${user.id}"><br><br>
            <input type="text" name="username" value="${user.username}"><br><br>
            <input type="text" name="sex" value="${user.sex}"><br><br>
            <input type="text" name="address" value="${user.address}"><br><br>
            <input type="submit" value="修改">
        </form>
    </body>
</html>

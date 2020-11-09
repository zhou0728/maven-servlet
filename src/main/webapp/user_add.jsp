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
        <form action="add" method="post">
            用户名：<input type="text" name="username" value="${user.username}"><br>
            性别：<input type="text" name="sex" value="${user.sex}"><br>
            地址：<input type="text" name="address" value="${user.address}"><br>
            <input type="submit" value="增加">
        </form>
    </body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2021/10/29
  Time: 11:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/login" method="post">
    <input type="text" name="username">
    <input type="password" name="password">
    <input type="checkbox" name="hobbys" value="女孩">女孩
    <input type="checkbox" name="hobbys" value="男孩">男孩
    <input type="checkbox" name="hobbys" value="电影">电影
    <input type="checkbox" name="hobbys" value="音乐">音乐
    <input type="submit">
</form>
</body>
</html>

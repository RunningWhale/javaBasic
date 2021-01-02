<%--
  Created by IntelliJ IDEA.
  User: 23894
  Date: 2021/1/2
  Time: 15:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p>
    提交请求参数
</p>
<form action="receive.do" method="post">
    姓名：<input type="text" name="name">
    年龄：<input type="text" name="age">
    <input type="submit" value="提交参数">
</form>
<p>使用对象参数接收参数</p>
<form action="receiveObject.do" method="post">
    姓名<input type="text" name="name">
    年龄<input type="text" name="age">
    性别<input type="text" name="sex">
    身高<input type="text" name="height">
    <input type="submit" value="提交对象参数接收参数">
</form>
</body>
</html>

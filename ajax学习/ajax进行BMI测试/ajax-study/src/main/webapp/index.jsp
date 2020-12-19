<%--
  Created by IntelliJ IDEA.
  User: 23894
  Date: 2020/12/19
  Time: 16:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>全局刷新计算BMI</title>
</head>
<body>
<p>全局刷新计算BMI</p>
<form action="bmiPrinter" method="get">
    姓名：<input type="text" name="name"><br>
    身高：（米）<input type="text" name="height"><br>
    体重：（公斤）<input type="text" name="weight"><br>
    <input type="submit">
</form>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: 23894
  Date: 2020/12/19
  Time: 19:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<script type="text/javascript" src="js/index.js"></script>
<head>
    <title>ajax根据省份id获取名称</title>
    <script type="text/javascript" src="js/index.js"></script>
</head>
<body>
<p>ajax根据省份id获取名称</p>
<table>
    <tr>
        <td>省份编号：</td>
        <td><input type="text" id="proid"> </td>
        <td><input type="button" value="搜索"onclick="search()"> </td>
    </tr>
    <tr>
        <td>省份名称：</td>
        <td><input type="text" id="proname"> </td>
    </tr>
    <tr>
        <td>省份简称：</td>
        <td><input type="text" id="projiancheng"> </td>
    </tr>
    <tr>
        <td>省会名称：</td>
        <td><input type="text" id="proshenghui"> </td>
    </tr>
</table>
</body>
</html>

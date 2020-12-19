<%--
  Created by IntelliJ IDEA.
  User: 23894
  Date: 2020/12/19
  Time: 17:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>局部刷新ajax请求</title>
    <script type="text/javascript">
        function doAjax() {
            //1、创建异步对象
            var xmlHttp = new XMLHttpRequest();
            //2、绑定事件
            xmlHttp.onreadystatechange = function () {
                if (xmlHttp.readyState == 4 && xmlHttp.status == 200) {
                    let responseText = xmlHttp.responseText;
                    let htmlHeadingElement = document.createElement("h3");
                    htmlHeadingElement.innerText = responseText
                    document.getElementById("dd").appendChild(htmlHeadingElement)
                }
            }
            //3、初始请求数据
            var name = document.getElementById("name").valueOf();
            var height = document.getElementById("height").value;
            var weight = document.getElementById("weight").value;
            var param = "name=" + name + "&height=" + height + "&weight=" + weight;
            alert(param)
            xmlHttp.open("get", "bmiAjax?" + param);
            //4、发起请求
            xmlHttp.send();
        }
    </script>
</head>
<body>
<div id="dd">
    姓名：<input type="text" id="name"><br>
    身高：（米）<input type="text" id="height"><br>
    体重：（公斤）<input type="text" id="weight"><br>
    <input type="button" value="ajax计算BMI" onclick="doAjax()">
</div>
</body>
</html>

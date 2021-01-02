<%--
  Created by IntelliJ IDEA.
  User: 23894
  Date: 2021/1/2
  Time: 17:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="js/jquery-3.5.1.js"></script>
    <script type="text/javascript">
        $(function () {
            $("button").click(function () {
                $.ajax({
                    url:"returnvoid.do",
                    data:{
                        name:"张三",
                        age:20
                    },
                    type:"post",
                    dataType:"json",
                    success:function (response) {
                         alert(response)

                    }
                })
            })
        })
    </script>
</head>
<body>
<form action="returnString.do">
    姓名：<input type="text" name="name">
    <input type="submit" value="提交返回值String">
</form>

<button id="btn">发起ajax请求</button>
</body>
</html>

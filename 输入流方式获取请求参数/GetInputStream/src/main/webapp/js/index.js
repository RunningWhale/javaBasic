$(function () {
    $("button").click(function () {
        console.log(123)
        $.post("getinputstream", {内容:$("textarea").text()}, function (data) {
            let html="<h3>" +data+ "</h3>"
            $("body").append(html);
        })

    })
})
//$.get(URL,data,function(data,status,xhr),dataType)   data是连同请求发送到服务器的数据  dataType是规定预期的服务器响应的数据类型。
// 默认地，jQuery 会智能判断。
//$(selector).post(URL,data,function(data,status,xhr),dataType)
//$.ajax({name:value, name:value, ... })
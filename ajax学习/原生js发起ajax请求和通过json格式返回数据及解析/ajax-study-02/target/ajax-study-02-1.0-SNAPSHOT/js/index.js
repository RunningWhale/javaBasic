function search() {
    var xmlHttp = new XMLHttpRequest();
    xmlHttp.onreadystatechange = function () {
        if (xmlHttp.readyState == 4 && xmlHttp.status == 200) {
            var data=xmlHttp.responseText;
            //eval是执行括号中的代码，bajson字符串转为json对象
            var jsonobj=eval("("+data+")")
            document.getElementById("proid").value=jsonobj.id
            document.getElementById("proname").value=jsonobj.name
            document.getElementById("projiancheng").value=jsonobj.jiancheng
            document.getElementById("proshenghui").value=jsonobj.shenghui


        }
    }
    var proid = document.getElementById("proid").value
    xmlHttp.open("get", "queryProvice?proid=" + proid)
    xmlHttp.send()
}
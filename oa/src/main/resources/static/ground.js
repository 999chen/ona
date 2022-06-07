window.onload=function () {
    var data=window.location.search;
    //localhost:8080/problem发起的请求data.index("?")的值是-1,而login发起的请求哪怕没有请求参数和？
    // 其data.index("?")的值为0，包括带参情况下也为0；
    // alert(data);
    // alert(data.indexOf("?"));
    if (data.indexOf("?")==- 1){
        window.location.href="http://localhost:8080/login.html";
    }
    else{
        // 1.将用户名封装在头像框中
    if (data.indexOf("?"!=-1)){
        var start=data.indexOf("=")+1;
        var len=data.indexOf("&");
        data=data.substr(start,len-start);
    }
    $("#username").text(data);
    }
}

//搜索
var btn=$("#btn")
function getData() {
    var problem = $("#problem").val();
    // alert(problem);
    window.location.href="http://localhost:8080/searchresult.html?problem="+problem;
}
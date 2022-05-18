window.onload=function () {
    var data=window.location.search;

    //localhost:8080/problem发起的请求data.index("?")的值是-1,而login发起的请求哪怕没有请求参数和？
    // 其data.index("?")的值为0，包括带参情况下也为0；
    if (data.indexOf("?")==-1){
        window.location.href="http://localhost:8080/login.html";
    }else {
        // alert(data);
    }
}

//搜索
var btn=$("#btn")
function getData() {
    var problem = $("#problem").val();
    // alert(problem);
    window.location.href="http://localhost:8080/searchresult.html?problem="+problem;
}
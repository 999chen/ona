window.onload=function () {
// 1.将发送请求的题目信息封装在搜索框中
    var problem = window.location.search;
    // alert(problem);
    if (problem.indexOf("?"!=-1)){
        problem=problem.substr(problem.indexOf("=")+1);
    }
    $("#problem").val(problem);
// ajax异步传输
    $.ajax({
        // 请求地址
        url: "http://localhost:8080/search",
        // 数据传输方式
        type: "get",
        //从前台传后台的数据
        data: {problem: problem},
        // 从后台传到前台的数据类型
        dataType: "json",
        // 请求成功,function形参data用来接收从后台传过来的数据
        success: function (data) {
           $("#user1").text("");
           $("#user1").append(data[0].pushuser);
           $("#title1").text("");
           $("#title1").append(data[0].title);
           $("#problemmessage").text("");
           $("#problemmessage").append(data[0].problem);
           $("#good1").text("");
           $("#good1").append(data[0].good);
           $("#comment").text("");
           $("#comment").append(data[0].comment);
           $("#star").text("");
           $("#star").append(data[0].star);
           $("#pushtime").text("");
           $("#pushtime").append(data[0].pushtime);
        },
        // 请求失败
        error: function () {
            alert("失败！")
        }
    });
}




function getData() {
    var problem = $("#problem").val()
    $.ajax({
        // 请求地址
        url: "http://localhost:8080/search",
        // 数据传输方式
        type: "get",
        //从前台传后台的数据
        data: {problem: problem},
        // 从后台传到前台的数据类型
        dataType: "json",
        // 请求成功,function形参data用来接收从后台传过来的数据
        success: function (data) {
            cutval(data);
        },
        // 请求失败
        error: function () {
            alert("失败！")
        }
});
}

function cutval(data) {
    $("#user1").text("");
    $("#user1").append(data[0].pushuser);
    $("#title1").text("");
    $("#title1").append(data[0].title);
    $("#problemmessage").text("");
    $("#problemmessage").append(data[0].problem);
    $("#good1").text("");
    $("#good1").append(data[0].good);
    $("#comment").text("");
    $("#comment").append(data[0].comment);
    $("#star").text("");
    $("#star").append(data[0].star);
    $("#pushtime").text("");
    $("#pushtime").append(data[0].pushtime);
}
window.onload=function () {
// 1.将发送请求的题目信息封装在搜索框中
    var problem = window.location.search;
    alert(problem);
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
            console.log(data[0].pushuser);
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
           // $("#user1").html(data.pushuesr);
           // $("#title1").html(data.title);
           // $("#problemmessage").html(data.problem);
           // $("#good1").html(data.good);
           // $("#comment").html(data.comment);
           // $("#star").html(data.star);
           // $("#pushtime").html(data.pushtime);
            alert("成功")

        },
        // 请求失败
        error: function () {
            alert("失败！")
        }
    });
}
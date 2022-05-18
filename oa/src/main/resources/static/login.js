var btn=$("#btn");
function sent(){
    var username=$("#username").val();
    var password=$("#password").val();
    // ajax异步传输
    $.ajax({
        // 请求地址
        url:"http://localhost:8080/login",
        // 数据传输方式
        type:"get",
        //从前台传后台的数据
        data:{username:username,password:password},
        // 从后台传到前台的数据类型
        dataType:"json",
        // crossDomain:true,
        // 请求成功,function形参data用来接收从后台传过来的数据
        success:function(data){
            if(data.result=true){
                window.location.href="http://localhost:8080/ground.html?username="+data.username+"&id="+data.id;
            }
        },
        // 请求失败
        error:function(){
            alert("失败！")
        }
    });
    // 输出采集到的数据
}
<%--
  Created by IntelliJ IDEA.
  User: jason
  Date: 2022/1/11
  Time: 20:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录界面</title>
    <style>
        #frame_{
            width: 400px;
            height: 300px;
            margin-left: 480px;
            margin-top: 180px;
            background-color: azure;
            border: black solid 2px;
        }
        #inner_{
            margin-left: 80px;
            margin-top: 40px;
        }
    </style>

    <%--
        在这里写js代码，对登录数据进行验证：
          用户ad是否为空
            先去拿input标签里面的值  判断是否为空
          为空的时候
             就返回  并且来一个提示操作：用户id不能为空
          密码是否为空
            先去拿input标签里面的值  判断是否为空
            为空的时候
             就返回  并且来一个提示操作：密码不能为空
    --%>
</head>
<body>
<div id="frame_">
    <div id="inner_">
        <h1 style="margin-left: 30px">丹徒宜瑞检测</h1><br>
    用户id：<input type="text" id="u_id"><br><br>
    &nbsp;&nbsp;&nbsp;密码：<input type="password" id="u_pwd"><br><br>
    <button style="margin-left: 60px" id="btn01">重置</button><button style="margin-left: 40px" id="btn02">登录</button><br>
        <span id="error" style="color: red"></span>
        <script>
            let btn001 = document.getElementById("btn02");
            btn001.onclick=function () {
                //1.获取id查看是否为空
                let id_str = document.getElementById("u_id").value;
                if (id_str==null||id_str==""){
                    document.getElementById("error").innerHTML="账户不能为空！"
                    return;
                }
                let pwd_str=document.getElementById("u_pwd").value;
                if (pwd_str==null||pwd_str==""){
                    document.getElementById("error").innerHTML="密码不能为空！"
                    return;
                }
                //账号密码都不为空就可以开始访问服务器
                window.location.herf ="login?u_id="+id_str+"&u_pwd="+pwd_str;
            }
        </script>
    </div>
</div>
</body>
</html>

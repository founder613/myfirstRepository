<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>登录</title>
    <script src="/TicketSystem /js/jquery.js"></script>
    <script src="/TicketSystem/bootstrap-3.3.7-dist/js/bootstrap.js"></script>
    <link rel="stylesheet" href="/TicketSystem/bootstrap-3.3.7-dist/css/bootstrap.css"/>
</head>
<body>
<form style="text-align: center;margin-top: 100px;"method="post"action="/TicketSystem/UserController?type=login">
    <h1 align="center">登录</h1>
    <div class="panel-body" style="padding:30px; padding-bottom:10px; padding-top:10px;">
        <div class="form-group">
            <div class="field field-icon-right">
                <input style="height: 40px" type="text" autofocus="autofocus" class="input input-big" name="uname" placeholder="登录账号" data-validate="required:请填写账号" />
                <span class="icon icon-user margin-small"></span>
            </div>
        </div>
    </div>
    <div class="form-group">
        <div class="field field-icon-right">
            <input style="height: 40px" type="password" class="input input-big" name="upwd" placeholder="登录密码" data-validate="required:请填写密码" />
            <span class="icon icon-key margin-small"></span>
        </div>
    </div>
    <div class="form-group">
        <div class="field">
            <input style="height: 40px;margin-left: 65px" type="text" class="input input-big" name="code" placeholder="填写右侧的验证码" data-validate="required:请填写右侧的验证码" />
            <img src="/TicketSystem/ValidateCodeServlet" id="yancode" alt="验证码" title="验证码"/><br/>
            <a href="/TicketSystem/UserController?type=regist"style="margin-left: 30px" >点击注册</a>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
            <a  href="javascript:changeCodes()"id="change">看不清？点我切换</a>
        </div>
    </div>
    <div style="padding:10px;">
        <button type="submit"class="btn-info"style="height: 30px;width: 160px">登录</button>
    </div>
</form>

</body>
</html>
<script>
    function changeCodes(){
        $('#yancode').prop('src','/TicketSystem/ValidateCodeServlet?time='+new Date());

    }
</script>
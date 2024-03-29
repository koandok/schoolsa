<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="/base/base.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<base href="<%=basePath%>">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
    <meta name="renderer" content="webkit">
    <title>登录</title>  
    <link rel="stylesheet" href="css/pintuer.css">
    <link rel="stylesheet" href="css/admin.css">
      <link rel="shortcut icon" href="images/logo.jpg">
    <script src="js/jquery.js"></script>
    <script src="js/pintuer.js"></script>  
</head>


<body>
<div class="bg"></div>
<div class="container">
    <div class="line bouncein">
        <div class="xs6 xm4 xs3-move xm4-move">
            <div style="height:150px;"></div>
            <div class="media media-y margin-big-bottom">           
            </div>         
            <form  action="<!-- AdminAction_login.action -->" method="post" target="_parent" >
            <div class="panel loginbox">
                <div class="text-center margin-big padding-big-top"><h1>考勤管理系统</h1></div>
                <div class="panel-body" style="padding:30px; padding-bottom:10px; padding-top:10px;">
                    <div class="form-group">
                 
    			 <div class="field field-icon-right">
                            <input type="text" class="input input-big" name="adminId" placeholder="登录账号" data-validate="required:请填写账号" />
                            <span class="icon icon-user margin-small"></span>
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="field field-icon-right">
                            <input type="password" class="input input-big" name="password" placeholder="登录密码" data-validate="required:请填写密码" />
                            <span class="icon icon-key margin-small"></span>
                        </div>
                    </div>
     
                    <div class="userfield" style="padding-top:8px;"align="center"> 
          			 学生 <input id="user_A"  type="radio" name="type" value="A" checked="checked"/>
        			 老师 <input id="user_B"  type="radio" name="type" value="B" />
         			 管理员 <input id="user_C"  type="radio" name="type" value="C" />         
                    </div>
                </div>
                <div style="padding:30px;"><input type="submit" class="button button-block bg-main text-big input-big"  value="登录" onclick="form.action='AdminAction_login.action';form.submit();"></div>
                 <div style="padding:30px;"><input type="submit" href="register.jsp" class="button button-block bg-main text-big input-big" value="注册"></div>
            </div>
            </form>          
        </div>
    </div>
</div>

</body>
</html>
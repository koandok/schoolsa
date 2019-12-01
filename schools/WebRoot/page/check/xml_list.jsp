<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ include file="/base/base.jsp"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
<meta name="renderer" content="webkit">
<title>用户信息列表</title>
<link rel="stylesheet" href="css/pintuer.css">
<link rel="stylesheet" href="css/admin.css">
<link rel="shortcut icon" href="images/logo.jpg">
<script src="js/jquery.js"></script>
<script src="js/pintuer.js"></script>

</head>

<body>
<form method="post" action="xml_out.action" id="listform">
  <div class="panel admin-panel">
    <div class="panel-head"><strong class="icon-reorder"> 用户列表</strong> </div>
    <div class="padding border-bottom" align="center">
		<div class="panel admin-panel">
			<div class="padding border-bottom">
				<div class="button-group">
		
					<button class="button bg-main icon-check-square-o" type="submit">导出</button>
	    		</div>
			</div>
		</div>
     
    </div>
    <table class="table table-hover text-center">
      <tr>  				
			<th>老师ID</th>
			<th>课程ID</th>
			<th>学生ID</th>
			<th>学生名字</th>
			<th>班级</th>
			<th>时间</th>
			<th>状态</th>
       </tr>
       <s:iterator value="atsheetlist">
			    <tr>
		          	<td>${tid}</td>
		          	<td>${cid}</td>
		          	<td>${sid}</td>
		          	<td>${sname}</td>
		          	<td>${classes}</td>
		          	<td>${ctime}</td>
		          	<td>${stats}</td>

			</tr>
	 </s:iterator>
    </table>
  </div>
  <div class="pagelist"> <a href="">上一页</a> <span class="current">1</span><a href="">2</a><a href="">3</a><a href="">下一页</a><a href="">尾页</a> </div>
</form>
</body>
</html>

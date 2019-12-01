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
<form method="post" action="<%=path%>/ArtServlet?action=list_user " id="listform">
  <div class="panel admin-panel">
    <div class="panel-head"><strong class="icon-reorder"> 用户列表</strong> </div>
   <%--  <form method="post" action="<%=path%>/BuildServlet?action=seach" > --%>
    <div class="padding border-bottom">
      <ul class="search" style="padding-left:10px;">

        <li> <a class="button border-main icon-plus-square-o" href="page/course/course_add.jsp"> 添加用户</a> </li>
            
     
      </ul>


    </div>
    <!-- </form>  -->
    <table class="table table-hover text-center">
      <tr>  				
			<th>课程编号</th>
			<th>课程名称</th>
			<th>老师ID</th>
			<th>教室</th>
			<th>上课时间</th>
			<th>上课人数</th>
			<th>学分</th>
			<th>学时</th>
			<th>操作</th>
       </tr>
       <s:iterator value="courselist">
			<tr>
				    <td>${cid}</td>
					<td>${cname}</td>
					<td>${tid}</td>
		          	<td>${room}</td>
		          	<td>${ctime}</td>
		          	<td>${cpeople}</td>
		          	<td>${credit}</td>
		          	<td>${chour}</td>
				<td>	
				<div class="button-group"> 
				<a class="button border-main" href="tex_get.action?tid=${tid}&cid=${cid}&ctime=${ctime}"><span class="icon-edit"></span> 修改</a> 
				<a class="button border-red" href="tex_delete.action?tid=${tid}&cid=${cid}"><span class="icon-trash-o"></span> 删除</a> </div>
				</td>
			</tr>
	 </s:iterator>
    </table>
  </div>
  <div class="pagelist"> <a href="">上一页</a> <span class="current">1</span><a href="">2</a><a href="">3</a><a href="">下一页</a><a href="">尾页</a> </div>
</form>
</body>
</html>

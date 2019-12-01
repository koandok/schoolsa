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

        <li> <a class="button border-main icon-plus-square-o" href="page/classes/classes_add.jsp"> 添加用户</a> </li>
            
     
      </ul>


    </div>
    <!-- </form>  -->
    <table class="table table-hover text-center">
      <tr>  				
			<th>班级编号</th>
			<th>班级名称</th>
			<th>操作</th>
       </tr>
       <s:iterator value="list">
			<tr>
				    <td>${classid}</td>
					<td>${classes}</td>

				<td>	
				<div class="button-group"> 
				<a class="button border-main" href="classes_get.action?classid=${classid}"><span class="icon-edit"></span> 修改</a> 
				<a class="button border-red" href="classes_delete.action?classid=${classid}"><span class="icon-trash-o"></span> 删除</a> </div>
				</td>
			</tr>
	 </s:iterator>
    </table>
  </div>
  <div class="pagelist"> <a href="">上一页</a> <span class="current">1</span><a href="">2</a><a href="">3</a><a href="">下一页</a><a href="">尾页</a> </div>
</form>
</body>
</html>

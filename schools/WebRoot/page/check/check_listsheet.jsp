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
  <div class="panel admin-panel">
    <div class="panel-head"><strong class="icon-reorder"> 用户列表</strong> </div>
           <s:iterator value="atlist">
   <form method="post" action="check_list.action?cid=${cid}">
    </s:iterator>
    <div class="padding border-bottom" align="center">
           <ul class="search">
 			点名人数：
	        <select  name="num">
	        <option value="0">全班</option> 
	        <option value="3">3</option> 
	         <option value="20">20</option> 
	          <option value="30">30</option> 
	          </select>
       <input type="submit" value="确定"class="button border-main icon-search"  ></li>
      </ul>

    </div>
    <table class="table table-hover text-center">
      <tr>  				
			<th>学生ID</th>
			<th>学生名字</th>
			<th>班级</th>
			<th>操作</th>
       </tr>
       <s:iterator value="atlist">
			    <tr>
		          	<td>${sid}</td>
		          	<td>${sname}</td>
		          	<td>${classes}</td>
				<td>	
				<div class="button-group"> 
				<a class="button border-main" href="check_add.action?attendanceSheet.cid=${cid}&attendanceSheet.sid=${sid}&attendanceSheet.sname=${sname}&attendanceSheet.classes=${classes}&attendanceSheet.stats=正常"><span class="icon-edit"></span>正常</a>
				<a class="button border-main" href="check_add.action?attendanceSheet.cid=${cid}&attendanceSheet.sid=${sid}&attendanceSheet.sname=${sname}&attendanceSheet.classes=${classes}&attendanceSheet.stats=缺勤"><span class="icon-edit"></span>旷课</a> 
				<a class="button border-main" href="check_add.action?attendanceSheet.cid=${cid}&attendanceSheet.sid=${sid}&attendanceSheet.sname=${sname}&attendanceSheet.classes=${classes}&attendanceSheet.stats=迟到"><span class="icon-edit"></span>迟到</a> 
				<a class="button border-main" href="check_add.action?attendanceSheet.cid=${cid}&attendanceSheet.sid=${sid}&attendanceSheet.sname=${sname}&attendanceSheet.classes=${classes}&attendanceSheet.stats=早退"><span class="icon-edit"></span>早退</a>  
				</div>
				</td>
			</tr>
	 </s:iterator>
    </table>
  </div>
  <div class="pagelist"> <a href="">上一页</a> <span class="current">1</span><a href="">2</a><a href="">3</a><a href="">下一页</a><a href="">尾页</a> </div>
</form>
</body>
</html>

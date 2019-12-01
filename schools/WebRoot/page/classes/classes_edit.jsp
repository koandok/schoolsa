<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="/base/base.jsp"%>
<!DOCTYPE html>
<html lang="zh-cn">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
		<meta name="renderer" content="webkit">
		<title></title>
		<link rel="stylesheet" href="<%=path %>/css/pintuer.css">
		<link rel="stylesheet" href="<%=path %>/css/admin.css">
		<script src="<%= basePath%>/js/jquery.js"></script>
		<script src="<%= basePath%>/js/pintuer.js"></script>
	</head>
	<body>
		<div class="panel admin-panel">
		  <div class="panel-head" id="add"><strong><span class="icon-pencil-square-o"></span>修改采购清单信息</strong></div>
		  <div class="body-content">
		    <form method="post" class="form-x" action="classes_update.action">  
		      <div class="form-group">
			        <div class="label">
			          <label>课程编号：</label>
			        </div>
			        <div class="field">
			          <input type="text" class="input w50" value="${classid}" name="classid" readonly="readonly"/>
			          <div class="tips"></div>
			        </div>
		      	</div>
		      <div class="form-group">
		      	<div class="label">
		          <label>课程名称：</label>
		        </div>
		        <div class="field">
		          <input type="text" class="input w50" value="${classes}" name="classes" data-validate="required:请输入" />
		          <div class="tips"></div>
		        </div>
		      </div>

		      <div class="form-group">
		        <div class="label">
		          <label></label>
		        </div>
		        <div class="field">
		          <button class="button bg-main icon-check-square-o" type="submit"> 提交</button>
		        </div>
		      </div>
		    </form>
		  </div>
		</div>
		<script src="<%= basePath%>/laydate/laydate.js"></script>
		<script type="text/javascript">
		     laydate.render({
		       elem: '#purchaseTime'
		      ,type: 'datetime'
		     });
		</script>
	</body>
</html>
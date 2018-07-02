<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" type="text/css"
	href="static/h-ui/css/H-ui.min.css" />
<link rel="stylesheet" type="text/css"
	href="static/h-ui.admin/css/H-ui.admin.css" />
<link rel="stylesheet" type="text/css"
	href="lib/Hui-iconfont/1.0.8/iconfont.css" />
<link rel="stylesheet" type="text/css"
	href="static/h-ui.admin/skin/default/skin.css" id="skin" />
<link rel="stylesheet" type="text/css"
	href="static/h-ui.admin/css/style.css" />
<!--[if IE 6]>
<script type="text/javascript" src="lib/DD_belatedPNG_0.0.8a-min.js" ></script>
<script>DD_belatedPNG.fix('*');</script>
<![endif]-->
<!--/meta 作为公共模版分离出去-->

<title>基本设置</title>
<script type="text/javascript">
	function getmodule() {
		var systemKey = $("#department").val(); //获得第一个列表元素的主键  
		var obj = document.getElementById("posts");//回去id为。。的html元素  
		$
				.ajax({
					type : 'GET',
					contentType : 'application/json',
					url : 'SelectPostsByDepartmentIDToUpdateServlet?value='
							+ systemKey, //调用后台控制类的方法  
					dataType : 'json',
					success : function(data) {
						obj.options.length = 0;
						obj.options.add(new Option("选择岗位", 0));
						$.each(data, function(i, item) {
							obj.options.add(new Option(item.postName,
									item.postID));
						});
					}
				});
	}

	function getmodule1() {
		var systemKey = $("#posts").val(); //获得第一个列表元素的主键  
		var obj = document.getElementById("module");//回去id为。。的html元素  
		$.ajax({
			type : 'GET',
			contentType : 'application/json',
			url : 'SelectModuleByPostIDToUpdateServlet?value=' + systemKey, //调用后台控制类的方法  
			dataType : 'json',
			success : function(data) {
				obj.options.length = 0;
				obj.options.add(new Option("选择模块", 0));
				$.each(data,
						function(i, item) {
							obj.options.add(new Option(item.moduleName,
									item.moduleID));
						});
			}
		});
	}
</script>
</head>
<body>

	<div class="page-container">
		<form class="form form-horizontal" id="form-article-add"
			action="UpdateKpiIndexByKpiIDServlet">
			<div id="tab-system" class="HuiTab">

				<div class="tabCon">
					<div class="row cl">
						<label class="form-label col-xs-4 col-sm-2"> <span
							class="c-red">*</span> 选择部门：
						</label>
						<div class="formControls col-xs-8 col-sm-9">
							<select name="search_systemKey" onchange="getmodule()"
								class="select" id="department">
								<option value="0">选择部门</option>
								<c:forEach items="${departmentlist}" var="item">
									<option value="${item.departmentID }">${item.depaertmantName }</option>
								</c:forEach>
							</select>
						</div>
					</div>
					<div class="row cl">
						<label class="form-label col-xs-4 col-sm-2"> <span
							class="c-red">*</span> 选择岗位：
						</label>
						<div class="formControls col-xs-8 col-sm-9">
							<select name="search_moduleKey" onchange="getmodule1()"
								class="select" id="posts">
								<option value="0">选择岗位</option>
							</select>
						</div>
					</div>
					<div class="row cl">
						<label class="form-label col-xs-4 col-sm-2"> <span
							class="c-red">*</span> 选择模块：
						</label>
						<div class="formControls col-xs-8 col-sm-9">
							<select name="search_systemKey1" class="select" id="module">
								<option value="0">选择模块</option>
								<c:forEach items="" var="item">
									<option value=""></option>
								</c:forEach>
							</select>
						</div>
					</div>
					<div class="row cl">
						<label class="form-label col-xs-4 col-sm-2"> <span
							class="c-red">*</span> KPI指标名称：
						</label> <input type="hidden" name="kpiindexID"
							value="${kpiindex1.kpiIndexID }">
						<div class="formControls col-xs-8 col-sm-9">
							<input type="text" id="website-title" name="kpiindexName"
								placeholder="控制在25个字、50个字节以内" value="${kpiindex1.kpiIndexName }"
								class="input-text">
						</div>
					</div>
					<div class="row cl">
						<label class="form-label col-xs-4 col-sm-2"> <span
							class="c-red">*</span> 权重：
						</label>
						<div class="formControls col-xs-8 col-sm-9">
							<input type="text" name="weight" id="website-Keywords"
								placeholder="数字加百分号(%)" value="${kpiindex1.weight }"
								class="input-text">
						</div>
					</div>
					<div class="row cl">
						<label class="form-label col-xs-4 col-sm-2"> <span
							class="c-red">*</span> 取值范围：
						</label>
						<div class="formControls col-xs-8 col-sm-9">
							<input type="text" name="span" id="website-Keywords"
								placeholder="数字加百分号(%)" value="${kpiindex1.span }"
								class="input-text">
						</div>
					</div>
					<div class="row cl">
						<label class="form-label col-xs-4 col-sm-2"> <span
							class="c-red">*</span> 指标示意：
						</label>
						<div class="formControls col-xs-8 col-sm-9">
							<textarea name="indexDefinition" class="textarea">${kpiindex1.indexDefinition }</textarea>
						</div>
					</div>
					<div class="row cl">
						<label class="form-label col-xs-4 col-sm-2"> <span
							class="c-red">*</span> 数据来源：
						</label>
						<div class="formControls col-xs-8 col-sm-9">
							<input type="text" id="website-static" name="dateSources"
								placeholder="控制在25个字、50个字节以内" value="${kpiindex1.dateSources }"
								class="input-text">
						</div>
					</div>
					<div class="row cl">
						<label class="form-label col-xs-4 col-sm-2"> <span
							class="c-red">*</span> 计算公式：
						</label>
						<div class="formControls col-xs-8 col-sm-9">
							<input type="text" id="website-uploadfile"
								name="computationalFormula" placeholder="控制在25个字、50个字节以内"
								value="${kpiindex1.computationalFormula }" class="input-text">
						</div>
					</div>
					<div class="row cl">
						<label class="form-label col-xs-4 col-sm-2"> <span
							class="c-red">*</span> 年度目标：
						</label>
						<div class="formControls col-xs-8 col-sm-9">
							<input type="text" id="website-copyright" name="annualObjectives"
								placeholder="百分比(%)或文字描述" value="${kpiindex1.annualObjectives }"
								class="input-text">
						</div>
					</div>
					<div class="row cl">
						<label class="form-label col-xs-4 col-sm-2">备季度核算：</label>
						<div class="formControls col-xs-8 col-sm-9">
							<input type="text" id="website-icp" name="quarterlyAccounting"
								placeholder="" value="${kpiindex1.quarterlyAccounting }"
								class="input-text">
						</div>
					</div>
					<div class="row cl">
						<label class="form-label col-xs-4 col-sm-2">当期目标：</label>
						<div class="formControls col-xs-8 col-sm-9">
							<input type="text" id="website-icp" placeholder="百分比(%)或文字描述"
								name="currentTarget" value="${kpiindex1.currentTarget }"
								class="input-text">
						</div>
					</div>
				</div>
			</div>
			<div class="row cl">
				<div class="col-xs-8 col-sm-9 col-xs-offset-4 col-sm-offset-2">
					<button onClick="article_save_submit();"
						class="btn btn-primary radius" type="submit">
						<i class="Hui-iconfont">&#xe632;</i> 保存
					</button>
					<button onClick="layer_close();" class="btn btn-default radius"
						type="button">&nbsp;&nbsp;取消&nbsp;&nbsp;</button>
					<span>${message }</span>
				</div>
			</div>
		</form>
	</div>

	<!--_footer 作为公共模版分离出去-->
	<script type="text/javascript" src="lib/jquery/1.9.1/jquery.min.js"></script>
	<script type="text/javascript" src="lib/layer/2.4/layer.js"></script>
	<script type="text/javascript" src="static/h-ui/js/H-ui.min.js"></script>
	<script type="text/javascript" src="static/h-ui.admin/js/H-ui.admin.js"></script>
	<!--/_footer 作为公共模版分离出去-->

	<!--请在下方写此页面业务相关的脚本-->
	<script type="text/javascript"
		src="lib/My97DatePicker/4.8/WdatePicker.js"></script>
	<script type="text/javascript"
		src="lib/jquery.validation/1.14.0/jquery.validate.js"></script>
	<script type="text/javascript"
		src="lib/jquery.validation/1.14.0/validate-methods.js"></script>
	<script type="text/javascript"
		src="lib/jquery.validation/1.14.0/messages_zh.js"></script>
	<script type="text/javascript">
		$(function() {
			$('.skin-minimal input').iCheck({
				checkboxClass : 'icheckbox-blue',
				radioClass : 'iradio-blue',
				increaseArea : '20%'
			});
			$("#tab-system").Huitab({
				index : 0
			});
		});
	</script>
	<!--/请在上方写此页面业务相关的脚本-->
</body>
</html>

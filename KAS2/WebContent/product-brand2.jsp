<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta name="keywords" content="jquery,ui,easy,easyui,web">
<meta name="description"
	content="easyui help you build your web page easily!">
<link rel="stylesheet" type="text/css"
	href="static/h-ui/css/H-ui.min.css" />
<link rel="stylesheet" type="text/css"
	href="static/h-ui.admin/css/H-ui.admin.css" />
<link rel="stylesheet" type="text/css"
	href="lib/Hui-iconfont/1.0.8/iconfont.css" />
<link rel="stylesheet" type="text/css" href="css/easyui.css">
<link rel="stylesheet" type="text/css" href="css/icon.css">
<link rel="stylesheet" type="text/css" href="css/demo.css">
<link rel="stylesheet" type="text/css"
	href="static/h-ui.admin/skin/default/skin.css" id="skin" />
<link rel="stylesheet" type="text/css"
	href="static/h-ui.admin/css/style.css" />
<!--[if IE 6]>
<script type="text/javascript" src="lib/DD_belatedPNG_0.0.8a-min.js" ></script>
<script>DD_belatedPNG.fix('*');</script>
<![endif]-->

<script type="text/javascript">
	function getPath(obj) {
		if (obj) {
			if (window.navigator.userAgent.indexOf("MSIE") >= 1) {
				obj.select();
				return document.selection.createRange().text;
			} else if (window.navigator.userAgent.indexOf("Firefox") >= 1) {
				if (obj.files) {
					return obj.files.item(0).getAsDataURL();
				}
				return obj.value;
			}
			return obj.value;
		}
	}

	//以下即为完整客户端路径

	function getPathStr() {
		//var filepath=getPath(document.getElementById("file-2"));
		var file = document.getElementById("file-2");
		file.select();
		var realPath = document.selection.createRange().text;
	}
	
	function getkpiexaminedateperiod() {  
	    var systemKey=$("#department").val(); //获得第一个列表元素的主键  
		var obj=document.getElementById("posts");//回去id为。。的html元素  
	$.ajax({  
	    type : 'GET',    
	    contentType : 'application/json', 
	    url : 'SelectKpiExamineDatePeriod?value='+systemKey, //调用后台控制类的方法  
	    dataType : 'json',    
	    success : function(data) {  
	    	obj.options.length=0; 
	    $.each(data,function(i,item) { 
	        obj.options.add(new Option(item.kpiExamineDatePeriodName,item.kpiExamineDatePeriodID));  
	         }); 
	    }  
	    });  
	}  
</script>
<script type="text/javascript"
	src="http://code.jquery.com/jquery-1.7.1.min.js"></script>
<script type="text/javascript"
	src="http://www.w3cschool.cc/try/jeasyui/jquery.easyui.min.js"></script>
<script type="text/javascript"
	src="http://www.w3cschool.cc/try/jeasyui/datagrid-scrollview.js"></script>
<title>品牌管理</title>
</head>
<body>

	<nav class="breadcrumb"> <i class="Hui-iconfont">&#xe67f;</i> 首页
	<span class="c-gray en">&gt;</span> KPI指标管理 <span class="c-gray en">&gt;</span>
	员工KPI考核导入<a class="btn btn-success radius r"
		style="line-height: 1.6em; margin-top: 3px"
		href="javascript:location.replace(location.href);" title="刷新"><i
		class="Hui-iconfont">&#xe68f;</i></a></nav>
	<div class="page-container">
		<div class="text-c">
			<div style="margin-bottom: 50px;">
				<form class="Huiform" method="post" action="StaffLeadingOutServlet"
					target="_self">
					<span>下载模板 : </span><span class="btn-upload form-group"> <input
						class="input-text upload-url" type="text" name="excelFile1"
						id="excelFile" readonly style="width: 200px"> <a
						href="javascript:void();" class="btn btn-primary upload-btn"><i
							class="Hui-iconfont">&#xe642;</i> 模板文件</a> <input type="file"
						id="file-2" onChange="getPathStr();" multiple name="file-2"
						class="input-file">
					</span>
					<button type="submit" class="btn btn-success" id="" name="">
						<i class="Hui-iconfont">&#xe600;</i> 导出数据
					</button>
					<c:if test="${message1 eq '数据源错误'}">
						<span class="select-box" style="width: 150px">${message1 }
						</span>
					</c:if>
					<c:if test="${message1 eq '数据导出成功'}">
						<span class="select-box" style="width: 150px">${message1 }
						</span>
					</c:if>
				</form>
			</div>
		</div>

		<div class="text-c">
			<div style="margin-bottom: 50px;">
				<form class="Huiform" method="post" action="StaffInsertExcelServlet"
					target="_self">
					<div style="margin-bottom: 50px;">
						请选择考核类型: <span class="select-box inline"> <select
							name="search_systemKey" onchange="getkpiexaminedateperiod()"
							class="select" id="department">
								<option value="0">选择考核类型</option>
								<c:forEach items="${list}" var="item">
									<option value="${item.kpiExamineDateTypeID }">${item.kpiExamineDateTypeName }</option>
								</c:forEach>
						</select>
						</span> <span class="select-box inline"> <select
							name="search_moduleKey" class="select" id="posts">
								<option value="0">选择考核周期</option>
						</select>
						</span>选择时间： <input id="dd" name="dd" type="text" class="easyui-datebox">
					</div>
					<span>导入文件 : </span><span class="btn-upload form-group"> <input
						class="input-text upload-url" type="text" name="excelFile"
						id="excelFile" readonly style="width: 200px"> <a
						href="javascript:void();" class="btn btn-primary upload-btn"><i
							class="Hui-iconfont">&#xe642;</i> 上传文件</a> <input type="file"
						multiple name="file-2" class="input-file">
					</span>
					<button type="submit" class="btn btn-success" id="" name="">
						<i class="Hui-iconfont">&#xe600;</i> 导入数据
					</button>
					<c:if test="${message eq '数据源错误'}">
						<span class="select-box" style="width: 150px">${message } </span>
					</c:if>
					<c:if test="${message eq '数据导入成功'}">
						<span class="select-box" style="width: 150px">${message } </span>
					</c:if>
				</form>
			</div>
		</div>
		<div class="text-c">
			<textarea name="" rows="16" cols="90" readonly="readonly">
数据导入消息：
数据导入成功条数：${insertCount }条
数据导入失败条数：${addBeDefeated }条
数据导入失败数据ID：${addBeDefeated }条
			</textarea>
		</div>
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
		src="lib/datatables/1.10.0/jquery.dataTables.min.js"></script>
	<script type="text/javascript" src="lib/laypage/1.2/laypage.js"></script>
	<script type="text/javascript">
		$('.table-sort').dataTable({
			"aaSorting" : [ [ 1, "desc" ] ],//默认第几个排序
			"bStateSave" : true,//状态保存
			"aoColumnDefs" : [
			//{"bVisible": false, "aTargets": [ 3 ]} //控制列的隐藏显示
			{
				"orderable" : false,
				"aTargets" : [ 0, 6 ]
			} // 制定列不参与排序
			]
		});
	</script>
</body>
</html>
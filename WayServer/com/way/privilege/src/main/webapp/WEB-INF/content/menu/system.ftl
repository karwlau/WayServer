<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>系统列表</title>
<meta http-equiv="content-type" content="text/html; charset=UTF-8">

<#include "../common/easyJs.ftl">
<#include "../common/easyCss.ftl">

<style type="text/css">
</style>
</head>
<script type="text/javascript">
	$().ready(function(){
		//表单提交查询
		$('#searchForm').form({
		    url : '/menu/findSystem',
		    onSubmit: function(){
		        // do some check
		        // return false to prevent submit;
		    },
		    success:function(data){
		        alert(data)
		    }
		});
		
		//数据
		$('#dataList').datagrid({
		    url : '/menu/findSystem',
		    columns : [[
	            {field:'id', width:80, title:'ID'},
	            {field:'name', width:100, title:'系统名称'},
	            {field:'code', width:80, align:'right', title:'系统代码'},
	            {field:'orderNo', width:80, align:'right', title:'排序'}
		    ]],
		    emptyMsg : '没有符合条件数据',
		    loadMsg : '加载中···',
		});
	});
</script>
<body>
    <div data-options="region:'north',title:'',split:false" >
    	<div id="searchFormDiv" class="easyui-panel" title="Search Panel" style="height:auto;padding:5px;">
	    	<div class="easyui-panel" style="padding:5px;" data-options="">
	    		<a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-search'">查找</a>
	    		<a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-add'">新增</a>
	    		<a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-remove'">删除</a>
	    	</div>
	    	<form id="searchForm" method="post">
		    	<div class="easyui-panel" style="padding:5px;">
		    		<input class="easyui-textbox" data-options="label:'系统名称'" style="width:300px">
		    	</div>
	    	</form>
    	</div>
    </div>
    <div data-options="region:'center',title:''" style="padding:5px;background:#eee;">
    	<table id="dataList">
	    </table>
    </div>
</body>
</html>

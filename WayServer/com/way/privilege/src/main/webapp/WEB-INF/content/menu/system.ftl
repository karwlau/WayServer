<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>系统列表</title>
<meta http-equiv="content-type" content="text/html; charset=UTF-8">

<#include "../common/easyJs.ftl">
<#include "../common/easyCss.ftl">

<style type="text/css">
#dataList{
	
}
.formItem{
	width : 300px;
}
</style>
</head>
<script type="text/javascript">
	var record;
	$().ready(function(){
		//分页
		//var p = $('#dataList').datagrid('getPager');
		$('#pp').pagination({
			//pageList : [5, 10, 15], //可以设置每页记录条数的列表
			pageSize : 20, //每页显示的记录条数，默认为10
			pageNumber : 1,
			showPageList : false,
			beforePageText : '第', //页数文本框前显示的汉字
			afterPageText : '页    共 {pages} 页',
			displayMsg : '当前显示 {from} - {to} 条记录   共 {total} 条记录',
			onSelectPage : function(pageNumber, pageSize){
				var formData = getFormDatas($('#searchForm'));
				getDataByPage('/menu/findSystem', pageNumber, pageSize, formData, $('#dataList'), $('#pp'));
			}
		});
		
		//数据
		$('#dataList').datagrid({
		    //url : '/menu/findSystem',
		    columns : [[
	            {field:'id', width:80, title:'ID', halign:'center', checkbox:true },
	            {field:'name', width:100, title:'系统名称', halign:'center'},
	            {field:'code', width:100, align:'center', title:'系统代码', halign:'center'},
	            {field:'orderNo', width:80, align:'center', title:'排序', halign:'center'},
	            {field:'op', width:80, align:'center', title:'操作', halign:'center', formatter:function(value,row,index){
	            	return '<a href="#" class="op" data="' + index + '"></a>';
	            }}
		    ]],
		    onBeforeLoad : function(param){
		    	if(param['pageSize'] == null){
		    		var paging = $('#pp').pagination('options');
		    		param['pageSize'] = paging.pageSize;
		    		param['pageNum'] = paging.pageNumber;
		    	}
		    	console.info(paging);
		    },
		    onLoadSuccess : function(data){
		    	$(".op").linkbutton({
				    iconCls: 'icon-edit',
				    onClick : function (){
				    	record = $('#dataList').datagrid('getData').rows[this.attributes.data.value];
				    	$('#opMenu').menu('show',{
				    		left : event.clientX,
				    		top : event.clientY
				    	});
				    }
				});
				$('#dataList').datagrid('fixRowHeight');
		    },
		    singleSelect : true,
		    striped : true,
		    emptyMsg : '没有符合条件数据',
		    loadMsg : '加载中···',
		    rownumbers : true
		});
		
		//初始加载数据
		getDataByPage('/menu/findSystem', 1, 20, null, $('#dataList'), $('#pp'));
		
		//新增
		$('#recordDialog').dialog({
		    title: '新增',
		    width: 400,
		    height: 'auto',
		    closed: true,
		    cache: false,
		    href: '',
		    modal: true,
		    //toolbar : [{text:'save',iconCls:'icon-save',handler:function(){alert('save')}}],
		    buttons : [
		    	{text:'保存',iconCls:'icon-save',handler:function(){
		    		save();
		    	}},
		    	{text:'取消',iconCls:'icon-cancel',handler:function(){
		    		$('#recordDialog').dialog('close');
		    	}}
		    	],
		    onClose : function(){
		    	$('#recordForm').form('clear');
		    }
		});
		
		//操作菜单
		$('#opMenu').menu({
		    onClick:function(item){
		        switch(item.text){
		        	case '编辑':
		        		edit();
		        	break;
		        	case '删除':
		        		remove();
		        	break;
		        }
		    }
		});
	});
	
	//查找
	function search(){
		//var formData = getFormDatas($('#searchForm'));
		//$('#dataList').datagrid('load',formData);
		$('#pp').pagination('select');
	}
	
	//新增
	function add(){
		$('#recordDialog').dialog({title: '新增',closed: false});
		record = {'parentId':0,'depth':1};
		$('#recordForm').form('load',record);
	}
	
	//保存
	function save(){
		$('#recordForm').form('submit', {
		    url : '/menu/saveOrUpdate',
		    onSubmit : function(){
		        // do some check
		        // return false to prevent submit;
		    },
		    success : function(data){
		    	$('#recordDialog').dialog('close');
		        $('#dataList').datagrid('load');
		    }
		});
	}
	//编辑
	function edit(){
		$('#recordDialog').dialog({title: '编辑',closed: false});
		$('#recordForm').form('load',record);
	}
	
	//删除
	function remove() {
		$.messager.confirm('确认', '是否确认删除数据?', function (r) {
			if (r) {
				$.ajax({
					url : '/menu/delete',
					data : {
						id : record.id
					},
					success : function(){
						$('#dataList').datagrid('reload');
						$.messager.show({
							title : '消息',
							msg : '数据已删除',
							timeout : 5000,
							showType : 'slide'
						});
					}
				});
			}
		});
	}

</script>
<body>
	<!-- 查询条件 -->
    <div data-options="region:'north',title:'',split:false" >
    	<div id="searchFormDiv" class="easyui-panel" title="查询条件" style="height:auto;padding:5px;">
	    	<div class="easyui-panel" style="padding:5px;" data-options="">
	    		<a href="javascript:search()" class="easyui-linkbutton" data-options="iconCls:'icon-search'">查找</a>
	    		<a href="javascript:add()" class="easyui-linkbutton" data-options="iconCls:'icon-add'">新增</a>
	    		<a href="javascript:remove()" class="easyui-linkbutton" data-options="iconCls:'icon-remove'">删除</a>
	    	</div>
	    	<form id="searchForm" method="post">
		    	<div class="easyui-panel" style="padding:5px;">
		    		<input class="easyui-textbox" data-options="label:'系统名称'" style="width:300px" name="name">
		    	</div>
	    	</form>
    	</div>
    </div>
    <!-- 分页控件 -->
    <div id="pp" style="background:#efefef;border:1px solid #ccc;"></div>
	<!-- 数据列表 -->
    <div data-options="region:'center',title:''" style="padding:5px;background:#eee;min-height:600px;">
    	<table id="dataList" style="min-height:600px;">
	    </table>
    </div>
    
	<!-- 新增编辑对话框 -->
    <div id="recordDialog" style="display:none;">
    	<form id="recordForm" method="post">
    		 <div data-options="region:'center',title:''" style="padding:5px;background:#eee;">
	    		<input type="hidden" id="id" name="id" />
	    		<input type="hidden" id="parentId" name="parentId" />
	    		<input type="hidden" id="depth" name="depth" />
	    		<div class="easyui-panel" style="padding:5px;" data-options="border:false">
	    			<input class="easyui-textbox formItem" data-options="label:'系统名称:'" name="name">
	    		</div>
	    		<div class="easyui-panel" style="padding:5px;" data-options="border:false">
		    		<input class="easyui-textbox formItem" data-options="label:'系统编码:'" name="code">
	    		</div>
	    		<div class="easyui-panel" style="padding:5px;" data-options="border:false">
		    		<input class="easyui-textbox formItem" data-options="label:'排序:'" name="orderNo">
	    		</div>
	    		<div class="easyui-panel" style="padding:5px;" data-options="border:false">
		    		<input class="easyui-textbox formItem" data-options="label:'系统根路径:'" name="baseUrl">
	    		</div>
	    	</div>
    	</form>
	</div>
	
	<!-- 操作菜单 -->
	<div id="opMenu" style="width:150px;">
	    <div data-options="iconCls:'icon-edit'" >编辑</div>
	    <div data-options="iconCls:'icon-remove'" >删除</div>
	</div>
</body>
</html>

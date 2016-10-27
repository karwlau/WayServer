<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>用户列表</title>
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
		//数据
		$('#dataList').datagrid({
		    url : '/user/userList',
		    columns : [[
	            {field:'id', width:80, title:'ID', halign:'center', checkbox:true },
	            {field:'name', width:100, title:'用户名', halign:'center'},
	            {field:'nickName', width:180, align:'left', title:'账号', halign:'center'},
	            {field:'isAdmin', width:80, align:'center', title:'是否管理员', halign:'center',formatter:function(value,row,index){
	            	if(value){
	            		return '是';
	            	}
	            	return '否';
	            }},
	            {field:'op', width:80, align:'center', title:'操作', halign:'center', formatter:function(value,row,index){
	            	return '<a href="#" class="op" data="' + index + '"></a>';
	            }}
		    ]],
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
		    },
		    singleSelect : true,
		    striped : true,
		    emptyMsg : '没有符合条件数据',
		    loadMsg : '加载中···',
		    rownumbers : true,
		    pageSize : 20,
		    pagination : true,
		    pagePosition : 'top'
		});
		
		//分页
		var p = $('#dataList').datagrid('getPager');
		$(p).pagination({
			//pageSize : 20, //每页显示的记录条数，默认为10
			//pageList : [5, 10, 15], //可以设置每页记录条数的列表
			showPageList : false,
			beforePageText : '第', //页数文本框前显示的汉字
			afterPageText : '页    共 {pages} 页',
			displayMsg : '当前显示 {from} - {to} 条记录   共 {total} 条记录',
		});
		
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
		    onBeforeClose : function(){
		    	$('#userRoles').combobox('clear');
		    	$('#recordForm').form('clear');
		    }
		});
		
		//角色选择数据
		$('#userRoles').combobox({
			url : '/role/roleData',
			valueField : 'id',
			textField : 'name',
			editable : false,
			label : '角色分配:',
			multiple : true
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
		var formData = getFormDatas($('#searchForm'));
		$('#dataList').datagrid('load',formData);
	}
	
	//新增
	function add(){
		$('#recordDialog').dialog({title: '新增',closed: false});
	}
	
	//保存
	function save(){
		checkRoles();
		$('#recordForm').form('submit', {
		    url : '/user/saveOrUpdate',
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
	
	//分配角色
	function checkRoles(){
		var datas = $('#userRoles').combobox('getData');
		var checks = $('#userRoles').combobox('getValues');
		var checksMap = new Map();
		$(checks).each(function(){
			checksMap[this] = true;
		});
		var unchecks = new Array();
		$(datas).each(function(){
			if(checksMap[this.id] == null ){
				unchecks.push(this.id);
			}
		});
		$('#unchecks').val(unchecks);
	}
	
	//编辑
	function edit(){
		$('#recordDialog').dialog({title: '编辑',closed: false});
		record['password'] = '';
		$('#recordForm').form('load',record);
		$.ajax({
			url : '/user/hasRole',
			data : {
				userId : record.id
			},
			success : function(data){
				if(data != null && data.length > 0){
					$(data).each(function(){
						$('#userRoles').combobox('select',this.roleId);
					})
				}
			}
		});
	}
	
	//删除
	function remove() {
		$.messager.confirm('确认', '是否确认删除数据?', function (r) {
			if (r) {
				$.ajax({
					url : '/user/delete',
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
		    		<input class="easyui-textbox" data-options="label:'用户名称:'" style="width:300px" name="name">
		    		<input class="easyui-textbox" data-options="label:'账号:'" style="width:300px" name="nickName">
		    		<select class="easyui-combobox" data-options="label:'是否管理员:',editable:false" style="width:200px;" name="isAdmin">
					    <option value="">全部</option>
					    <option value="true">是</option>
					    <option value="false">否</option>
					</select>
		    	</div>
	    	</form>
    	</div>
    </div>
    
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
	    		<input type="hidden" id="unchecks" name="unchecks" />
	    		<div class="easyui-panel" style="padding:5px;" data-options="border:false">
	    			<input class="easyui-textbox formItem" data-options="label:'用户名称:'" name="name">
	    		</div>
	    		<div class="easyui-panel" style="padding:5px;" data-options="border:false">
	    			<input class="easyui-textbox formItem" data-options="label:'账号:'" name="nickName">
	    		</div>
	    		<div class="easyui-panel" style="padding:5px;" data-options="border:false">
	    			<label style="padding-right:12px;">是否管理员:</label>
		    		<input class="easyui-switchbutton formItem" data-options="onText:'Yes',offText:'No',value:'true'" name="isAdmin">
	    		</div>
	    		<div class="easyui-panel" style="padding:5px;" data-options="border:false">
		    		<input class="easyui-passwordbox formItem" data-options="label:'密码:',prompt:'不填写即不修改'" name="password">
	    		</div>
	    		<div class="easyui-panel" style="padding:5px;" data-options="border:false">
	    			<select id="userRoles" name="checks" style="width:300px;">
	    			</select>
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

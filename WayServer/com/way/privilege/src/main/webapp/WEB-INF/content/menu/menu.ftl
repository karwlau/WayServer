<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>菜单树</title>
<meta http-equiv="content-type" content="text/html; charset=UTF-8">

<#include "../common/easyJs.ftl">
<#include "../common/easyCss.ftl">

<style type="text/css">
.formItem{
	width : 300px;
}
</style>
</head>

<script type="text/javascript">
	var record ;
	var expandAll = false;
	$().ready(function(){
		//按钮
		$('#btnDiv').panel({
		});
		$('#expandBtn').linkbutton({
			iconCls : 'icon-redo',
			onClick : function(){
				expandAll = true;
				$('#menuTree').tree('expandAll');
			}
		});
		$('#collapseBtn').linkbutton({
			iconCls : 'icon-undo',
			onClick : function(){
				$('#menuTree').tree('collapseAll');
			}
		});
		//菜单树
		$('#menuTree').tree({
		    url : '/menu/menuExpand',
		    queryParams : {
		    },
		    onBeforeLoad : function(node,param){
		    	var pid = param['id'];
		    	if(pid == null || pid == ''){
		    		param['id'] = 0;
		    	}
		    },
			loadFilter : function (data,parent){
				$(data).each(function(){
					this['state'] = 'closed';
				});
				return data;
			},
			onClick : function(node){
				$('#menuTree').tree('expand',node.target);
			},
			onExpand : function(node){
				if(expandAll){
					var children = $('#menuTree').tree('getChildren',node.target);
					for(var idx = 0; idx < children.length; idx++){
						$('#menuTree').tree('expand',children[idx].target);
					}
				}
			},
			onContextMenu : function(e,node){
				e.preventDefault();
				$('#menuTree').tree('select', node.target);
				record = node;
				$('#opMenu').menu('show',{
		    		left : event.clientX,
		    		top : event.clientY
		    	});
			},
		    formatter : function(node){
				return node.name;
			}
		});
		
		//菜单处理
		$('#opMenu').menu({
		    onClick:function(item){
		        switch(item.text){
		        	case '新增':
		        		add();
		        	break;
		        	case '编辑':
		        		edit();
		        	break;
		        	case '删除':
		        		remove();
		        	break;
		        }
		    }
		});
		
		//菜单维护窗口
		$('#menuWin').dialog({
			title : '菜单维护',
			width : 400,
			modal : true,
			cache : false,
			closed : true,
			buttons : [
				{text : '保存', iconCls : 'icon-save', handler : function(){
					save();
				}},
				{text : '取消', iconCls : 'icon-cancle', handler : function(){
					$('#menuWin').dialog('close');
				}}
			]
		});
	});
	
	//新增
	function add(){
		switch (record.depth){
			case 1:
			case 2:
			case 4:
			$('#url').hide();
			break;
			case 3:
			$('#url').show();
			break;
			default:
			return false;
		}
		$('#parentId').val(record.id);
		$('#menuForm').form('clear');
		$('#menuWin').dialog({closed : false});
	}
	
	//编辑
	function edit(){
	
	}
	
	//保存
	function save(){
		$('#menuForm').form('submit', {
		    url : '/menu/save',
		    onSubmit : function(){
		        // do some check
		        // return false to prevent submit;
		    },
		    success : function(data){
		    	$('#menuWin').dialog('close');
		        $('#menuTree').tree('reload');
		    }
		});
	}
	
</script>

<body>
	<div data-options="region:'center',title:''" style="padding:5px;background:#eee;">
		<div id="btnDiv">
			<a id="expandBtn">全部展开</a>
			<a id="collapseBtn">全部折叠</a>
		</div>
		<ul id="menuTree" ></ul>
	</div>
	
	<!-- 操作菜单 -->
	<div id="opMenu" style="width:150px;">
		<div id="addBtn" data-options="iconCls:'icon-add'" >新增</div>
	    <div id="editBtn" data-options="iconCls:'icon-edit'" >编辑</div>
	    <div id="removeBtn" data-options="iconCls:'icon-remove'" >删除</div>
	</div>
	
	<!-- 菜单窗口 -->
	<div id="menuWin" style="display:none;">
    	<form id="menuForm" method="post">
    		 <div data-options="region:'center',title:''" style="padding:5px;background:#eee;">
	    		<input type="hidden" id="id" name="id" />
	    		<input type="hidden" id="parentId" name="parentId" />
	    		<div class="easyui-panel" style="padding:5px;" data-options="border:false">
	    			<input class="easyui-textbox formItem" data-options="label:'名称:'" name="name">
	    		</div>
	    		<div class="easyui-panel" style="padding:5px;" data-options="border:false">
		    		<input class="easyui-textbox formItem" data-options="label:'系统编码:'" name="code">
	    		</div>
	    		<div class="easyui-panel" style="padding:5px;" data-options="border:false">
		    		<input class="easyui-textbox formItem" data-options="label:'排序:'" name="orderNo">
	    		</div>
	    		<div id="url" class="easyui-panel" style="padding:5px;" data-options="border:false">
		    		<input class="easyui-textbox formItem" data-options="label:'系统路径:'" name="url">
	    		</div>
	    	</div>
    	</form>
	</div>
</body>
</html>

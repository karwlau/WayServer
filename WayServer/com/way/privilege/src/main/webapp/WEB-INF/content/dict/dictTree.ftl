<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>数据字典</title>
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
				$('#dictTree').tree('expandAll');
			}
		});
		$('#collapseBtn').linkbutton({
			iconCls : 'icon-undo',
			onClick : function(){
				$('#dictTree').tree('collapseAll');
			}
		});
		//字典树
		$('#dictTree').tree({
		    url : '/dict/dictExpand',
		    queryParams : {
		    },
		    onBeforeLoad : function(node,param){
		    	var pid = param['id'];
		    	if(pid == null || pid == ''){
		    		param['pid'] = 0;
		    	}else{
		    		param['pid'] = pid;
		    	}
		    },
			loadFilter : function (data,parent){
				$(data).each(function(){
					this['state'] = 'closed';
				});
				return data;
			},
			onClick : function(node){
				$('#dictTree').tree('expand',node.target);
			},
			onExpand : function(node){
				if(expandAll){
					var children = $('#dictTree').tree('getChildren',node.target);
					for(var idx = 0; idx < children.length; idx++){
						$('#dictTree').tree('expand',children[idx].target);
					}
				}
			},
			onContextMenu : function(e,node){
				e.preventDefault();
				$('#dictTree').tree('select', node.target);
				record = node;
				if(record.id == 1){
					$('#addBtn').show();
					$('#editBtn').hide();
					$('#removeBtn').hide();
				}else{
					$('#addBtn').show();
					$('#editBtn').show();
					$('#removeBtn').show();
				}
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
		
		//字典维护窗口
		$('#dictWin').dialog({
			title : '字典维护',
			width : 400,
			modal : true,
			cache : false,
			closed : true,
			buttons : [
				{text : '保存', iconCls : 'icon-save', handler : function(){
					save();
				}},
				{text : '取消', iconCls : 'icon-cancle', handler : function(){
					$('#dictWin').dialog('close');
				}}
			]
		});
	});
	
	//新增
	function add(){
		initForm();
		$('#dictWin').dialog({closed : false});
		$('#parentId').val(record.id);
		$('#parentCode').val(record.code);
	}
	
	//编辑
	function edit(){
		initForm();
		$('#dictWin').dialog({closed : false});
		$('#dictForm').form('load',record);
		$('#oldCode').val(record.code);
	}
	
	//初始化表单
	function initForm(){
		$('#dictForm').form('clear');
	}
	
	//保存
	function save(){
		$('#dictForm').form('submit', {
		    url : '/dict/saveOrUpdate',
		    onSubmit : function(){
		        // do some check
		        // return false to prevent submit;
		    },
		    success : function(data){
		    	$('#dictWin').dialog('close');
		        $('#dictTree').tree('reload');
		    }
		});
	}
	
	//删除
	function remove(){
		$.messager.confirm('确认', '是否确认删除数据?', function (r) {
			if (r) {
				$.ajax({
					url : '/dict/delete',
					data : {
						id : record.id
					},
					success : function(){
						$('#dictTree').tree('reload');
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
	<div data-options="region:'center',title:''" style="padding:5px;background:#eee;">
		<div id="btnDiv">
			<a id="expandBtn">全部展开</a>
			<a id="collapseBtn">全部折叠</a>
		</div>
		<ul id="dictTree" >
		</ul>
	</div>
	
	<!-- 操作菜单 -->
	<div id="opMenu" style="width:150px;">
		<div id="addBtn" data-options="iconCls:'icon-add'" >新增</div>
	    <div id="editBtn" data-options="iconCls:'icon-edit'" >编辑</div>
	    <div id="removeBtn" data-options="iconCls:'icon-remove'" >删除</div>
	</div>
	
	<!-- 菜单窗口 -->
	<div id="dictWin" style="display:none;">
    	<form id="dictForm" method="post">
    		 <div data-options="region:'center',title:''" style="padding:5px;background:#eee;">
	    		<input type="hidden" id="id" name="id" />
	    		<input type="hidden" id="parentId" name="parentId" />
	    		<input type="hidden" id="parentCode" name="parentCode" />
	    		<input type="hidden" id="oldCode" name="oldCode" />
	    		<div class="easyui-panel" style="padding:5px;" data-options="border:false">
	    			<input class="easyui-textbox formItem" data-options="label:'名称:'" name="name">
	    		</div>
	    		<div class="easyui-panel" style="padding:5px;" data-options="border:false">
		    		<input class="easyui-textbox formItem" data-options="label:'编码:'" name="code">
	    		</div>
	    		<div class="easyui-panel" style="padding:5px;" data-options="border:false">
		    		<input class="easyui-textbox formItem" data-options="label:'排序:'" name="orderNo">
	    		</div>
	    		<div id="value" class="easyui-panel" style="padding:5px;" data-options="border:false">
		    		<input class="easyui-textbox formItem" data-options="label:'内容:'" name="value">
	    		</div>
	    		<div id="descr" class="easyui-panel" style="padding:5px;" data-options="border:false">
		    		<input class="easyui-textbox formItem" data-options="label:'描述:'" name="descr">
	    		</div>
	    	</div>
    	</form>
	</div>
</body>
</html>

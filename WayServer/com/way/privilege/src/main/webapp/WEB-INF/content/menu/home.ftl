<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>菜单</title>
<meta http-equiv="content-type" content="text/html; charset=UTF-8">

<#include "../common/easyJs.ftl">
<#include "../common/easyCss.ftl">

<style type="text/css">
#sysMenuDiv{
	width : 200px;
}
#sysId{
	width : 190px;
}
</style>
</head>

<script type="text/javascript">
	$().ready(function(){
		//系统
		$('#sysId').combobox({
		    url : '/menu/sysList',
		    valueField : 'id',
		    textField : 'name',
		    mode : 'remote',
		    onChange : function(data){
		    	$('#selectSysId').val(data);
		    	$('#menuTree').tree('reload');
		    },
		    onLoadSuccess : function(){
		    	var datas = $('#sysId').combobox('getData');
		    	if(datas != null && datas.length > 0){
		    		$('#sysId').combobox('select',datas[0]['id']);
		    	}
		    }
		});
		
		//菜单
		$('#menuTree').tree({
		    url : '/menu/menuExpand',
		    queryParams : {
		    },
		    formatter : function(node){
				return node.name;
			},
			onBeforeLoad : function(node, param){
				var sysId = $("#selectSysId").val();
				if(sysId == null || sysId == ''){
					return false;
				}
				param['sysId'] = sysId;
			},
			loadFilter : function (data,parent){
				var tag = 'closed';
				var depth = 0;
				if(data[0] != null ){
					depth = data[0]['depth'];
					if(data[0]['depth'] == 4){
						tag = 'open';
					}
				}
				$(data).each(function(){
					this['state'] = tag;
					this['depth'] = depth;
				});
				return data;
			},
			onClick : function(node){
				if(node.depth != null && node.depth == 4){
					node['furl'] = node['baseUrl'] + node['url'];
					addTab(node);
				}else{
					$('#menuTree').tree('expand',node.target)
				}
			}
		});
		
		//浏览
		$("#tabs").tabs({
			width : '100%',
			height : '100%'
		});
	});
	
	function addTab(data){
		$('#tabs').tabs('add', {
			id : data.id,
			title : data.name,
			content : '<iframe src="' + data.furl + '" style="width:100%;height:100%;overflow:hide;"></iframe>',//href : data.furl,
			closable : true,
			selected : true
		});
	}
</script>
<body class="easyui-layout">
    <div id="sysMenuDiv" data-options="region:'west',title:'系统菜单',split:true,minWidth:'200px',maxWidth:'200px'" >
    	<input id="selectSysId" type="hidden" />
    	<input id="sysId" name="sysId" />
    	<div id="treeDiv" >
    		<ul id="menuTree" >
    		</ul>
    	</div>
    </div>
    <div data-options="region:'center',title:'主页'" style="padding:5px;background:#eee;">
    	<div id="tabs">
    		<div title="home" data-options="closable:false" >
    			<img src="/images/start.jpg" alt="home page" style="height:100%;" />
    		</div>
    	</div>
    </div>
</body>
</html>

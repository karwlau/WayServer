<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<HTML>
<HEAD>
<title>菜单</title>
<meta http-equiv="content-type" content="text/html; charset=UTF-8">

<#include "../common/commonJS.ftl">
<#include "../common/commonCss.ftl">

<SCRIPT type="text/javascript">
	var curMenu = null, zTree_Menu = null;

	/*var zNodes=[{id:1,pId:0,name:"主菜单 1",open:true},{id:11,pId:1,name:"子菜单 1-1"},{id:111,pId:11,name:"w3school",furl:"http://www.w3school.com.cn/"},{id:112,pId:11,name:"runoob",furl:"http://www.runoob.com/"},{id:12,pId:1,name:"子菜单 1-2"},{id:121,pId:12,name:"叶子节点 1-2-1"},{id:2,pId:0,name:"主菜单 2"},{id:21,pId:2,name:"子菜单 2-1"},{id:211,pId:21,name:"叶子节点 2-1-1"},{id:212,pId:21,name:"叶子节点 2-1-2"},{id:213,pId:21,name:"叶子节点 2-1-3"},{id:3,pId:0,name:"主菜单 3"},{id:31,pId:3,name:"子菜单 3-1"},{id:311,pId:31,name:"叶子节点 3-1-1"},{id:312,pId:31,name:"叶子节点 3-1-2"},{id:32,pId:3,name:"子菜单 3-2"},{id:321,pId:32,name:"叶子节点 3-2-1"},{id:322,pId:32,name:"叶子节点 3-2-2"}];*/

	function beforeClick(treeId, node) {
		if (node.isParent) {
			if (node.level === 0) {
				var pNode = curMenu;
				while (pNode && pNode.level !== 0) {
					pNode = pNode.getParentNode();
				}
				if (pNode !== node) {
					var a = $("#" + pNode.tId + "_a");
					a.removeClass("cur");
					zTree_Menu.expandNode(pNode, false);
				}
				a = $("#" + node.tId + "_a");
				a.addClass("cur");

				var isOpen = false;
				for (var i = 0, l = node.children.length; i < l; i++) {
					if (node.children[i].open) {
						isOpen = true;
						break;
					}
				}
				if (isOpen) {
					zTree_Menu.expandNode(node, true);
					curMenu = node;
				} else {
					zTree_Menu
							.expandNode(
									node.children[0].isParent ? node.children[0]
											: node, true);
					curMenu = node.children[0];
				}
			} else {
				zTree_Menu.expandNode(node);
			}
		}
		return !node.isParent;
	}
	//选择节点打开新标签
	function onClick(e, treeId, node) {
		//$('#content').attr('src', 'http://' + node.furl);
		if ($('#tabs-' + node.id).length > 0) {
			return false;
		}
		$('#winList').append(
				'<li><a href="#tabs-'+node.id+'">' + node.name + '</a><a class="ui-icon ui-icon-circle-close" onclick="closeTab()" tabId="tabs-'+node.id+'"></a></li>');
		$('#tabs')
				.append(
						'<div id="tabs-'+node.id+'" style="display: flex;" class="itab" ><iframe src="'
								+ node.furl
								+ '" width="100%" scrolling="auto" frameborder="0" name="'
								+ node.name + '"></iframe></div>');
		$('#tabs').tabs("refresh");
		$('#tabs').tabs({active:$(".itab").length-1});
		refreshHeight();
	}
	
	//关闭标签
	function closeTab(){
		var tabId = event.target.attributes['tabId'].value;
		$("#" + tabId).remove();
		event.target.parentElement.remove();
		$('#tabs').tabs("refresh");
		refreshHeight();
	}

	//标签页高度控制
	function refreshHeight() {
		var outerH = document.body.scrollHeight - 10;
		$("#outerWin").height(outerH);
		var titleH = $('#tabs').children('ul').height();
		$('#tabs').children('div').height(outerH - titleH - 50);
	}
	$(document).ready(function() {
		//var outerH = document.body.scrollHeight - 10;
		//$("#outerWin").height(outerH);

		var frameW = window.innerWidth - $('#menuTree').width();
		//$('#tabs').width(frameW);
		$("#tabs").tabs();
		//var titleH = $('#tabs').children('ul').height();
		//$('#tabs').children('div').height(outerH - titleH);
		refreshHeight();
		
		
		selectWidget($("#sysMenu"),"/menu/sysList","name","id",function(){
			$("#sysMenu").selectmenu({
				"width" : "200px",
				"select" : function(event,option){
					//option.item.value
					
					var setting = {
						view : {
							showLine : true,
							selectedMulti : false,
							dblClickExpand : true
						},
						data : {
							simpleData : {
								enable : true,
								idKey : 'id',
								pIdKey : 'parentId',
								rootPId : $("#sysMenu").val()
							}
						},
						async: {
							enable: true,
							type: "post",
							url: "/menu/sysMenuExpand",
							autoParam: ["pId=id"],
							otherParam: {"sysId":$("#sysMenu").val()}
						},
						callback : {
							onNodeCreated : this.onNodeCreated,
							beforeClick : this.beforeClick,
							onClick : this.onClick,
							onAsyncSuccess : function(){
								zTree_Menu = $.fn.zTree.getZTreeObj("menuTree");
								curMenu = zTree_Menu.getNodes()[0].children[0].children[0];
								zTree_Menu.selectNode(curMenu);
								var a = $("#" + zTree_Menu.getNodes()[0].tId + "_a");
								a.addClass("cur");
							}
						}
					};
					$.fn.zTree.init($("#menuTree"), setting);//, zNodes
				}
			},false);
			//$("#sysMenu").selectmenu("selectmenuselect");
		});
	});
</SCRIPT>
<style type="text/css">
.ztree li a.level0 {
	width: 200px;
	height: 20px;
	text-align: center;
	display: block;
	background-color: #0B61A4;
	border: 1px silver solid;
}

.ztree li a.level0.cur {
	background-color: #66A3D2;
}

.ztree li a.level0 span {
	display: block;
	color: white;
	padding-top: 3px;
	font-size: 12px;
	font-weight: bold;
	word-spacing: 2px;
}

.ztree li a.level0 span.button {
	float: right;
	margin-left: 10px;
	visibility: visible;
	display: none;
}

.ztree li span.button.switch.level0 {
	display: none;
}
</style>
</HEAD>

<BODY>
	<div id="outerWin" style="display: flex; width: 100%; height: 100%;">
		<div style="float: left;">
			<div>
				<select id="sysMenu" ></select>
			</div>
			<div id="menuTree" class="ztree clear"></div>
		</div>
		<div id="tabs" style="float: right; height: 100%; flex: 1;">
			<ul id="winList">
				<li><a href="#tabs-home">Home</a></li>
			</ul>
			<div id="tabs-home" style="display: flex;" class="itab">
				<!-- <iframe src="http://localhost:8089/rowNumber/list" width="100%" scrolling="auto"
					frameborder="0" name="baidu"></iframe>-->
				<img src="/images/start.jpg" alt="home page" height="100%" width="100%" /> 
			</div>
		</div>
	</div>
</BODY>
</HTML>

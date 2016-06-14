<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<HTML>
<HEAD>
<title>菜单</title>
<meta http-equiv="content-type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="/common/jquery-ztree/css/demo.css"
	type="text/css">
<link rel="stylesheet"
	href="/common/jquery-ztree/css/zTreeStyle/zTreeStyle.css"
	type="text/css">
<script type="text/javascript" src="/common/jquery-2.1.4/jquery.min.js"></script>
<script type="text/javascript"
	src="/common/jquery-ztree/jquery.ztree.all.min.js"></script>
<!-- jquery ui -->
<script type="text/javascript"
	src="/common/jquery-ui-1.11.4/jquery-ui.min.js"></script>
<link rel="stylesheet" href="/common/jquery-ui-1.11.4/jquery-ui.min.css">
<SCRIPT type="text/javascript">
	var curMenu = null, zTree_Menu = null;
	var setting = {
		view : {
			showLine : true,
			selectedMulti : false,
			dblClickExpand : true
		},
		data : {
			simpleData : {
				enable : true
			}
		},
		callback : {
			onNodeCreated : this.onNodeCreated,
			beforeClick : this.beforeClick,
			onClick : this.onClick
		}
	};

	var zNodes = [ {
		id : 1,
		pId : 0,
		name : "主菜单 1",
		open : true
	}, {
		id : 11,
		pId : 1,
		name : "子菜单 1-1"
	}, {
		id : 111,
		pId : 11,
		name : "w3school",
		furl : "http://www.w3school.com.cn/"
	}, {
		id : 112,
		pId : 11,
		name : "runoob",
		furl : "http://www.runoob.com/"
	}, {
		id : 12,
		pId : 1,
		name : "子菜单 1-2"
	}, {
		id : 121,
		pId : 12,
		name : "叶子节点 1-2-1"
	}, {
		id : 2,
		pId : 0,
		name : "主菜单 2"
	}, {
		id : 21,
		pId : 2,
		name : "子菜单 2-1"
	}, {
		id : 211,
		pId : 21,
		name : "叶子节点 2-1-1"
	}, {
		id : 212,
		pId : 21,
		name : "叶子节点 2-1-2"
	}, {
		id : 213,
		pId : 21,
		name : "叶子节点 2-1-3"
	}, {
		id : 3,
		pId : 0,
		name : "主菜单 3"
	}, {
		id : 31,
		pId : 3,
		name : "子菜单 3-1"
	}, {
		id : 311,
		pId : 31,
		name : "叶子节点 3-1-1"
	}, {
		id : 312,
		pId : 31,
		name : "叶子节点 3-1-2"
	}, {
		id : 32,
		pId : 3,
		name : "子菜单 3-2"
	}, {
		id : 321,
		pId : 32,
		name : "叶子节点 3-2-1"
	}, {
		id : 322,
		pId : 32,
		name : "叶子节点 3-2-2"
	} ];

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
				'<li><a href="#tabs-'+node.id+'">' + node.name + '</a></li>');
		$('#tabs')
				.append(
						'<div id="tabs-'+node.id+'" style="display: flex;" ><iframe src="'
								+ node.furl
								+ '" width="100%" scrolling="auto" frameborder="0" name="'
								+ node.name + '"></iframe></div>');
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
		$.fn.zTree.init($("#menuTree"), setting, zNodes);
		zTree_Menu = $.fn.zTree.getZTreeObj("menuTree");
		curMenu = zTree_Menu.getNodes()[0].children[0].children[0];
		zTree_Menu.selectNode(curMenu);
		var a = $("#" + zTree_Menu.getNodes()[0].tId + "_a");
		a.addClass("cur");

		var frameW = window.innerWidth - $('#menuTree').width();
		//$('#tabs').width(frameW);
		$("#tabs").tabs();
		//var titleH = $('#tabs').children('ul').height();
		//$('#tabs').children('div').height(outerH - titleH);
		refreshHeight();
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
		<div id="menuTree" class="ztree" style="float: left;"></div>
		<div id="tabs" style="float: right; height: 100%; flex: 1;">
			<ul id="winList">
				<li><a href="#tabs-1">First</a></li>
				<!-- <li><a href="#tabs-2">Second</a></li>
				<li><a href="#tabs-3">Third</a></li> -->
			</ul>
			<div id="tabs-1" style="display: flex;">
				<iframe src="http://www.baidu.com" width="100%" scrolling="auto"
					frameborder="0" name="baidu"></iframe>
			</div>
			<!-- <div id="tabs-2">acb</div>
			<div id="tabs-3">
				<div></div>
			</div> -->
		</div>
	</div>
</BODY>
</HTML>

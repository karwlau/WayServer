<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>菜单</title>
<meta http-equiv="content-type" content="text/html; charset=UTF-8">

<#include "../common/commonJS.ftl">
<#include "../common/commonCss.ftl">
<style type="text/css">
#outerWin{
	display: flex;
	width: 100%;
	height: 100%;
}
#sysMenu{
	width: 200px;
}
#menuDiv{
	height: 800px;
}
#tabs{
	//flex:1;
	width: 100%;
	height: 100%;
}
.itab{
	height: 100%;
	overflow: "scroll";
}
.itab_c{
	height: 90%;
	width: 100%;
	overflow: 'scroll";
}
<!-- 菜单树 -->
.ztree * {font-size: 10pt;font-family:"Microsoft Yahei",Verdana,Simsun,"Segoe UI Web Light","Segoe UI Light","Segoe UI Web Regular","Segoe UI","Segoe UI Symbol","Helvetica Neue",Arial}
.ztree li ul{ margin:0; padding:0}
.ztree li {line-height:30px;}
.ztree li a {width:200px;height:30px;padding-top: 0px;}
.ztree li a:hover {text-decoration:none; background-color: #E7E7E7;}
.ztree li a span.button.switch {visibility:hidden}
.ztree.showIcon li a span.button.switch {visibility:visible}
.ztree li a.curSelectedNode {background-color:#D4D4D4;border:0;height:30px;}
.ztree li span {line-height:30px;}
.ztree li span.button {margin-top: -7px;}
.ztree li span.button.switch {width: 16px;height: 16px;}

.ztree li a.level0 span {font-size: 150%;font-weight: bold;}
.ztree li span.button {background-image:url("/images/ztree/left_menuForOutLook.png"); *background-image:url("/images/ztree/left_menuForOutLook.gif")}
.ztree li span.button.switch.level0 {width: 20px; height:20px}
.ztree li span.button.switch.level1 {width: 20px; height:20px}
.ztree li span.button.noline_open {background-position: 0 0;}
.ztree li span.button.noline_close {background-position: -18px 0;}
.ztree li span.button.noline_open.level0 {background-position: 0 -18px;}
.ztree li span.button.noline_close.level0 {background-position: -18px -18px;}
</style>
<script type="text/javascript">
	//标签页高度控制
	function refreshHeight() {
		var outerH = document.body.scrollHeight - 10;
		$("#outerWin").height(outerH);
		var titleH = $('#tabs').children('ul').height();
		$('#tabs').children('div').height(outerH - titleH - 50);
	}
	//标签页宽度控制
	function refreshWidth(){
		var wid = $("#outerWin").width() ;
		$('#tabs').width(wid);
	}
	
	//菜单树start
	
	var curMenu = null, zTree_Menu = null;
	var setting = {
		view: {
			showLine: false,
			showIcon: false,
			selectedMulti: false,
			dblClickExpand: false,
			addDiyDom: addDiyDom
		},
		data: {
			simpleData: {
				enable: true
			}
		},
		callback: {
			beforeClick: beforeClick,
			onClick: openFrame
		}
	};

	var zNodes =[];

	function addDiyDom(treeId, treeNode) {
		var spaceWidth = 5;
		var switchObj = $("#" + treeNode.tId + "_switch"),
		icoObj = $("#" + treeNode.tId + "_ico");
		switchObj.remove();
		icoObj.before(switchObj);

		if (treeNode.level > 1) {
			var spaceStr = "<span style='display: inline-block;width:" + (spaceWidth * treeNode.level)+ "px'></span>";
			switchObj.before(spaceStr);
		}
	}

	function beforeClick(treeId, treeNode) {
		if (treeNode.level == 0 || treeNode.level == 1 ) {
			var zTree = $.fn.zTree.getZTreeObj("treeDemo");
			zTree.expandNode(treeNode);
			return false;
		}
		return true;
	}
	function openFrame(event,treeId,node){
		openTab(node.code,node.name,node.furl)
	}
	function initTree(){
		var treeObj = $("#treeDemo");
		$.fn.zTree.init(treeObj, setting, zNodes);
		zTree_Menu = $.fn.zTree.getZTreeObj("treeDemo");
		curMenu = zTree_Menu.getNodes()[0].children[0].children[0];
		zTree_Menu.selectNode(curMenu);

		treeObj.hover(function () {
			if (!treeObj.hasClass("showIcon")) {
				treeObj.addClass("showIcon");
			}
		}, function() {
			treeObj.removeClass("showIcon");
		});
	}
	//菜单树end
	
	//加载菜单数据
	function loadMenu(sysId){
		$.ajax({
			url : '/menu/sysMenuExpand',
			data : {
				sysId : sysId
			},
			success : function(resp){
				var item;
				zNodes = [];
				$(resp).each(function(){
					item = {
						id : this.id,
						pId : this.parentId,
						name : this.name,
						code : this.code,
						furl : this.baseUrl + this.url
					};
					zNodes.push(item);
				});
				initTree();
			}
		});
	}
	
	//打开标签页
	function openTab(code,name,url){
		if($("#tabs-" + code).length > 0){
			var winId = "tabs-" + code;
			for(var i =0 ;i < $(".itab").length;i++){
				if($(".itab")[i]['id'] == winId){
					$('#tabs').tabs({active:i});
					return true;
				}
			}
			return false;
		}
		$("#winList").append('<li id="tabt-' + code + '"><a href="#tabs-' + code + '"><span>' + name + '<span></a><span onclick="closeTab(\'' + code + '\')" tabId="" class="ui-icon ui-icon-closethick"></span></li>');
		$("#tabs").append('<div id="tabs-' + code + '" class="itab"><iframe src="' + url + '" class="itab_c" /></div>');
		$('#tabs').tabs("refresh");
		$('#tabs').tabs({active:$(".itab").length-1});
	}
	
	//关闭标签页
	function closeTab(code){
		$("#tabs-" + code).remove();
		$("#tabt-" + code).remove();
		$('#tabs').tabs("refresh");
	}
	
	$().ready(function(){
		//系统列表
		$("#sysMenu").selectmenu();
		$("#sysMenu").on("selectmenuselect", function( event, ui ) {
			loadMenu(ui.item.value)
		});
		//默认加载首选系统菜单
		loadMenu($("#sysMenu").val());
		
		//主标签面板
		$("#tabs").tabs();
		
		refreshHeight();
		//refreshWidth();
		
		//菜单树
		//initTree();
	});
</script>
</head>

<body>
	<div id="outerWin">
		<div >
			<div id="sysDiv">
				<select id="sysMenu" >
					<#list SYS_LIST as item>
						<option value="${(item.id)!}" >${(item.name)!}</option>
					</#list>
				</select>
			</div>
			<div id="menuDiv" class="left" >
				<ul id="treeDemo" class="ztree"></ul>
			</div>
		</div>
		<div id="tabs" >
			<ul id="winList">
				<li id="tabt-home"><a href="#tabs-home"><span>Home<span></a></li>
				<!--
				<li><a href="#tabs-test"><span>test<span></a></li>
				-->
			</ul>
			<div id="tabs-home" class="itab">
				<img src="/images/start.jpg" alt="home page" style="height:100%;" /> 
			</div>
			<!--
			<div id="tabs-test" class="itab">
				<iframe src="http://www.baidu.com" style="height:100%;width:100%;"/>
			</div>
			-->
		</div>
	</div>
</body>
</html>

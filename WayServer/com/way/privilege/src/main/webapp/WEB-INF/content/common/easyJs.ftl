<!-- third party plugins -->
<script type="text/javascript" src="/js/jquery-2.1.4/jquery.min.js"></script>
<script src="/js/jeasyui-1.5/jquery.easyui.min.js" ></script>

<!-- framework plugins -->
<script type="text/javascript" src="/js/select.js"></script>

<!-- way common-->
<script type="text/javascript" >
	//序列化获取表单数据
	function getFormDatas(form){
		var values = form.serialize();
		values = values.split('&');
		var datas = {};
		for(var i = 0; i < values.length; i++){
			var item = values[i].split('=');
			datas[item[0]] = item[1];
		}
		return datas;
	}
	
</script>
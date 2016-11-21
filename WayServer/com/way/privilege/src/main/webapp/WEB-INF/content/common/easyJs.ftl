<!-- third party plugins -->
<script type="text/javascript" src="/js/jquery-2.1.4/jquery.min.js"></script>
<script src="/js/jeasyui-1.5/jquery.easyui.w.min.js" ></script>

<!-- framework plugins -->
<script type="text/javascript" src="/js/select.js"></script>

<!-- way common-->
<script type="text/javascript" >
	//序列化获取表单数据
	function getFormDatas(form){
		/*
			var values = form.serialize();
			values = values.split('&');
			var datas = {};
			for(var i = 0; i < values.length; i++){
				var item = values[i].split('=');
				datas[item[0]] = item[1];
			}
			return datas;
		*/
		var param = {};
		$(form).find('input').each(function(){
			if(this.name != null && this.name != ''){
				param[this.name] = this.value;
			}
		})
		return param;
	}
	
	//分页数据加载
	function getDataByPage(url, pageNumber, pageSize, param, dataList, pagingBar){
		pageNumber = pageNumber || 1;// 设置默认的页号
		pageSize = pageSize || 20;// 设置默认的每页记录数
		if(param == null){
			param = {};
		}
		param['pageNum'] = pageNumber;
		param['pageSize'] = pageSize;
		$.ajax({
			type : "POST",
			dataType : 'json', // 注意格式是html，不是json
			url : url,
			data : param,
			error : function () { // ajax请求失败
				$.messager.show({
					title : '失败信息',
					msg : '加载数据失败',
					timeout : 0,
					showType : 'fade'
				});
			},
			success : function (data, textStatus, jqXHR) { // 请求成功，将返回的数据（一页的记录数）绑定到 datagrid控件
				var jsonObj = data;//$.parseJSON(data);
				var count = jsonObj.total; // 总记录个数
				var data_t = jsonObj.list;//eval('[' + jsonObj.list + ']');
				dataList.datagrid('loadData', data_t);
				pagingBar.pagination({
					total : count, // 由于显示 ”共XXX条记录” 等信息用
					pageNumber : pageNumber, //
				});
			}
		}); //ajax
	}
</script>
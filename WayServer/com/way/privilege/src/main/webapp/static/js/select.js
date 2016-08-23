/*
*数据字典形式
*示例：
*selectWidget($("#sel"),0,function(data){});
*
*<select id="sel" class="c_select">
*<option value="">全部</option>
*</select>
*
*/
function dictWidget(widget,dataCode,callback) {
	//为"请选择"或"全部"保留选项
	var a = widget.find("option:first");
	if(a != null && a.length > 0){
		a = a.prop("outerHTML");
	}
	$.ajax({
	    url : url,//待确认数据字典请求路径
	    data : {
			code : dataCode
		},
		type : 'post',
	    error : function(){
	       alert('加载专业数据失败！');     
	    },
	    success:function(data){
	    	widget.html(a);
	 		$(data).each(function() {
	 			if(this.id != undefined){
	 				widget.append("<option value='"+this.id+"'>"+this.name+"</option>");
	 			}
        	});
        	if(callback != null && typeof(callback)== 'function'){
				callback.call(widget,null);
			}
	    }
	});
}

/*
*通用形式
*示例：
*selectWidget($("#sel"),"/profession/professionList","name","id",function(data){});
*
*<select id="sel" class="c_select">
*<option value="">全部</option>
*</select>
*
*/
function selectWidget(widget,url,nameField,idField,callback,keepFirst) {
	//为"请选择"或"全部"保留选项
	var a = "";
	if(keepFirst){
		a = widget.find("option:first");
		if(a != null && a.length > 0){
			a = a.prop("outerHTML");
		}
	}
	$.ajax({
	    url : url,
		type : 'post',
	    error : function(){
	       alert('加载数据失败！');     
	    },
	    success:function(data){
	    	widget.html(a);
	 		$(data).each(function() {
	 			if(this[idField] != undefined){
	 				widget.append("<option value='"+this[idField]+"'>"+this[nameField]+"</option>");
	 			}
        	});
        	if(callback != null && typeof(callback)== 'function'){
				callback.call(widget,null);
			}
	    }
	});
}
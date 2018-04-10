;
(function($, undefined) {
	$.ajaxSetup({
		  cache: false,
		  type: "POST",
	});

	/**
	 * 用弹出的方式显示页面请求
	 * 用法$("#divCnt").OpenDialog("对话框标题", "abc.jsp","key=value");
	 * 用法$("#divCnt").OpenDialog({title:"对话框标题",width:500},"abc.jsp", "key=value");
	 * 依赖：jquery.js, jquery.ui.js, jquery.validation.js
	 * opts:对话框标题或属性 buttons,closeOnEscape,closeText,dialogClass,draggable,height
	 * 	maxHeight,maxWidth,minHeight,minWidth,modal,position,resizable,title,width
	 * url:请求的连接
	 * data:请求的数据  &quot;key1=value1&amp;key2=value2&quot; 或 {key1: 'value1', key2: 'value2'}
	 * </pre>
	 */
	$.fn.OpenDialog = function(opts, url, data) {
		var srcElement = this;
		// 获取对话框属性参数
		var params = {};
		if (typeof(opts) == 'string') {
			params["title"] = opts;
		} else if (typeof(opts) == 'object') {
			params = opts;
		}
		// 追加对话框属性，清空按钮，追加关闭回调函数
		params["buttons"] = {};
		params["beforeClose"] = function() {
			// 清空校验提示
			var objForm = srcElement.find("form");
			if (objForm && objForm.clearMsg) {
				objForm.clearMsg();
			}
		};
		
		$.ajax({
            type: "POST",
            url: url,
            data: data,
            dataType:"html",
            success: function(msg) {
            	srcElement.html(msg);
            	srcElement.dialog(params);
            },
			error: function() {
				srcElement.html("<p>提交时发生内部错误。</p>");
				srcElement.dialog({title: "错误提示", buttons:{}});
			},
         });
	};
	
	/**
	 * 用于弹出消息对话框，需指定div
	 * callBack参数存在时，弹出确认对话框
	 * 用法$("#divCnt").MsgBox("消息内容", callBack);
	 * msgContent：消息内容
	 * callBack：选择"确定"按钮时的回调函数
	 */
	$.fn.MsgBox = function(msgContent, callBack) {
		var srcElement = this;
		// 设置默认属性
		var params = {title: "系统提示", beforeClose:null, modal:true};
		if (callBack) {
			params["buttons"] = { "确定": function() { callBack(); srcElement.dialog("close"); }
					,"取消" : function(){srcElement.dialog("close"); }
			};
		}
		srcElement.html("<p>" + msgContent +"</p>");
		srcElement.dialog(params);
	};

	/**
	 * 用于提交表单的内容，并将返回结果加载到div去
	 * 用法$("#divCnt").SubmitForm($("#targetForm"), "abc.do", {name:"value", });
	 * objForm：提交的form
	 * url：请求url，如果为空则用objForm的默认action
	 * data:除却objForm的其他数据
	 */
	$.fn.SubmitForm = function(objForm, url, data) {
		// 改变form的atcion
		if (url && url != "") {
			objForm.attr("action", url);
		}
		// 如果有参数
		if (data) {
			for(var obj in data) {
				if (typeof(data[obj] != "function")) {
					objForm.append("<input name=\""+ obj +"\" value=\"" + data[obj] + "\" type=\"hidden\"/>");
				}
			}
		}
		objForm.ajaxSubmit({type : "POST", target : this,});
	};

	/**
	 * 用于两次提交表单的内容，并将返回结果加载到div去
	 * 第一次提交如果有错误则显示错误，如果成功则发送第二次提交
	 * 用法$("#divCnt").SubmitForm($("#targetForm"), "abc.do", "abc2.do", $("#dialog), {name:"value", });
	 * objForm：提交的form
	 * url：请求url，如果为空则用objForm的默认action，请求的返回值必须是json格式，并含有result和errMsgs(FieldErrors) 字段
	 * 		result 1：成功，其他：失败；errMsgs 类型是Map<String, List<String>>。
	 * url2:成功后请求的url,如果为空则用objForm的默认action
	 * dlg:dialog窗口的div
	 * data:除却objForm的其他数据
	 */
	$.fn.SubmitFormExt = function(objForm, url, url2, objDlg, data) {
		// target
		var targetDiv = this;
		// 改变form的atcion
		var oldUrl = objForm.attr("action");
		if (url && url != "") {
			objForm.attr("action", url);
		}
		// 如果有参数
		if (data) {
			for(var obj in data) {
				if (typeof(data[obj] != "function")) {
					objForm.append("<input name=\""+ obj +"\" value=\"" + data[obj] + "\" type=\"hidden\"/>");
				}
			}
		}
		// 第一次提交
		objForm.ajaxSubmit({type : "POST", dataType:"json"
			, error : function(){
					objForm.AddErrMsg("提交时发生未知错误。");
				}
			, success: function(data) {
					// json中的处理结果正常时
					if (data.result == "1"){
						// 如果url存在则用url2提交，否则使用默认的url提交
						if (url2 && url2 != "") {
							objForm.attr("action", url2);
						} else {
							objForm.attr("action", oldUrl);
						}
						// 如果是对话框则关闭对话框
						objDlg && objDlg.dialog("close");
						objForm.ajaxSubmit({type : "POST", target: targetDiv});
					} else {
						var msg = "";
						for (var obj in data.errMsgs) {
							msg = msg + "<br />" + obj + ":" + data.errMsgs[obj].join(",") ;
						}
						objForm.AddErrMsg("<h3>提交时发生以下错误：</h3>" + msg);
					}
				}
			});
	};
	
	/**
	 * 向指定元素的父元素中追加错误显示对话框
	 * msg：消息内容
	 */
	$.fn.AddErrMsg = function(msg) {
		var msgDiv = $(this).parent().find("#errMsg");
		if (msgDiv.size() == 0) {
			$(this).parent().prepend("<div id=\"errMsg\" class=\"errorMessage\" style=\"display:none\"></div>");
			msgDiv = $(this).parent().find("#errMsg").first();
		}
		msgDiv.html(msg);
		msgDiv.dialog({title: "错误提示", beforeClose:null, buttons:{}, modal:true});
	};
	
	/**
	 * 加载url到div去
	 * 用法$("#divCnt").LoadToMe("abc.do", {name:"value", });
	 * url：请求url，如果为空则用objForm的默认action
	 * data:除却objForm的其他数据
	 * callback:成功之后的回调函数
	 */
	$.fn.LoadToMe = function(url, data, callback) {
		// 清除原来的校验提示
		var objFrom = $(this).find("form");
		if (objFrom && objFrom.clearMsg) {
			objFrom.clearMsg();
		}
		this.load(url, data, callback);
	};
})(jQuery);
;
(function($, undefined) {
	var BASE = {
		apd : "<input name=\"_name\" value=\"_value\" type=\"hidden\"/>",
		inp : [ "button", "file", "image", "reset", "submit" ],
		pageapd : '<span class="_page_index_number" index="_index">_index</span>',
		tyf : [ "string", "number", "boolean" ],
		closefunction : [ undefined, undefined, undefined, undefined ],
		timerflag : true,
		opnopt : {
			autoOpen : false,
			closeOnEsc : true,
			modal : true,
			width : Math.floor($('body').width() * .70),
			height : Math.floor($('body').height() * .65)
		},
		opnbox : [],
		opnstring : '<div id="openbox_index_x_my_THISID"></div>',
		tablefix : "<tr><td colspan=\"20\" style=\"height:100%;\">&nbsp;</td></tr>",
		nopage : "没有检索到数据",
		options : '<option value="options-value">options-label</option>'
	};
	var _change_reset_timer_f = function() {
		BASE.timerflag = false;
	};
	$.fn.Page = function(Opts) {
		var _$ = $(this);
		var page_inx = parseInt(ZHSWL.PAGE.index);
		var page_tot = parseInt(ZHSWL.PAGE.total);
		var page_item = parseInt(ZHSWL.PAGE.items);
		var _defformid = ZHSWL.PAGE.form;
		var _apd = BASE.apd;
		var _Options = {
			type : "POST",
			target : _$,
		};
		if (typeof Opts === "string") {
			if (Opts.indexOf("#") == 0)
				$.extend(_Options, {
					form : Opts
				});
			else
				$.extend(_Options, {
					form : _defformid,
					url : Opts
				});
		} else if (typeof Opts === "object") {
			if (typeof Opts["url"] === "undefined")
				$.extend(_Options, Opts);
			else
				$.extend(_Options, Opts, {
					form : _defformid
				});
			if (typeof Opts["searchflag"] === "undefined")
				$.extend(_Options, {
					searchflag : page_sfg
				});
		}
		var _map = _Options["map"];
		var f_form = function(_ind) {
			var _formid = _Options["form"];
			$(_formid).append(
					_apd.replace("_name", "queryBean.pageIndex").replace("_value",
							_ind));
			if (typeof _map != "undefined") {
				for ( var is = 0; is < _map.length; is++)
					$(_formid).append(
							_apd.replace("_name", _map[is][0]).replace(
									"_value", _map[is][1]));
			}
			if (BASE.timerflag) {
				_change_reset_timer_f();
				$(_formid).ajaxSubmit(_Options);
			}
		};
		var _$K = $('#page_menulist_all_show');
		if (page_item <= 0) {
			_$K.children().remove();
			_$K.html(BASE.nopage);
			return _$;
		}
		var _$M = $('#page_menulist_show');
		if (page_tot <= 1) {
			_$M.remove();
			return _$;
		}
		_$M.on('click', "span._page_index_number", function() {
			var _iix = parseInt($.trim($(this).text()));
			if (_iix != page_inx)
				f_form(_iix);
		}).on('click', 'span._page_index_first', function() {
			if (page_inx != 1) {
				f_form(1);
			}
		}).on('click', 'span._page_index_last', function() {
			if (page_tot != page_inx) {
				f_form(page_tot);
			}
		}).on('click', 'span._page_index_next', function() {
			if (page_inx + 1 <= page_tot) {
				f_form(page_inx + 1);
			}
		}).on('click', 'span._page_index_prev', function() {
			if (page_inx - 1 >= 1) {
				f_form(page_inx - 1);
			}
		});
		return _$;
	};
})(jQuery);
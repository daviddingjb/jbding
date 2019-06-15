$(function($) {
	//日期控件
	$("#sign_date")
			.datepicker(
					{
						showOn : "button",
						buttonImage : "css/images/cal.gif",
						buttonImageOnly : true,
						showButtonPanel : true
					});
	//给日期控件添加点击事件，实现日期选择
	$("#sign_date").click(function() {
		$(this).datepicker("show");
	});
	$("#sign_date").change(function() {
		$(this).clearMsg();
	});
	$("#county").change(function() {
		var myselect = document.getElementById("county");
		var year1 = document.getElementById("year1");
		var index=myselect.selectedIndex;
		var index1=year1.selectedIndex;
		var a=myselect.options[index].value;
		var y=year1.options[index1].value;
		var b = document.getElementById("renjun"); 
		if(a=="曾都"){
			if(y=="2015"){
				b.value="13785";
			} else if(y=="2016"){
				b.value="15095";
			}
		} else if(a=="随县") {
			if(y=="2015"){
				b.value="13109";
			} else if(y=="2016"){
				b.value="14354";
			}
		} else if(a=="广水") {
			if(y=="2015"){
				b.value="12877";
			} else if(y=="2016"){
				b.value="14100";
			}
		} else if(a=="高新区") {
			if(y=="2015"){
				b.value="13785";
			} else if(y=="2016"){
				b.value="15095";
			}
		} else if(a=="大洪山风景区") {
			if(y=="2015"){
				b.value="13109";
			} else if(y=="2016"){
				b.value="14354";
			}
		} else {
			b.value="";
		}
	});

	$("#family_size").change(function() {
		var family_size = document.getElementById("family_size");
		var family_n = document.getElementById("family_n");
		family_n.value = family_size.value;
	});

	$("#name1").change(function() {
		var name1 = document.getElementById("name1");
		var sign1 = document.getElementById("sign1");
		sign1.value = name1.value;
	});

	$("#house_size").change(function() {
		var house_size = document.getElementById("house_size");
		var family_size = document.getElementById("family_size");
		var people_size = document.getElementById("people_size");
		people_size.value = Math.round(house_size.value/family_size.value);
	});

	$("#money1").change(function() {
		var money1 = document.getElementById("money1");
		var money2 = document.getElementById("money2");
		var increase = document.getElementById("increase");
		if(money1.value > 0 && money2.value > 0){
			increase.value = ((money2.value/money1.value - 1) * 100).toFixed(1);
		}
	});

	$("#money2").change(function() {
		var money1 = document.getElementById("money1");
		var money2 = document.getElementById("money2");
		var increase = document.getElementById("increase");
		if(money1.value > 0 && money2.value > 0){
			increase.value = ((money2.value/money1.value - 1) * 100).toFixed(1);
		}
	});
});
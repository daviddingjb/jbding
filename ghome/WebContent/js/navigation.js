
function toggleClass() {
	var myButtonClasses = document.getElementById("conn").classList;
	if (myButtonClasses.contains("active")) {
	    myButtonClasses.remove("active");
	    myButtonClasses.add("itenActive");
	    document.getElementById("conn").classList.add(myButtonClasses);
	} else if(myButtonClasses.contains("itenActive")) {
	} else {
	    myButtonClasses.add("itenActive");
	    document.getElementById("conn").classList.add(myButtonClasses);
	}
	
	myButtonClasses = "";
	myButtonClasses = document.getElementById("group").classList;
	if (myButtonClasses.contains("itenActive")) {
	    myButtonClasses.remove("itenActive");
	    myButtonClasses.add("active");
	    document.getElementById("group").classList.add(myButtonClasses);
	} else if(myButtonClasses.contains("active")) {
	} else {
	    myButtonClasses.add("active");
	    document.getElementById("group").classList.add(myButtonClasses);
	}

	myButtonClasses = "";
	myButtonClasses = document.getElementById("jobs").classList;
	if (myButtonClasses.contains("itenActive")) {
	    myButtonClasses.remove("itenActive");
	    myButtonClasses.add("active");
	    document.getElementById("jobs").classList.add(myButtonClasses);
	} else if(myButtonClasses.contains("active")) {
	} else {
	    myButtonClasses.add("active");
	    document.getElementById("jobs").classList.add(myButtonClasses);
	}
};

package com.training;

enum colorEnum {
	WHO("World Health Organisation");
	
	private String value;
	
	colorEnum(String value){
		this.value=value;
	}


	String getvalue() {
		return value;
	}
}

package com.training.Enums;

enum Abbrevation {
	WHO("World Health Organisation"),CGI("Computer Generated Imagery"),BCA("Bachelor of Computer Applications");
	
	private String value;
	
	Abbrevation(String value){
		this.value=value;
	}


	String getvalue() {
		return value;
	}
}

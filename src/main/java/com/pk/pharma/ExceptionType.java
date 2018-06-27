package com.pk.pharma.response;

public enum ExceptionType {
	NO_CONTENT("No Content Found"), 
	NO_EXCEPTION("No Exception"), 
	NO_RECORDS("No Record Found"), 
	IN_ACTIVE("In Active"), 
	ALREADY_EXIST("Already Exist");
	
	private String name;

    public String getName() {
        return name;
    }
    
    ExceptionType(String name) {
        this.name = name;
    }
}

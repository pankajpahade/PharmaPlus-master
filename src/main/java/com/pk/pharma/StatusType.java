package com.pk.pharma.response;

public enum StatusType {
	FAIL("Failed"),
	SUCCESS("Success");
	
	private String name;

    public String getName() {
        return name;
    }
    
    StatusType(String name) {
        this.name = name;
    }
}

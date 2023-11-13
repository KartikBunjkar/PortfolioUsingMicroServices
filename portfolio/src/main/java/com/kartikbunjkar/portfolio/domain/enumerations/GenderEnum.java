package com.kartikbunjkar.portfolio.domain.enumerations;

public enum GenderEnum {

	MALE("MALE","male"),
	FEMALE("FEMALE","female");
	
	private final String code;
	private final String name;
	
	private GenderEnum(String code, String name) {
		this.code = code;
		this.name = name;
		
	}

	public String getCode() {
		return code;
	}

	public String getName() {
		return name;
	}
	
}

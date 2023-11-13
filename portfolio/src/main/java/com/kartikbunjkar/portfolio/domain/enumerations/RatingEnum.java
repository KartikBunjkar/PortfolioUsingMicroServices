package com.kartikbunjkar.portfolio.domain.enumerations;

public enum RatingEnum {
	
	LOW("LOW","low"),
	MEDIUM("MEDIUM","medium"),
	HIGH("HIGH","high");
	
	private final String code;
	private final String name;
	
	public String getCode() {
		return code;
	}
	
	public String getName() {
		return name;
	}

	private RatingEnum(String code, String name) {
		this.code = code;
		this.name = name;
	}
	
	
	
}

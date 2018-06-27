package com.jeongk.designpattern.decorator2;

public class EuropeanGirl implements Girl {

	private String description="";

	public EuropeanGirl() {
		super();
		this.description = "+European";
	}

	@Override
	public String getDescription() {
		return description;
	}
}

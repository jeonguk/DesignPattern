package com.jeongk.designpattern.decorator2;

public class AmericanGirl implements Girl {

	private String description = "";

	public AmericanGirl() {
		super();
		this.description = "+American";
	}

	@Override
	public String getDescription() {
		return description;
	}
}

package com.jeongk.designpattern.decorator2;

public class Science extends GirlDecorator {

	public Science(Girl girl) {
		super(girl);
	}

	@Override
	public String getDescription() {
		return girl.getDescription() + "Like Science";
	}

	public void calculateStuff() {
		System.out.println("Scientific calculation");
	}
}

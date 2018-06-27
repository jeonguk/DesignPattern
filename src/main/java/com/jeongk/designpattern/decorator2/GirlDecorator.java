package com.jeongk.designpattern.decorator2;

public abstract class GirlDecorator implements Girl {
	protected Girl girl;
	public GirlDecorator(Girl girl) {
		super();
		this.girl = girl;
	}
}

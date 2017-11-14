package com.jeongk.designpattern.builder;

public class Director {
	private Builder builder;
	// Builder의 하위 클래스의 인스턴스가 제공되기 때문에 builder 필드에 보관
	public Director(Builder builder) {
		this.builder = builder;
	}
	public Object construct() {
		builder.makeTitle("Greeting");
		builder.makeString("아침과 낮에");
		builder.makeItems(new String[] {
				"좋은 아침입니다.",
				"안녕하세요."
		});
		builder.makeString("밤에");
		builder.makeItems(new String[] {
				"안녕하세요.",
				"안녕히 주무세요.",
				"안녕히 계세요."
		});
		return builder.getResult();
	}
}

package com.jeongk.designpattern.adapter;

public class Picture {
	
	private String str;
	
	public Picture(String str) {
		this.str = str;
	}
	
	public void showWithParen() {
		System.out.println(" ( " + str + " ) ");
	}
	
	public void showWithAster() {
		System.out.println(" * " + str + " * ");
	}
}

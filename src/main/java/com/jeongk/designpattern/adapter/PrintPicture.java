package com.jeongk.designpattern.adapter;

public class PrintPicture extends Picture implements Print {

	public PrintPicture(String str) {
		super(str);
	}
	
	@Override
	public void printWeek() {
		showWithParen();
	}

	@Override
	public void printStrong() {
		showWithAster();
	}

}

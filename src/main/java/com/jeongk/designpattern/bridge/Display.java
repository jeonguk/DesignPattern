package com.jeongk.designpattern.bridge;

/**
 * 기능의 클래스 계층 : Display class
 * @author jk
 *
 */
public class Display {
	
	private DisplayImpl impl;
	
	public Display(DisplayImpl impl) {
		this.impl = impl;
	}
	
	public void open() {
		impl.rawOpen();
	}
	
	public void print() {
		impl.rawPrint();
	}
	
	public void close() {
		impl.rawClose();
	}
	
	public final void display() {
		open();
		print();
		close();
	}
}

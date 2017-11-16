package com.jeongk.designpattern.bridge;

/**
 * 기능의 클래스 계층 :  CountDisplay 클래스
 * @author jk
 *
 */
public class CountDisplay extends Display {

	public CountDisplay(DisplayImpl impl) {
		super(impl);
	}
	
	public void multiDisplay(int times) {
		open();
		for (int i = 0; i < times; i++) {
			print();
		}
		close();
	}

}

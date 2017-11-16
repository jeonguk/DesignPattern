package com.jeongk.designpattern.bridge;

/**
 * Bridge Pattern Test Class
 * - 기능과 계층과 구현의 계층을 분리한다.
 * @author jk
 *
 */
public class TestMain {
	
	public static void main(String[] args) {
		Display d1 = new Display(new StringDisplayImpl("Hello, Korea."));
		Display d2 = new CountDisplay(new StringDisplayImpl("Hello, Wrold."));
		CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hello, Universe."));
		
		d1.display();
		d2.display();
		d3.display();
		d3.multiDisplay(5);
	}
	
}

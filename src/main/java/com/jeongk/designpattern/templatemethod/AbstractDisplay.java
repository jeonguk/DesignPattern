package com.jeongk.designpattern.templatemethod;

/**
 * 추상클래스
 * @author jk
 *
 */
public abstract class AbstractDisplay {
	public abstract void open();   // 하위 클래스에 구현을 맡기는 추상메소드 1
	public abstract void print();  // 하위 클래스에 구현을 맡기는 추상메소드 2
	public abstract void close();  // 하위 클래스에 구현을 맡기는 추상메소드 3
	public final void display() {  // 추상 클래스에서 구현하고 있는 메소드 display
		open(); // open
		for (int i = 0; i < 5; i++) { // 5번 print 반복
			print();
		}
		close(); // 마지막으로 close 한다.
	}
}

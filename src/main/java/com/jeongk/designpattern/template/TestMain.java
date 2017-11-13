package com.jeongk.designpattern.template;

public class TestMain {
	public static void main(String[] args) {
		AbstractDisplay d1 = new CharDisplay('H');
		// 'H'를 가진 CharDisplay의 인스턴스를 1개 만든다.
		AbstractDisplay d2 = new StringDisplay("Hello, world.");
		// "Hello, world."를 가진 StringDisplay의 인스턴스를 1개 만든다.
		AbstractDisplay d3 = new StringDisplay("안녕하세요.");
		// "안녕하세요.."를 가진 StringDisplay의 인스턴스를 1개 만든다.
		d1.display();
		d2.display();
		d3.display();
	}
}

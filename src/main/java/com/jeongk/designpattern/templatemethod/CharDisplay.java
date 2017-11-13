package com.jeongk.designpattern.templatemethod;

/**
 * AbstractDisplay 의 하위 클래스
 * @author jk
 *
 */
public class CharDisplay extends AbstractDisplay {
	
	private char ch; // 표시해야 할 문자
	
	public CharDisplay(char ch) { // 생성자에서 넘어온 문자 ch를 필드에 기억해둔다.
		this.ch = ch;
	}
	
	public void open() { // 상위 클래스의 추상메소드 오버라이드 구현
		System.out.print("<<");
	}
	
	public void print() { // 상위 클래스의 추상메소드 오버라이드 구현
		System.out.print(ch);
	}
	
	public void close() { // 상위 클래스의 추상메소드 오버라이드 구현
		System.out.println(">>");
	}
}

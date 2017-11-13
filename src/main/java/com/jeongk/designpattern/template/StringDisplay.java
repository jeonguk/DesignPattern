package com.jeongk.designpattern.template;

/**
 * AbstractDisplay 의 하위 클래스
 * @author jk
 *
 */
public class StringDisplay extends AbstractDisplay {
	
	private String str; // 표시해야할 문자열
	private int width;  // 바이트 단위로 계산한 문자열의 폭
	
	public StringDisplay(String str) {
		this.str = str; // 필드에 기억
		this.width = str.getBytes().length; // 바이트 단위의 폭 기억
	}
	
	public void open() {
		printLine();
	}
	
	public void print() {
		System.out.println("|" + str + "|");
	}
	
	public void close() {
		printLine();
	}
	
	private void printLine() {
		System.out.print("+");
		for (int i = 0; i < width; i++) {
			System.out.print("-");
		}
		System.out.println("+");
	}
}

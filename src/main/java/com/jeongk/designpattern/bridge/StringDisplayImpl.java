package com.jeongk.designpattern.bridge;

/**
 * 구현의 클래스 계층 : StringDisplayImpl 클래스
 * @author jk
 *
 */
public class StringDisplayImpl extends DisplayImpl {

	private String str; // 표시해야할 문자열 
	private int width;  // 바이트 단위로 계산한 문자열의 '길이'
	
	public StringDisplayImpl(String str) { 
		this.str = str; // 생성자에서 넘어온 문자열 str을 필드에 기억
		this.width = str.getBytes().length; // 바이트 단위으 길이 기억
	}
	
	@Override
	public void rawOpen() {
		printLine();
	}

	@Override
	public void rawPrint() {
		System.out.println("|" + str + "|"); // 앞뒤에 "|" 를 붙여서 표시
	}

	@Override
	public void rawClose() {
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

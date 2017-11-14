package com.jeongk.designpattern.builder;

/**
 * Builder Pattern Test Class
 * - 복잡한 인스턴스를 조립한다.
 * @author jk
 *
 */
public class TestMain {
	
	public static void main(String[] args) {
		
		if (args.length != 1) {
			usage();
			System.exit(0);
		}
		
		if (args[0].equals("plain")) {
			Director director = new Director(new TextBuilder());
			String result = (String)director.construct();
			System.out.println(result);
		} else if (args[0].equals("html")) {
			Director director = new Director(new HTMLBuilder());
			String filename = (String)director.construct();
			System.out.println(filename + "이 작성되었습니다.");
		} else {
			usage();
			System.exit(0);
		}
		
	}
	
	public static void usage() {
		System.out.println("Usage: java TestMain plain"); // 일반텍스트 문서작성
		System.out.println("Usage: java TestMain html");  // HTML 파일 문서작성
	}
	
}

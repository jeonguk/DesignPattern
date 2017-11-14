package com.jeongk.designpattern.singleton;

/**
 * Singleton Pattern Test Class
 * - 단 하나의 인스턴스
 * @author jk
 *
 */
public class TestMain {
	public static void main(String[] args) {
		System.out.println("Start.");
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if (obj1 == obj2) {
			System.out.println("obj1 과 obj2 는 같은 인스턴스입니다.");
		} else {
			System.out.println("obj1 과 obj2 는 같은 인스턴스가 아닙니다.");
		}
		System.out.println("End.");
	}
}

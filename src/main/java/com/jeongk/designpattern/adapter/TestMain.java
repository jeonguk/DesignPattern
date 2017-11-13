package com.jeongk.designpattern.adapter;

/**
 * Adapter Pattern Test Class
 * - 필요한 형태로 수정해서 재활용
 * @author jk
 *
 */
public class TestMain {
	public static void main(String[] args) {
		Print p = new PrintPicture("Leonardo Wilhelm DiCaprio");
		p.printWeek();
		p.printStrong();
	}
}
package com.jeongk.designpattern.bridge;

/**
 * 구현의 클래스 계층 : DisplayImpl 클래스
 * @author jk
 *
 */
public abstract class DisplayImpl {
	public abstract void rawOpen();
	public abstract void rawPrint();
	public abstract void rawClose();
}

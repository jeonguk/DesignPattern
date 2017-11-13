package com.jeongk.designpattern.iterator;


public interface Iterator {
	// 다음 요소가 존재 하는지 조사
	public abstract boolean hasNext();
	// 다음 요소를 얻음
	public abstract Object next();
}

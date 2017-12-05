package com.jeongk.designpattern.strategy;

public class Player {
	
	private String name;
	private Strategy strategy;
	private int winCount;
	private int loseCount;
	private int gameCount;
	
	public Player(String name, Strategy strategy) { // 이름과 전략을 전수 받는다.
		this.name = name;
		this.strategy = strategy;
	}
	
	public Hand nextHand() { // 전략의 지시를 받는다.
		return strategy.nextHand();
	}
	
	public void win() { // 이겼다
		strategy.study(true);
		winCount++;
		gameCount++;
	}
	
	public void lose() { // 졌다
		strategy.study(false);
		loseCount++;
		gameCount++;
	}
	
	public void even() { // 무승부
		gameCount++;
	}
	
	public String toString() {
		return "[" + name + ":" + gameCount + " games, " + winCount +  " win, " + loseCount + " lose " + "]";
	}
}

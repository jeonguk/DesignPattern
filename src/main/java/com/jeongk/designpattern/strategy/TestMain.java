package com.jeongk.designpattern.strategy;

/**
 * Strategy Pattern Test Class
 * - 알고리즘을 모두 교체한다.
 * @author jk
 *
 */
public class TestMain {
	public static void main(String[] args) {
		if (args.length != 2) {
			System.out.println("Usage: java TestMain randomseed1 randomseed2");
			System.out.println("Example: java TestMain 314 15");
			System.exit(0);
		}
		
		int seed1 = Integer.parseInt(args[0]);
		int seed2 = Integer.parseInt(args[1]);
		
		Player player1 = new Player("Player One", new WinningStrategy(seed1));
		Player player2 = new Player("Player Two", new ProbStrategy(seed2));
		
		for (int i = 0; i < 10000; i++) {
			Hand nextHand1 = player1.nextHand();
			Hand nextHand2 = player2.nextHand();
			if (nextHand1.isStrongerThan(nextHand2)) {
				System.out.println("Winner: " + player1);
				player1.win();
				player2.lose();
			} else if (nextHand2.isStrongerThan(nextHand1)) {
				System.out.println("Winner: " + player2);
				player1.lose();
				player2.win();
			} else {
				System.out.println("Even...");
				player1.even();
				player2.even();
			}
			System.out.println("Total result:");
			System.out.println(" " + player1);
			System.out.println(" " + player2);
		}
	}
}

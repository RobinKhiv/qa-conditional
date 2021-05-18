package com.qa.runner;

public class Runner {

	public static void main(String[] args) {
		int sum = 0;
		int multi = 0;
		int p1 = 2;
		int p2 = 4;
		int closerTo21 = 0;
		
		closerTo21 = Blackjack.play(p1,p2);
		System.out.println("Blackjack: " + closerTo21);
		
		sum = Conditional.getOutput(1, 2, true);
		multi = Conditional.getOutput(3, 3, false);
		System.out.println("Sum1: " + sum);
		System.out.println("Multiplcation: " + multi);
		
		sum = Conditional.getOutput(1,1, true);
		System.out.println("Sum2: " + sum);

	}

}

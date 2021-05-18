package com.qa.runner;

public class Runner {

	public static void main(String[] args) {
		int sum = Conditional.getOutput(1, 2, true);
		int multi = Conditional.getOutput(3, 3, false);
		int blackjack = Blackjack.play(2,4);
		int uniqueSum = Conditional.getUniqueSum(1, 1, 2);
				
		System.out.println("Sum1: " + sum);
		sum = Conditional.getOutput(1,1, true);
		System.out.println("Sum2: " + sum);
		System.out.println("Multiplcation: " + multi);
		System.out.println("Blackjack: " + blackjack);
		System.out.println("Unique Sum: " + uniqueSum);

	}

}

package com.qa.runner;

public class Runner {

	public static void main(String[] args) {
		int sum = 0;
		int multi = 0;
		
		sum = Conditional.getOutput(1, 2, true);
		multi = Conditional.getOutput(3, 3, false);
		System.out.println("Sum1: " + sum);
		System.out.println("Multiplcation: " + multi);
		sum = Conditional.getOutput(1,1, true);
		System.out.println("Sum2: " + sum);

	}

}

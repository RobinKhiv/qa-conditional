package com.qa.runner;

public class Conditional {
	//Create a method which accepts 3 parameters, 2 integers and a boolean.
	//If the boolean is true, the method will return a sum of the two numbers, 
	//and it if is false it will return the multiplication of the two numbers.
	public static int getOutput(int i, int j, boolean isTrue)
	{
		return isTrue ? i+j : i*j;
	}
	
	//Recreate the following flowchart as a project. Ensure that your logic and outputs match that of the flowchart.
	//Create a method that takes a single integer A as a parameter.
	//First evaluate if A is greater than 2000. If true, print "A", if false, print "1"
	//Next, Directly under print 1 but not outside of the if statement, make another if statement that evaluates if A is greater that 100. If true, print "2", if false, print "3"
	public static void printFlowChart(int i){
		if (i > 2000){
			System.out.println("A");
			if(i > 6000)
				System.out.println("C");
			else {
				System.out.println("B");
				if (i > 4000)
					System.out.println("D");
				else
					System.out.println("E");
			}
		}
		else {
			System.out.println("1");
			if (i > 100){
				System.out.println("3");
				if (i > 600)
					System.out.println("5");
				else {
					System.out.println("4");
					if (i > 500)
						System.out.println("6");
					else
						System.out.println("7");
				}
			}
			else 
				System.out.println("2");
		}	
	}
	// Given 3 integer values, return their sum. If one value is the same as another 
	// value, they do not count towards the sum. In other words, only return the 
	// sum of unique numbers given.
	// Input(1, 2, 3) -> 6
	// Input(3, 3, 3) -> 0
	// Input(1, 1, 2) -> 2
	public static int getUniqueSum(int i, int j, int k) {
		int result = 0;
		if(i == j && i == k) 
			result = 0;
		else if(i == j) 
			result+= k;
		else if(i == k) 
			result+= j;
		else if(j == k)
			result+= i;
		else 
			result= i + j + k;
		
		return result;
	}
}

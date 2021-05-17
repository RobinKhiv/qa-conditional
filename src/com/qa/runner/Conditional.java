package com.qa.runner;

public class Conditional {
	//Create a method which accepts 3 parameters, 2 integers and a boolean.
	//If the boolean is true, the method will return a sum of the two numbers, 
	//and it if is false it will return the multiplication of the two numbers.
	public static int getOutput(int i, int j, boolean isTrue)
	{
		return isTrue ? i+ j : i*j;
	}
}

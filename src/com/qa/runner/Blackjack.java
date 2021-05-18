package com.qa.runner;

public class Blackjack {
	//Given 2 integer values greater than 0, return 
	// whichever is closest to 21 without going over 21. 
	// If they both go over 21 then return 0.
		//	 play (10, 21) -> 21
		//	 play (20, 18) -> 20
		//	 play (1, 22) -> 1
		//	 play (22, 23) -> 0
	public static int play(int i, int j) {
		int biggest = 0;
		
		if(i <= 21)
			biggest = i;
		
		if(j <= 21 && j > biggest)
			biggest = j;
		
		return biggest;
	}
}

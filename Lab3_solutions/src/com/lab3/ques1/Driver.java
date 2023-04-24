package com.lab3.ques1;

import java.util.Scanner;

import com.lab3.ques1.balancedBrackets;

public class Driver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		balancedBrackets balb = new balancedBrackets();
		
		String brackets = sc.nextLine();
		
		boolean result = balb.isBalanced(brackets);
		
		if (result)
			System.out.println("The entered String has Balanced Brackets");
		else
			System.out.println("The entered Strings do not contain Balanced Brackets");

		sc.close();
	}
}

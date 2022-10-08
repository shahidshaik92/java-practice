package com.ifelse;

public class IfElsePractice {
	public static void main(String[] args) {
		int a = 20;

		if (a > 30) {
			System.out.println("A is greater than 30");

		} else {
			System.out.println("A is less than 30");
		}

		// EVEN AND ODD NUMBER
		// EVEN
		int b = 20;
		if (b % 2 == 0) {
			System.out.println("given number is a even number");
		} else {
			System.out.println("given number is a odd number");
		}

		// ODD
		int c = 11;
		if (c % 2 != 0) {
			System.out.println("given number is a odd number");
		} else {
			System.out.println("given number is a even number");
		}
		// LEAP YEAR
		int d = 2011;
		if (d % 4 == 0) {
			System.out.println("given number is leap year");
		} else {
			System.out.println("given number is a not a leap year");
		}

	}

}

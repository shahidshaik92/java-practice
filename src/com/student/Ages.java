package com.student;

import java.util.Scanner;

public class Ages {

	public static void main(String args[]) {

		System.out.println("Enter age");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		int anotherAge = sc.nextInt();
		

		if (age < 14 || anotherAge == 12) {
			System.out.println("baby");
		} else if ((age >= 15) && (age < 25)) {
			System.out.println("teen");
		} else if ((age >= 26) & (age < 64)) {
			System.out.println("adult");
		} else if (age >= 65 && (age < 100)) {
			System.out.println("old");
		}
	}

}

package com.hello;

public class MyFirstProgram {
	public static void main(String args[]) {
		System.out.println("hi im shajid");

		System.out.println("hi im sajid");

		System.out.println("hi im shahid");

		int age = 23;
		if (age > 20) {
			System.out.println("age is greater than 20");

			int age1 = 22;
			if (age1 < 24) {

				System.out.println("age1 is  less than 24");
			}

			int age2 = 29;
			if (age2 == 28) {

				System.out.println("age2 is equal");
			} else {
				System.out.println("age2 is not equal ");
			}

			int number = -10;
			if (number > 0) {
				System.out.println("Positive");

			} else {
				System.out.println("Zero");

				int number1 = 19;
				if (number1 % 2 == 0) {
					System.out.println("Even number");
				} else {
					System.out.println("Odd number");

					int number2 = 10;
					switch (number2) {
					case 10:
						System.out.println("10");
						break;
					case 20:
						System.out.println("20");
						break;
					case 30:
						System.out.println("30");
						break;
					default:
						System.out.println("Not in 10,20 or 30");

						

						}
					}
				}
			}
		}
	}

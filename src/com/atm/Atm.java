package com.atm;

import java.util.Scanner;

public class Atm {
	public static void main(String[] args) {
		int balance = 1000000, withdraw, deposit;
		Scanner sc = new Scanner(System.in);
		boolean success = true;
		while (success) {
			System.out.println("Automated teller machine");
			System.out.println(" choose 1 for withdraw");
			System.out.println(" choose 2 for deposit");
			System.out.println(" choose 3 for check balance");
			System.out.println("chooose 4 for exit");
			System.out.println("choose operation you want  to perform");

			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.print("Enter money to be withdrawn:");

				withdraw = sc.nextInt();

				if (balance >= withdraw) {

					balance = balance - withdraw;
					System.out.println("Please collect your money " + withdraw);
				} else {

					System.out.println("Insufficient Balance");
				}
				System.out.println("Your Current Balance " + balance);
				success = false;
				break;

			case 2:

				System.out.print("Enter money to be deposited:");

				deposit = sc.nextInt();

				balance = balance + deposit;
				System.out.println("Your Money has been successfully depsited");
				System.out.println("");
				success = false;
				break;

			case 3:

				System.out.println("Balance : " + balance);
				System.out.println("");
				success = false;
				break;

			case 4:
				success = false;
			}
		}

	}

}

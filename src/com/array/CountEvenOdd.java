package com.array;

public class CountEvenOdd {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6 };
		int i, even = 0, odd = 0;
		for (i = 0; i < a.length; i++) {
			if (a[i] % 2 != 0) {
				odd = odd + 1;
			}
		}
		System.out.println("Odd numbners count " + odd);
		for (int i1 = 0; i1 < a.length; i1++) {
			if (a[i1] % 2 == 0) {
				even = even + 1;
			}
		}
		System.out.println("Even numbners count " + even);
	}
}

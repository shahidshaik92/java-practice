package com.array;

public class CountPositiveNegativeExample {
	
	public static void main(String[] args) {
		int array[] = { 1, 2, 3, -1, -2, -3 };
		System.out.println("Given positive number");
		int i, positive = 0;
		int negative = 0;
		for (i = 0; i < array.length; i++) {
			if (array[i] > 0) {
				positive = positive + 1;
			}
		}
		System.out.println(positive);
		System.out.println("Given negative number");
		for (int i1 = 0; i1 < array.length; i1++) {
			if (array[i1] < 0) {
				negative = negative + 1;
			}
		}
		System.out.println(negative);
	}

}

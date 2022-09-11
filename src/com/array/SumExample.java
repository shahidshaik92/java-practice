package com.array;

public class SumExample {
	public static void main(String[] arg) {
		int[] arr = new int[] { 1, 2, 3, 4, 5,6,7,8,9,10 };
		int sum = 1;
		for (int i = 0; i < arr.length; i++) {

			sum = sum *arr[i];
		}
		System.out.println("Sum of the array:" + sum);
	}

}

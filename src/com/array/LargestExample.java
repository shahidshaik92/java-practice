package com.array;

public class LargestExample {

	public static void main(String[] args) {
		int[] arr = new int[] { 20, 77, 777, 1223, 4 };
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i++];
			}
		}
		System.out.println("Largest Element present in given array:" + max);

	}

}

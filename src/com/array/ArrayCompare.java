package com.array;

public class ArrayCompare {
	public static void main(String[] args) {
		int a[] = { 1, 3, 5 };
		int b[] = { 2, 1, 3, 5, 9 };
		int c[] = { 2, 1, 6, 5, 9 };
		int d[] = { 2, 0, 6, 5, 9 };
		System.out.println(isUnion(a, b));
		System.out.println(isUnion(a, c));
		System.out.println(isUnion(a, d));
		
		System.out.println(secondHighestNumberInArray(a));
		System.out.println(secondHighestNumberInArray(c));



	}

	private static int secondHighestNumberInArray(int[] a) {
		int secondHighest = 0;
		
		return secondHighest;
	}

	private static boolean isUnion(int[] a, int[] array) {
		boolean isSuccess = false;
		for (int i = 0; i < a.length; i++) {
			isSuccess = false;
			if (isPresent(a[i], array)) {
				isSuccess = true;
			}
			if (isSuccess == false) {
				break;
			}
		}
		return isSuccess;
	}

	public static boolean isPresent(int value, int[] array) {
		for (int j = 0; j < array.length; j++) {
			if (value == array[j]) {
				return true;
			}
		}
		return false;
	}

}

package com.array;

public class EvenOddExample {
	public static void main(String[] arg) {
		int a[] = { 1, 2, 3, 4, 5, 6 };
		int oddArray[] = new int[5];
		System.out.println("odd numbners in given array");

		for (int i = 0; i < a.length; i++) {

			if (a[i] % 2 != 0) {
				oddArray[i] = (a[i]);
			}
		}
		for (int i = 0; i < oddArray.length; i++) {
			System.out.println(oddArray[i]);
		}
		int evenArray[] = new int[6];
		System.out.println("Even numbner given in array");
		for (int i1 = 0; i1 < a.length; i1++) {
			if (a[i1] % 2 == 0) {
				evenArray[i1]= (a[i1]);
				
			}
		}
		for (int i = 0; i < evenArray.length; i++) {
			System.out.println(evenArray[i]);
		}

	}

}

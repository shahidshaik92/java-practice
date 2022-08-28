package com.constructor;

public class Srm {

	public Srm(int i, int j) {
		System.out.println(i + "baba" + j);
	}

	public Srm() {
		System.out.println("Done");
	}

	public static void main(String[] args) {

		Srm obj = new Srm();

		Srm onj1 = new Srm(2, 5);
	}
		


}

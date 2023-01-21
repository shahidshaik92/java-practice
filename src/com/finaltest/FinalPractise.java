package com.finaltest;

public class FinalPractise {
	final int pan;

	public final FinalPractise(int pan) {
		this.pan = pan ;
	}

	public static void main(String[] args) {

		FinalPractise o = new FinalPractise(50);
		FinalPractise baba = new FinalPractise(60);

		
		final int xyz = 10;
		xyz = 6+ xyz;
		System.out.println(xyz);

	}

}

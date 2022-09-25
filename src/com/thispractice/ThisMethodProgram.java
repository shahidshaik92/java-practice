package com.thispractice;

class bmw {
	void a() {
		System.out.println("Ladakh");
	}

	void b() {
		System.out.println("Vizag");
		this.a();
	}
}

class ThisMethodProgram {
	public static void main(String args[]) {
		bmw s = new bmw();
		s.b();
	}
}

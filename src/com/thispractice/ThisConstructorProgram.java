package com.thispractice;

class Abs {
	Abs() {
		System.out.println("hello a");
	}

	Abs(int y) {
		this();
		System.out.println(y);
	}
}

class ThisConstructorProgram {
	public static void main(String args[]) {
		Abs b = new Abs(1223);

		class B {
			B() {
				this(100);
				System.out.println("hello bmw");

			}

			B(int x) {
				System.out.println(x);
			}
		}
	}

}

package com.thispractice;

class B {
	ThisToPassAsArgumentInConstructor obj;

	B(ThisToPassAsArgumentInConstructor obj) {
		this.obj = obj;
	}

	void display() {
		System.out.println(obj.data);// using data member of A4 class
	}
}

class ThisToPassAsArgumentInConstructor {
	int data = 10;

	ThisToPassAsArgumentInConstructor() {
		B b = new B(this);
		b.display();
	}

	public static void main(String args[]) {
		ThisToPassAsArgumentInConstructor a = new ThisToPassAsArgumentInConstructor();
	}
}

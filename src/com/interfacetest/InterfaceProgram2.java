package com.interfacetest;


interface Printable {
	void print();
}

interface Showable {
	void show();
}

class ClassProgram2 implements Printable, Showable {
	public void print() {
		System.out.println("Hello");
	}

	public void show() {
		System.out.println("Welcome");
	}

	public static void main(String args[]) {
		ClassProgram2 obj = new ClassProgram2();
		obj.print();
		obj.show();
	}
}

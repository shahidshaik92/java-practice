package com.polymorphism;

class Bank {
	int interest() {
		return 0;
	}
}

class sbi extends Bank {
	int interest() {
		return 10;
	}

}

class icici extends Bank {
	int interest() {
		return 20;
	}

}  

class axis extends Bank {
	int interest() {
		return 30;
	}
}

public class MethodOverridingExample {
	public static void main(String[] args) {
		sbi s = new sbi();
		icici i = new icici();
		axis a = new axis();
		System.out.println("sbi interest:" + s.interest());
		System.out.println("icici interest:" + i.interest());
		System.out.println("axis interest:" + a.interest());
	}

}

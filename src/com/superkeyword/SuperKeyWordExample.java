package com.superkeyword;

class SuperParent {
	int money = 1000;

	int parentIntrest() {
		return 10;
	}

	public SuperParent() {
		System.out.println("Parent Constructor Invoked");
	}
	
	public SuperParent(int x) {
		System.out.println("Parent "+ x);
	}

}

class SuperChild extends SuperParent {
	int money = 100;

	int childIntrest() {
		return 50 + super.parentIntrest();
	}

	public SuperChild() {
		super(8);
		System.out.println("Child Constructor Invoked");
	}

	void print() {
		System.out.println(money + super.money);
		System.out.println(childIntrest());
	}

}

public class SuperKeyWordExample {

	public static void main(String[] args) {
		SuperChild o = new SuperChild();
		o.print();
	}

}

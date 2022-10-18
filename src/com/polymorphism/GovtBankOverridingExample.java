package com.polymorphism;

class GovtBank {
	int interest() {
		return 5;
	}
}

class Sbi extends GovtBank {
	int interest() {
		return 10;
	}

}

class Icici extends GovtBank {
	int interest() {
		return 20;
	}
}

class Axis extends GovtBank {
	int interest() {
		return 30;
	}
}

class SajidBank extends GovtBank {
	int interest() {
		return 70;
	}

}

public class GovtBankOverridingExample {
	public static void main(String[] args) {
		Sbi s = new Sbi();
		Icici i = new Icici();
		Axis a = new Axis();
		SajidBank sajid = new SajidBank();
		System.out.println("sbi interest: " + s.interest());
		System.out.println("icici interest: " + i.interest());
		System.out.println("axis interest: " + a.interest());
		System.out.println("sajid bank intrest: " + sajid.interest());
	}

}

package com.thispractice;

class Student {
	int rollno;
	String name;
	float fee;

	Student(int rollno, String name, float fee) {
		this.rollno = rollno;
		this.name = name;
		this.fee = fee;
	}

	void display() {
		System.out.println(rollno + " " + name + " " + fee);
	}
}

public class ThisInstanceVariableProgram {
	public static void main(String args[]) {
		Student s1 = new Student(111, "BMW", 400000f);
		Student s2 = new Student(112, "LADAKH", 50000f);
		s1.display();
		s2.display();
	}
}

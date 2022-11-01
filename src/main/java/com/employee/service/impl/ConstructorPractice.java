package com.employee.service.impl;

public class ConstructorPractice {

	private int id;
	private String name;
	private boolean active;

	public ConstructorPractice(int id, String name) {
		this.id = id;
		this.name = name;
		System.out.println("2 parameterized constructor called.....");
		System.out.println(id + " " + name);
	}
	
	public ConstructorPractice(int i, String n, boolean a) {
		id=i;
		name=n;
		active=a;
		System.out.println(" parameterized constructor called.....");
		System.out.println(i + " "+ n + " "+ a);
	}

	public ConstructorPractice() {
		System.out.println("no arg constructor......");
	}

	void display() {
		System.out.println("method called........");
		System.out.println(id + " " + name + " "+ active);
	}

	public static void main(String[] args) {
		ConstructorPractice constructorPractice = new ConstructorPractice(1, "Aamir", true);
//		constructorPractice.display();
	}
}

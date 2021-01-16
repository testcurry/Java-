package com.qf.day14OOP;

public class Student {
	private String name;
	private int age;
	private boolean married;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setAge(int age) {
		if (age<0||age>120) {
			System.out.println("名字不合法。。");
			return;
		}
		this.age = age;
	}

	public int getAge() {
		return this.age;
	}

	public void setMarried(boolean married) {
		this.married = married;
	}

	public boolean ismarried() {
		return this.married;
	}
}

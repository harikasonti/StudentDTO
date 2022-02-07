package com.student.app.exceptions;

public class AgeLimitException extends Exception{
	private int age;

	public AgeLimitException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AgeLimitException(int age) {
		super();
		this.age = age;
	}

	@Override
	public String toString() {
		return "AgeLimitException [age=" + age + "]";
	}
}

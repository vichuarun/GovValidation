package com.arun.demo.model;

public class Person {
	
	@EnsureGovt
	public String email;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Person [email=" + email + "]";
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(String email) {
		super();
		this.email = email;
	}


}

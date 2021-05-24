package com.epam;

public class People {
	private String firstName;
	private String LastName;
	private int age;
	public People(String firstName, String lastName, int age) {
		super();
		this.firstName = firstName;
		LastName = lastName;
		this.age = age;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "People [firstName=" + firstName + ", LastName=" + LastName + ", age=" + age + "]";
	}
	

}

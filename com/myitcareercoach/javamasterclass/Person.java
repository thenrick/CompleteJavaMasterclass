package com.myitcareercoach.javamasterclass;

public class Person {
	
	private String firstName;
	
	private String lastName;
	
	private int age;

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		if(age >= 0 && age <= 100)
		this.age = age;
		else
			this.age = 0;
	}
	
	public boolean isTeen() {
		if(age > 12 && age < 20) {
			return true;
		}
		return false;
	}
	
	public String getFullName() {
		if(firstName.isEmpty() && lastName.isEmpty()) 
			return "";
		if(firstName.isEmpty() && !lastName.isEmpty())
			return lastName;
		if(!firstName.isEmpty() && lastName.isEmpty())
			return firstName;
		return firstName + " " + lastName;
 	}
	
}

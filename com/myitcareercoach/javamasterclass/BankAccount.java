package com.myitcareercoach.javamasterclass;

public class BankAccount {

	private String number;
	
	private double balance;
	
	private String customerName;
	
	private String email;
	
	private String phoneNumber;
	
	public static void main(String[] args) {
		BankAccount account = new BankAccount();
		account.withdrawl(100);
		account.deposit(50);
		account.withdrawl(100);
		account.deposit(51);
		account.withdrawl(100);
	}
	
	public void deposit(double depositAmount) {
		balance = balance + depositAmount;
	}
	
	public void withdrawl(double withdrawalAmount) {
		if(this.balance - withdrawalAmount < 0) {
			System.out.println("Insufficient funds");
			System.out.println("Balance = " + balance);
		} else {
			balance = balance - withdrawalAmount;
			System.out.println("Balance = " + balance);
		}
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}

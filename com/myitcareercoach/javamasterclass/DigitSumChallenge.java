package com.myitcareercoach.javamasterclass;

public class DigitSumChallenge {

	public static void main(String[] args) {
		System.out.println(sumDigits(0));
		System.out.println(sumDigits(-4));
		System.out.println(sumDigits(125));
		System.out.println(sumDigits(1));
		System.out.println(sumDigits(1099));
		System.out.println(sumDigits(6634));
		
		System.out.println("++++Tims solution+++++");
		
		System.out.println(sumDigitsTimsSolution(0));
		System.out.println(sumDigitsTimsSolution(-4));
		System.out.println(sumDigitsTimsSolution(125));
		System.out.println(sumDigitsTimsSolution(1));
		System.out.println(sumDigitsTimsSolution(1099));
		System.out.println(sumDigitsTimsSolution(6634));
		
	}

	// my solution
	public static int sumDigits(int number) {
		if(number < 10 || (number >= 0 && number <= 9)) {
			return -1;
		}
		String numberString = Integer.toString(number);
		int sum = 0;
		for(int i = 0;i < numberString.length();i++) {
			sum = sum + Character.getNumericValue(numberString.charAt(i));
		}
		return sum;
	}
	
	// tims solution
	public static int sumDigitsTimsSolution(int number) {
		if(number < 10 ) {
			return -1;
		}
		
		int sum = 10;
		
		while (number>0) {
			int digit = number % 10;
			sum += digit;
			
			number  /= 10;
		}
		return sum;
	}
}

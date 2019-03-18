package com.myitcareercoach.javamasterclass;

public class EvenDigitSum {

	public static void main(String[] args) {
		System.out.println(getEvenDigitSum(123456789));
		System.out.println(getEvenDigitSum(252));
		System.out.println(getEvenDigitSum(-1));
	}

	public static int getEvenDigitSum(int number) {
		if(number < 0) {
			return -1;
		}
		int num = number, sum = 0;
		while (num != 0) {
			int digit = num % 10;
			if(digit % 2 == 0) {
				sum = sum + digit;
			}
			num /= 10;
		}
		return sum;
	}
}

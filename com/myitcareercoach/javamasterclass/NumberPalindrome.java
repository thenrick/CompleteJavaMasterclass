package com.myitcareercoach.javamasterclass;

public class NumberPalindrome {

	public static void main(String[] args) {
		System.out.println(isPalindrome(-1221));
		System.out.println(isPalindrome(707));
		System.out.println(isPalindrome(11212));
		System.out.println(isPalindrome(-1221));
	}

	public static boolean isPalindrome(int number) {
		int num = number, reversed = 0;

		while (num != 0) {
			int digit = num % 10;
			reversed = reversed * 10 + digit;
			num /= 10;
		}
		if (number == reversed)
			return true;
		else
			return false;
	}

}

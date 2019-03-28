package com.myitcareercoach.javamasterclass;

public class LargestPrime {

	public static void main(String[] args) {
		System.out.println(getLargestPrime(21));
		System.out.println(getLargestPrime(217));
		System.out.println(getLargestPrime(0));
		System.out.println(getLargestPrime(45));
		System.out.println(getLargestPrime(-1));
		System.out.println(getLargestPrime(7));
	}

	public static int getLargestPrime(int number) {
		if (number <= 1) {
			return -1;
		}
		int copyOfNumber = number;

		for (int i = copyOfNumber - 1; i > 1; i--) {
			if (number % i == 0) {
				number = i;
			}
		}
		return number;
	}
}

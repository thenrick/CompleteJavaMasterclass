package com.myitcareercoach.javamasterclass;

public class LastDigitChecker {

	public static void main(String[] args) {
		System.out.println(isValid(10));
		System.out.println(isValid(468));
		System.out.println(isValid(1051));
		System.out.println(hasSameLastDigit(41, 22, 71));
		System.out.println(hasSameLastDigit(23, 32, 42));
		System.out.println(hasSameLastDigit(9, 99, 999));
	}

	public static boolean hasSameLastDigit(int param1, int param2, int param3) {
		if (!isValid(param1) || !isValid(param2) || !isValid(param3))
			return false;
		int lastDigit1, lastDigit2, lastDigit3;
		lastDigit1 = param1 % 10;
		lastDigit2 = param2 % 10;
		lastDigit3 = param3 % 10;
		if(lastDigit1 == lastDigit2)
			return true;
		if(lastDigit2 == lastDigit3)
			return true;
		if(lastDigit1 == lastDigit3)
			return true;
		return false;
	}

	public static boolean isValid(int param) {
		if (param < 10 || param > 1000) {
			return false;
		}
		return true;
	}
}

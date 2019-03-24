package com.myitcareercoach.javamasterclass;

public class NumberToWords {

	public static void main(String[] args) {

		numberToWords(123); // should print "One Two Three".
		numberToWords(1010); // should print "One Zero One Zero".
		numberToWords(1000); // should print "One Zero Zero Zero".
		numberToWords(-12); // should print "Invalid Value" since the parameter is negative.

		System.out.println(getDigitCount(0));
		System.out.println(getDigitCount(123));
		System.out.println(getDigitCount(-12));
		System.out.println(getDigitCount(5200));

		System.out.println(reverse(-121)); // should return -121
		System.out.println(reverse(1212)); // should return 2121
		System.out.println(reverse(1234)); // should return 4321
		System.out.println(reverse(100)); // should return 1
		System.out.println(reverse(-2521)); // should return 1
	}

	public static void numberToWords(int number) {
		if (number < 0)
			System.out.println("Invalid Value");
		int digitCount = getDigitCount(number);
		int reversed = reverse(number);

		for (int i = 0; i < digitCount; i++) {
			int digit = reversed % 10;
			switch (digit) {
			case 1:
				System.out.println("One");
				break;
			case 2:
				System.out.println("Two");
				break;
			case 3:
				System.out.println("Three");
				break;
			case 4:
				System.out.println("Four");
				break;
			case 5:
				System.out.println("Five");
				break;
			case 6:
				System.out.println("Six");
				break;
			case 7:
				System.out.println("Seven");
				break;
			case 8:
				System.out.println("Eight");
				break;
			case 9:
				System.out.println("Nine");
				break;
			case 0:
				System.out.println("Zero");
				break;
			}
			reversed /= 10;
		}
		System.out.println();
	}

	public static int reverse(int parameter) {
		boolean isNegative = parameter < 0 ? true : false;
		if (isNegative) {
			parameter = parameter * -1;
		}

		int digitCount = getDigitCount(parameter);
		int reversed = 0;

		for (int i = 0; i < digitCount; i++) {
			int digit = parameter % 10;
			reversed = reversed * 10 + digit;
			parameter /= 10;
		}
		return isNegative == true ? reversed * -1 : reversed;

	}

	public static int getDigitCount(int number) {
		if (number < 0)
			return -1;
		if (number == 0)
			return 1;
		int count = 0;

		while (number != 0) {
			number /= 10;
			++count;
		}
		return count;
	}
}

package com.myitcareercoach.javamasterclass.challenge;

import java.util.Scanner;

public class MinElementChallenge {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int[] array = readIntegers(5);
		int min = findMin(array);
		System.out.println(min);
	}

	private static int[] readIntegers(int count) {
		System.out.println("Enter " + count + " of integers");
		int[] values = new int[count];
		for (int i = 0; i < values.length; i++) {
			values[i] = scanner.nextInt();
		}
		return values;
	}

	private static int findMin(int[] values) {
		int min = 0;
		for (int i = 0; i < values.length; i++) {
			if (values[i] < min || min == 0) {
				min = values[i];
			}
		}
		return min;
	}
}

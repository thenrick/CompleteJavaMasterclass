package com.myitcareercoach.javamasterclass;

import java.util.Scanner;

public class InputCalculator {

	public static void main(String[] args) {
		inputThenPrintSumAndAverage();

	}

	public static void inputThenPrintSumAndAverage() {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		long avg = 0;
		int count = 0;
		while (true) {
			System.out.println("Enter number:");
			boolean hasNextInt = scanner.hasNextInt();
			if (hasNextInt) {
				int number = scanner.nextInt();
				sum = number + sum;
				count++;
			} else {
				break;
			}
		}
		if(sum != 0)
			avg = (int) Math.round((double) sum / count);
		System.out.println("SUM = " + sum + " AVG = " + avg);
		scanner.close();
	}

}

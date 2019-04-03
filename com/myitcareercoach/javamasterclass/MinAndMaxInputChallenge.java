package com.myitcareercoach.javamasterclass;

import java.util.Scanner;

public class MinAndMaxInputChallenge {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		while (true) {
			System.out.println("Enter number:");

			boolean hasNextInt = scanner.hasNextInt();
			if (hasNextInt) {
				int number = scanner.nextInt();
				scanner.nextLine();
				if(number > max)
					max = number;
				if(number < min)
					min = number;
			} else {
				break;
			}
		}
		System.out.println("Min: " + min);
		System.out.println("Max: " + max);
		scanner.close();
	}

}

package com.myitcareercoach.javamasterclass;

import java.util.Scanner;

public class ReadingUserInputChallenge {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		int counter = 1;
		while(counter < 11) {
			System.out.println("Enter number #" + counter + ":");

			boolean hasNextInt = scanner.hasNextInt();
			if (hasNextInt) {
				int number = scanner.nextInt();
				scanner.nextLine();
				sum = number + sum;
			} else {
				System.out.println("Invalid Number");
				scanner.nextLine();
			}
			counter++;
		}
		System.out.println("Sum: " + sum);
		scanner.close();
	}
}

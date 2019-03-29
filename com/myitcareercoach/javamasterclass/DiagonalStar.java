package com.myitcareercoach.javamasterclass;

public class DiagonalStar {

	public static void main(String[] args) {
		printSquareStar(5);
		System.out.println();
		printSquareStar(8);
		System.out.println();
		printSquareStar(2);
	}

	public static void printSquareStar(int number) {
		if (number < 5) {
			System.out.println("Invalid Value");
		} else {
			for (int row = 1; row <= number; row++) {
				for (int column = 1; column <= number; column++) {
					if (row == 1 || column == 1 || row == number || column == number || row == column
							|| (column == number - row + 1)) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
				System.out.println("");
			}
		}
	}
}

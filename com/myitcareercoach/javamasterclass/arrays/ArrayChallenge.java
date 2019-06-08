package com.myitcareercoach.javamasterclass.arrays;

import java.util.Scanner;

public class ArrayChallenge {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int[] values = getIntegers(5);
		int[] sorted = sortIntegers(values);
		printArray(sorted);
	}

	public static int[] getIntegers(int number) {
		System.out.println("Enter " + number + " of integers");
		int[] values = new int[number];
		for (int i = 0; i < values.length; i++) {
			values[i] = scanner.nextInt();
		}
		return values;
	}

	public static int[] sortIntegers(int[] myIntArray) {
		int temp;
		for (int i = 1; i < myIntArray.length; i++) {
			for (int j = i; j > 0; j--) {
				if (myIntArray[j] > myIntArray[j - 1]) {
					temp = myIntArray[j];
					myIntArray[j] = myIntArray[j - 1];
					myIntArray[j - 1] = temp;
				}
			}
		}
		return myIntArray;
	}

	public static void printArray(int[] myIntArray) {
		for (int i = 0; i < myIntArray.length; i++) {
			System.out.println(myIntArray[i]);
		}
	}

	// Create a program using arrays that sorts a list of integers in descending
	// order.
	// Descending order is highest value to lowest.
	// In other words if the array had the values in it 106, 26, 81, 5, 15 your
	// program should
	// ultimately have an array with 106,81,26, 15, 5 in it.
	// Set up the program so that the numbers to sort are read in from the keyboard.
	// Implement the following methods - getIntegers, printArray, and sortIntegers
	// getIntegers returns an array of entered integers from keyboard
	// printArray prints out the contents of the array
	// and sortIntegers should sort the array and return a new array containing the
	// sorted numbers
	// you will have to figure out how to copy the array elements from the passed
	// array into a new
	// array and sort them and return the new sorted array.

}

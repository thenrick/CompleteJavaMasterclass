package com.myitcareercoach.javamasterclass;

public class SharedDigit {

	public static void main(String[] args) {
		System.out.println(hasSharedDigit(12, 23));
		System.out.println(hasSharedDigit(9, 99));
		System.out.println(hasSharedDigit(15, 55));
	}

	public static boolean hasSharedDigit(int a, int b) {
		if (a < 10 || a > 99) {
			return false;
		}
		if (b < 10 || b > 99) {
			return false;
		}
		int lefta = a / 10;
		int righta = a % 10;
		int leftb = b / 10;
		int rightb = b % 10;
		return lefta == leftb || lefta == rightb || righta == leftb || righta == rightb;
	}
}

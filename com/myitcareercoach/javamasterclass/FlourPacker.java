package com.myitcareercoach.javamasterclass;

public class FlourPacker {

	public static void main(String[] args) {
		System.out.println(canPack(1, 0, 4));
		System.out.println(canPack(1, 0, 5));
		System.out.println(canPack(0, 5, 4));
		System.out.println(canPack(2, 2, 11));
		System.out.println(canPack(-3, 2, 12));
		System.out.println(canPack(2, 1, 5));
	}

	public static boolean canPack(int bigCount,int smallCount,int goal) {
		if(bigCount < 0 || smallCount < 0 || goal < 0)
			return false;
		int kilos = bigCount * 5;
	    int total = kilos + smallCount;
	 
	    if (kilos == goal || (kilos % goal == 0 && kilos != 0)){
	        return true;
	    } else if (smallCount >= goal || total == goal){
	        return true;
	    } else if (kilos > goal){
	        int howManyBigCountsGoIntoGoal = goal / 5;
	        int remaining = goal - (howManyBigCountsGoIntoGoal * 5);
	        return smallCount >= remaining;
	    } else if (total >= goal){
	        return true;
	    } else {
	        return false;
	    }
	}
}

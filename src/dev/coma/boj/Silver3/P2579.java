package dev.coma.boj.Silver3;

import java.util.Scanner;

public class P2579 {
	private static int[] memoArr;
	
  public static void main(String[] args) {
  	try (Scanner scanner = new Scanner(System.in)) {
  		int[] stairs = new int[scanner.nextInt()];
  		memoArr = new int[stairs.length];
  		
  		for (int i = 0; i < stairs.length; i++) {
  			stairs[i] = scanner.nextInt();
  		}
  		
  		if (stairs.length == 1) {
  			System.out.println(stairs[0]);
  			return;
  		}
  		
  		if (stairs.length == 2) {
  			System.out.println(stairs[0] + stairs[1]);
  			return;
  		}
  		
  		memoArr[0] = stairs[0];
  		memoArr[1] = memoArr[0] + stairs[1];
  		memoArr[2] = Math.max(memoArr[0] + stairs[2], stairs[1] + stairs[2]);
  		for (int i = 3; i < stairs.length; i++) {
  			memoArr[i] = Math.max(memoArr[i - 2] + stairs[i], memoArr[i - 3] + stairs[i - 1] + stairs[i]);
  		}

  		System.out.println(memoArr[stairs.length - 1]);
  	}
  }
}

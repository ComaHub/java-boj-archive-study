package dev.coma.boj.Bronze5;

import java.math.BigInteger;
import java.util.Scanner;

public class P27434 {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int num = scanner.nextInt();
			
			if (num == 0) {
				System.out.println(1);
				return;
			}
			
			BigInteger result = factorial(1, num);
			System.out.println(result);
		}
	}
	
	private static BigInteger factorial(int startNum, int endNum) {
		if (startNum == endNum) return BigInteger.valueOf(endNum);
		
		return factorial(startNum, (startNum + endNum) / 2).multiply(factorial(((startNum + endNum) / 2) + 1, endNum));
	}
}

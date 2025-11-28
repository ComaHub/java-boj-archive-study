package dev.coma.boj.Bronze2;

import java.util.Scanner;

public class P2153 {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			String input = scanner.nextLine();
			int inputNum = calNum(input);
			
			boolean isPrime = checkPrime(inputNum);
			if (isPrime) System.out.println("It is a prime word.");
			else System.out.println("It is not a prime word.");
		}
	}
	
	private static int calNum(String input) {
		String[] words = input.split("");
		int result = 0;
		
		for (int i = 0; i < words.length; i++) {
			char word = words[i].charAt(0);
			
			if (word >= 'a' && word <= 'z') {
				result += (word - 'a') + 1;
			} else if (word >= 'A' && word <= 'Z') {
				result += (word - 'A') + 27;
			}
		}
		
		return result;
	}
	
	private static boolean checkPrime(int inputNum) {
		boolean result = true;
		if (inputNum == 1) return result;
		
		for (int i = 2; i * i <= inputNum; i++) {
			if (inputNum % i == 0) {
				result = false;
				break;
			}
		}
		
		return result;
	}
}

package dev.coma.boj.Bronze3;

import java.util.Scanner;

public class P25641 {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int length = Integer.parseInt(scanner.nextLine());
			String input = scanner.nextLine();
			
			while (input.length() != 0) {
				if (checkBalance(input)) {
					System.out.println(input);
					break;
				}
				
				input = input.substring(1);
			}
		}
	}
	
	private static boolean checkBalance(String input) {
		int fullLength = input.length();
		int tteokLength = input.replaceAll("s", "").length();
		
		if (fullLength == tteokLength * 2) return true;
		else return false;
	}
}

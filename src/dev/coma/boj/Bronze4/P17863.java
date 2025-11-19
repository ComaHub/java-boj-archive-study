package dev.coma.boj.Bronze4;

import java.util.Scanner;

public class P17863 {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			String input = scanner.nextLine();
			
			if (input.substring(0, 3).equals("555")) System.out.println("YES");
			else System.out.println("NO");
		}
	}
}

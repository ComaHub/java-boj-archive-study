package dev.coma.boj.Bronze3;

import java.util.Scanner;

public class P15354 {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int line = Integer.parseInt(scanner.nextLine());
			int count = 1;
			char before = scanner.nextLine().charAt(0);
			
			if (line == 1) {
				System.out.println(2);
				return;
			}
			
			for (int i = 1; i < line; i++) {
				char c = scanner.nextLine().charAt(0);
				if (before != c) count++;
				before = c;
			}
			
			System.out.println(count + 1);
		}
	}
}

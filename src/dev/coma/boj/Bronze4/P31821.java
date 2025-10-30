package dev.coma.boj.Bronze4;

import java.util.Scanner;

public class P31821 {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int[] menus = new int[scanner.nextInt()];
			for (int i = 0; i < menus.length; i++) {
				menus[i] = scanner.nextInt();
			}
			
			int people = scanner.nextInt();
			int sum = 0;
			for (int i = 0; i < people; i++) {
				sum += menus[scanner.nextInt() - 1];
			}
			
			System.out.println(sum);
		}
	}
}

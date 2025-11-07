package dev.coma.boj.Bronze4;

import java.util.Scanner;

public class P15059 {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int[] menus = new int[3];
			for (int i = 0; i < menus.length; i++) {
				menus[i] = scanner.nextInt();
			}
			
			int sum = 0;
			for (int i = 0; i < menus.length; i++) {
				menus[i] -= scanner.nextInt();
				if (menus[i] > 0) menus[i] = 0;
				
				sum += menus[i];
			}
			
			System.out.println(-sum);
		}
	}
}

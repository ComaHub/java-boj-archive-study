package dev.coma.boj.Bronze1;

import java.util.Scanner;

public class P25183 {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int length = Integer.parseInt(scanner.nextLine());
			String input = scanner.nextLine();
			int count = 0;
			
			for (int i = 0; i < length; i++) {
				char crnt = input.charAt(i);
				
				if (i == 0) {
					count++;
					continue;
				} 
				
				char prev = input.charAt(i - 1);
				if (crnt == prev + 1 || crnt == prev - 1) {
					count++;
				} else {
					count = 1;
					continue;
				}
				
				if (count == 5) {
					System.out.println("YES");
					return;
				}
			}
			
			System.out.println("NO");
		}
	}
}

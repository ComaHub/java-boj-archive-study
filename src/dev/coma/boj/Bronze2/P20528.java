package dev.coma.boj.Bronze2;

import java.util.Scanner;

public class P20528 {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int testCase = Integer.parseInt(scanner.nextLine());
			String[] input = scanner.nextLine().split(" ");
			String common = null;
			
			for (int i = 0; i < testCase; i++) {
				String first = input[i].substring(0, 1);
				String last = input[i].substring(input[i].length() - 1);
				
				if (!first.equals(last)) {
					System.out.println(0);
					return;
				}
				
				if (common == null) {
					common = new String(first);
				} else {
					if (!common.equals(first)) {
						System.out.println(0);
						return;
					}
				}
			}
			
			System.out.println(1);
		}
	}
}

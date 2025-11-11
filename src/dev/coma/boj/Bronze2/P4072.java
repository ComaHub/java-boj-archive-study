package dev.coma.boj.Bronze2;

import java.util.Scanner;

public class P4072 {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			while (true) {
				String[] input = scanner.nextLine().split(" ");
				if (input.length == 1 && "#".equals(input[0])) break;
				
				for (int i = 0; i < input.length; i++) {
					input[i] = new StringBuilder(input[i]).reverse().toString();
				}
				
				System.out.println(String.join(" ", input));
			}
		}
	}
}

package dev.coma.boj.Silver5;

import java.util.Scanner;

public class P17520 {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int input = scanner.nextInt();
			input = input % 2 == 0 ? input / 2 : (input / 2) + 1;
			
			int result = 1;
			for (int i = 0; i < input; i++) {
				result *= 2;
				result %= 16769023;
			}
			
			System.out.println(result);
		}
	}
}

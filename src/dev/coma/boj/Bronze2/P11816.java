package dev.coma.boj.Bronze2;

import java.util.Scanner;

public class P11816 {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			String input = scanner.nextLine();
			
			int radix = 0;
			if (input.contains("0x")) {
				input = input.substring(2);
				radix = 16;
			}
			else if (input.charAt(0) == '0') {
				input = input.substring(1);
				radix = 8;
			}
			else radix = 10;
			
			System.out.println(Integer.valueOf(input, radix));
		}
	}
}

package dev.coma.boj.Bronze2;

import java.util.Scanner;

public class P4613 {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			while (true) {
				String input = scanner.nextLine();
				if (input.equals("#")) break;
				
				int sum = 0;
				for (int i = 0; i < input.length(); i++) {
					if (input.substring(i, i + 1).equals(" ")) continue;
					
					int num = input.charAt(i) - 'A' + 1;
					sum += (i + 1) * num;
				}
				
				System.out.println(sum);
			}
		}
	}
}

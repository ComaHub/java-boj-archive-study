package dev.coma.boj.Bronze2;

import java.util.Scanner;

public class P29614 {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			String[] input = scanner.nextLine().split("");
			double sum = 0;
			int count = 0;
			
			for (int i = 0; i < input.length; i++) {
				if (input[i].equals("+")) {
					sum += 0.5;
				} else {
					count++;
					if (!input[i].equals("F")) {
						sum += 'E' - input[i].charAt(0);
					}
				}
			}
			
			System.out.println(sum / count);
		}
	}
}

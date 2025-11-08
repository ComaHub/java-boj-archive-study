package dev.coma.boj.Bronze4;

import java.util.Scanner;

public class P17010 {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int testCase = Integer.parseInt(scanner.nextLine());
			for (int i = 0; i < testCase; i++) {
				String[] input = scanner.nextLine().split(" ");
				System.out.println(input[1].repeat(Integer.parseInt(input[0])));
			}
		}
	}
}

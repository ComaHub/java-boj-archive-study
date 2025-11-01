package dev.coma.boj.Bronze4;

import java.util.Scanner;

public class P15873 {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			String[] input = scanner.nextLine().split("");
			
			if (input.length == 2) {
				System.out.println(Integer.parseInt(input[0]) + Integer.parseInt(input[1]));
			} else if (input.length == 3) {
				if (input[1].equals("0")) {
					System.out.println(10 + Integer.parseInt(input[2]));
				} else {
					System.out.println(10 + Integer.parseInt(input[0]));
				}
			} else {
				System.out.println(20);
			}
		}
	}
}

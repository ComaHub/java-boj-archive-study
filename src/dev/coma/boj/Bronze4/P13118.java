package dev.coma.boj.Bronze4;

import java.util.Scanner;

@SuppressWarnings("unused")
public class P13118 {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			String[] positions = scanner.nextLine().split(" ");
			int numX = scanner.nextInt();
			int numY = scanner.nextInt();
			int numR = scanner.nextInt();
			
			for (int i = 0; i < positions.length; i++) {
				int number = Integer.parseInt(positions[i]);
				
				if (number == numX) {
					System.out.println(i + 1);
					return;
				}
			}
			
			System.out.println(0);
		}
	}
}

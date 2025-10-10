package dev.coma.boj.Bronze4;

import java.util.Scanner;

public class P29725 {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int white = 0;
			int black = 0;
			
			for (int i = 0; i < 8; i++) {
				String[] input = scanner.nextLine().split("");
				
				for (int j = 0; j < 8; j++) {
					String unit = input[j];
					if (".".equals(unit)) continue;
					if ("K".equalsIgnoreCase(unit)) continue;
					
					if ("P".equals(unit)) white += 1;
					if ("N".equals(unit) || "B".equals(unit)) white += 3;
					if ("R".equals(unit)) white += 5;
					if ("Q".equals(unit)) white += 9;
					
					if ("p".equals(unit)) black += 1;
					if ("n".equals(unit) || "b".equals(unit)) black += 3;
					if ("r".equals(unit)) black += 5;
					if ("q".equals(unit)) black += 9;
				}
			}
			
			System.out.println(white - black);
		}
	}
}

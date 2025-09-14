package dev.coma.boj.Bronze4;

import java.util.Scanner;

public class P9772 {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			while (scanner.hasNext()) {
				double numX = scanner.nextDouble();
				double numY = scanner.nextDouble();
				
				if (numX == 0 || numY == 0) System.out.println("AXIS");
				if (numX == 0 && numY == 0) break;
				
				if (numX > 0 && numY > 0) System.out.println("Q1");
				if (numX < 0 && numY > 0) System.out.println("Q2");
				if (numX < 0 && numY < 0) System.out.println("Q3");
				if (numX > 0 && numY < 0) System.out.println("Q4");
			}
		}
	}
}

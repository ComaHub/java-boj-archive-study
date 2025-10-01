package dev.coma.boj.Bronze4;

import java.util.Scanner;

public class P30793 {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			double numP = scanner.nextDouble();
			double numR = scanner.nextDouble();
			
			double result = numP / numR;
			if (result < 0.2) System.out.println("weak");
			else if (result < 0.4) System.out.println("normal");
			else if (result < 0.6) System.out.println("strong");
			else System.out.println("very strong");
		}
	}
}

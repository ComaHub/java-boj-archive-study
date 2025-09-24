package dev.coma.boj.Bronze4;

import java.util.Scanner;

public class P8723 {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int numA = scanner.nextInt();
			int numB = scanner.nextInt();
			int numC = scanner.nextInt();
			
			if (numA == numB && numB == numC) {
				System.out.println(2);
			} else {
				if ((numA * numA) + (numB * numB) == (numC * numC)) System.out.println(1);
				else if ((numA * numA) + (numC * numC) == (numB * numB)) System.out.println(1);
				else if ((numB * numB) + (numC * numC) == (numA * numA)) System.out.println(1);
				else System.out.println(0);
			}
		}
	}
}

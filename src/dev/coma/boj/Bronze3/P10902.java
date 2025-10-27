package dev.coma.boj.Bronze3;

import java.util.Scanner;

public class P10902 {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int testCase = scanner.nextInt();
			
			int numF = 0;
			int numSF = 0;
			int numTF = 0;
			for (int i = 0; i < testCase; i++) {
				int numTI = scanner.nextInt();
				int numSI = scanner.nextInt();
				
				if (numSI > numSF) {
					numSF = numSI;
					numF = i + 1;
					numTF = numTI;
				}
			}
			if (numSF == 0) System.out.println(0);
			else System.out.println(numTF + (numF - 1) * 20);
		}
	}
}

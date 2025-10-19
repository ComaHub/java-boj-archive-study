package dev.coma.boj.Bronze4;

import java.util.Scanner;

public class P26566 {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int testCase = scanner.nextInt();
			for (int i = 0; i < testCase; i++) {
				int sliceArea = scanner.nextInt();
				int slicePrice = scanner.nextInt();
				int wholeRadius = scanner.nextInt();
				int wholePrice = scanner.nextInt();
				
				double sliceQuality = (double) sliceArea / slicePrice;
				double wholeQuality = (double) (wholeRadius * wholeRadius * Math.PI) / wholePrice;
				
				System.out.println(sliceQuality > wholeQuality ? "Slice of pizza" : "Whole pizza");
			}
		}
	}
}

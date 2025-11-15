package dev.coma.boj.Bronze4;

import java.util.Scanner;

public class P17874 {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int totalLength = scanner.nextInt();
			int numH = scanner.nextInt();
			int numV = scanner.nextInt();
			
			System.out.println(Math.max(numH, totalLength - numH) * Math.max(numV, totalLength - numV) * 4);
		}
	}
}

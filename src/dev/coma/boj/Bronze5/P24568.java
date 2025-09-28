package dev.coma.boj.Bronze5;

import java.util.Scanner;

public class P24568 {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int cupcakes = (scanner.nextInt() * 8) + (scanner.nextInt() * 3);
			
			System.out.println(cupcakes < 28 ? 0 : cupcakes - 28);
		}
	}
}

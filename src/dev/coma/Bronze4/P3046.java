package dev.coma.Bronze4;

import java.util.Scanner;

public class P3046 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			int r1 = scanner.nextInt();
			int s = scanner.nextInt();

			System.out.println((s * 2) - r1);
		}
  }
}

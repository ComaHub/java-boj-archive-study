package dev.coma.Bronze3;

import java.util.Scanner;

public class P23972 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			int payToEvil = scanner.nextInt();
			int multiplyPoint = scanner.nextInt();

			if (multiplyPoint == 1) {
			  System.out.println(-1);
			  return;
			}

			int result = (int) ((double) multiplyPoint / (multiplyPoint - 1)) * payToEvil;

			while (true) {
			  if ((result - payToEvil) * multiplyPoint >= result) break;

			  result++;
			}

			System.out.println(result);
		}
  }
}

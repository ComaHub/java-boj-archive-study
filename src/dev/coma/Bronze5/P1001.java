package dev.coma.Bronze5;

import java.util.Scanner;

public class P1001 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();

			System.out.println(a - b);
		}
  }
}

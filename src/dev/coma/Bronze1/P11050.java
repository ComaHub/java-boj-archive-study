package dev.coma.Bronze1;

import java.util.Scanner;

public class P11050 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();
			int k = scanner.nextInt();

			int result = fac(n) / (fac(k) * fac(n - k));
			System.out.println(result);
		}
  }

  public static int fac(int n) {
    int result = 1;
    for (int i = 1; i <= n; i++) {
      result *= i;
    }

    return result;
  }
}

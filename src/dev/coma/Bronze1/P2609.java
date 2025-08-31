package dev.coma.Bronze1;

import java.util.Scanner;

public class P2609 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();

			if (a < b) {
			  int temp = a;
			  a = b;
			  b = temp;
			}

			int gcd = gcd(a, b);
			int lcm = lcm(a, b);

			System.out.println(gcd);
			System.out.println(lcm);
		}
  }

  public static int gcd(int a, int b) {
    int gcd = 0;
    for (int i = 1; i <= b; i++) {
      if (a % i == 0 && b % i == 0) {
        gcd = i;
      }
    }

    return gcd;
  }

  public static int lcm(int a, int b) {
    for (int i = a; i <= (a * b); i++) {
      if (i % a == 0 && i % b == 0) {
        return i;
      }
    }

    return (a * b);
  }
}

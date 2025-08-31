package dev.coma.Bronze5;

import java.math.BigInteger;
import java.util.Scanner;

public class P22193 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			@SuppressWarnings("unused")
			int n = scanner.nextInt();
			@SuppressWarnings("unused")
			int m = scanner.nextInt();

			BigInteger numA = scanner.nextBigInteger();
			BigInteger numB = scanner.nextBigInteger();

			System.out.println(numA.multiply(numB));
		}
  }
}

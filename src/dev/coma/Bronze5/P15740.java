package dev.coma.Bronze5;

import java.math.BigInteger;
import java.util.Scanner;

public class P15740 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			BigInteger numA = scanner.nextBigInteger();
			BigInteger numB = scanner.nextBigInteger();

			System.out.println(numA.add(numB));
		}
  }
}

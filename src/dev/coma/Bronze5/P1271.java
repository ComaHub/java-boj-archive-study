package dev.coma.Bronze5;

import java.math.BigInteger;
import java.util.Scanner;

public class P1271 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			BigInteger money = scanner.nextBigInteger();
			BigInteger people = scanner.nextBigInteger();

			System.out.println(money.divide(people));
			System.out.println(money.remainder(people));
		}
  }
}

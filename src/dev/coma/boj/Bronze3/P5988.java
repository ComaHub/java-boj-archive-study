package dev.coma.boj.Bronze3;

import java.math.BigInteger;
import java.util.Scanner;

public class P5988 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			BigInteger two = new BigInteger("2");
			BigInteger remain = new BigInteger("1");

			int testCase = scanner.nextInt();
			for (int i = 0; i < testCase; i++) {
			  BigInteger bNum = scanner.nextBigInteger();

			  if (bNum.remainder(two).equals(remain)) {
			    System.out.println("odd");
			  } else {
			    System.out.println("even");
			  }
			}
		}
  }
}

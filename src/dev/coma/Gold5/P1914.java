package dev.coma.Gold5;

import java.math.BigInteger;
import java.util.Scanner;

public class P1914 {
  static int count = 0;
  static StringBuilder stringBuilder = new StringBuilder();

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			int floor = scanner.nextInt();

			if (floor <= 20) {
			  topPrint(floor, 1, 3);
			  System.out.println(count);
			  System.out.println(stringBuilder);
			} else {
			  topCalc(floor);
			}
		}
  }

  static void topPrint(int floor, int start, int target) {
    if (floor > 1) topPrint(floor - 1, start, 6 - start - target);

    stringBuilder.append(start + " " + target + "\n");
    count++;

    if (floor > 1) topPrint(floor - 1, 6 - start - target, target);
  }

  static void topCalc(int floor) {
    BigInteger result = new BigInteger("1");
    for (int i = 1; i <= floor; i++) {
      result = result.multiply(new BigInteger("2"));
    }

    result = result.subtract(new BigInteger("1"));
    System.out.println(result);
  }
}

package dev.coma.boj.Bronze4;

import java.util.Scanner;

public class P11943 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			int[] firstBucket = {scanner.nextInt(), scanner.nextInt()};
			int[] secondBucket = {scanner.nextInt(), scanner.nextInt()};

			System.out.println(Math.min(firstBucket[0] + secondBucket[1], firstBucket[1] + secondBucket[0]));
		}
  }
}

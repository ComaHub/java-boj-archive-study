package dev.coma.Bronze3;

import java.util.Scanner;

public class P24265 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			long num = scanner.nextLong();
			System.out.println((num * (num - 1)) / 2);
		}

    System.out.println(2);
  }
}

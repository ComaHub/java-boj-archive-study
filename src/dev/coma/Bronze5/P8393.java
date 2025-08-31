package dev.coma.Bronze5;

import java.util.Scanner;

public class P8393 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			int num = scanner.nextInt();
			System.out.println((num * (num + 1)) / 2);
		}
  }
}

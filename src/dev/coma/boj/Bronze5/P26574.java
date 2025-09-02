package dev.coma.boj.Bronze5;

import java.util.Scanner;

public class P26574 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			int testCase = scanner.nextInt();
			for (int i = 0; i < testCase; i++) {
			  int num = scanner.nextInt();
			  System.out.println(num + " " + num);
			}
		}
  }
}

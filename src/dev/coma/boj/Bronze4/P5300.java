package dev.coma.boj.Bronze4;

import java.util.Scanner;

public class P5300 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			int pirateNum = scanner.nextInt();

			for (int i = 1; i <= pirateNum; i++) {
			  System.out.print(i + " ");

			  if (i % 6 == 0 || i == pirateNum) {
			    System.out.print("Go! ");
			  }
			}
		}
  }
}

package dev.coma.boj.Bronze3;

import java.util.Scanner;

public class P5086 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			while (true) {
			  int num1 = scanner.nextInt();
			  int num2 = scanner.nextInt();

			  if (num1 == 0 && num2 == 0) break;

			  if (num1 < num2 && num2 % num1 == 0) {
			    System.out.println("factor");
			  } else if (num1 > num2 && num1 % num2 == 0) {
			    System.out.println("multiple");
			  } else {
			    System.out.println("neither");
			  }
			}
		}
  }
}

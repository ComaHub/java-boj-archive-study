package dev.coma.Bronze5;

import java.util.Scanner;

public class P15680 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			int num = scanner.nextInt();

			if (num == 1) {
			  System.out.println("Leading the Way to the Future");
			}

			if (num == 0) {
			  System.out.println("YONSEI");
			}
		}
  }
}
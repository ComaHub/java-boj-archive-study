package dev.coma.Bronze4;

import java.util.Scanner;

public class P31134 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			int testCase = scanner.nextInt();
			for (int i = 0; i < testCase; i++) {
			  long magnusBan = scanner.nextLong();

			  System.out.println(magnusBan + (magnusBan - 1));
			}
		}
  }
}

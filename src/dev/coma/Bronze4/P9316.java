package dev.coma.Bronze4;

import java.util.Scanner;

public class P9316 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			int number = scanner.nextInt();

			for (int i = 1; i <= number; i++) {
			  System.out.println("Hello World, Judge " + i + "!");
			}
		}
  }
}

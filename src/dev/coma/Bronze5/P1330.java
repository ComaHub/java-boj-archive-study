package dev.coma.Bronze5;

import java.util.Scanner;

public class P1330 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();

			if (a > b) {
			  System.out.println(">");
			} else if (a < b) {
			  System.out.println("<");
			} else {
			  System.out.println("==");
			}
		}
  }
}

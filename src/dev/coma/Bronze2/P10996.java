package dev.coma.Bronze2;

import java.util.Scanner;

public class P10996 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			int number = scanner.nextInt();

			for (int i = 1; i <= 2 * number; i++) {
			  for (int j = 1; j <= number; j++) {
			    if (i % 2 != 0) {
			      if (j % 2 != 0) System.out.print("*");
			      else System.out.print(" ");
			    } else {
			      if (j % 2 == 0) System.out.print("*");
			      else System.out.print(" ");
			    }
			  }

			  System.out.println();
			}
		}
  }
}

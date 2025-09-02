package dev.coma.boj.Bronze3;

import java.util.Scanner;

public class P2445 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			int num = scanner.nextInt();

			for (int i = 1; i <= (2 * num) - 1; i++) {
			  for (int j = 1; j <= (2 * num); j++) {
			    if (i <= num) {
			      if (j <= i || j >= (2 * num + 1) - i) {
			        System.out.print("*");
			      } else {
			        System.out.print(" ");
			      }
			    } else {
			      if (j >= (2 * num + 1) - i && j <= i) {
			        System.out.print(" ");
			      } else {
			        System.out.print("*");
			      }
			    }
			  }

			  System.out.println();
			}
		}
  }
}

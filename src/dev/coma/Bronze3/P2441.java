package dev.coma.Bronze3;

import java.util.Scanner;

public class P2441 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			int num = scanner.nextInt();
			for (int i = 0; i < num; i++) {
			  for (int j = 0; j < num; j++) {
			    if (j >= i) {
			      System.out.print("*");
			    } else {
			      System.out.print(" ");
			    }
			  }

			  System.out.println();
			}
		}
  }
}

package dev.coma.boj.Bronze2;

import java.util.Scanner;

public class P23055 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			int num = scanner.nextInt();

			for (int i = 1; i <= num; i++) {
			  if (i == 1 || i == num) {
			    for (int j = 1; j <= num; j++) {
			      System.out.print("*");
			    }

			    System.out.println();
			  } else {
			    for (int j = 1; j <= num; j++) {
			      if (j == 1 || j == num || j == i || j == ((num + 1) - i)) {
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
}

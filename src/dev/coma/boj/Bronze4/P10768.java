package dev.coma.boj.Bronze4;

import java.util.Scanner;

public class P10768 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			int month = scanner.nextInt();
			int day = scanner.nextInt();

			if (month == 2) {
			  if (day == 18) {
			    System.out.println("Special");
			  } else if (day > 18) {
			    System.out.println("After");
			  } else {
			    System.out.println("Before");
			  }
			} else if (month > 2) {
			  System.out.println("After");
			} else {
			  System.out.println("Before");
			}
		}
  }
}

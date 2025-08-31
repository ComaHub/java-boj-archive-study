package dev.coma.Silver5;

import java.util.Scanner;

public class P24313 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			int a1 = scanner.nextInt();
			int a0 = scanner.nextInt();
			int numC = scanner.nextInt();
			int numN0 = scanner.nextInt();

			if (numC == a1) {
			  if (a0 <= 0) {
			    System.out.println(1);
			    return;
			  } else {
			    System.out.println(0);
			    return;
			  }
			}

			double numN = (double) a0 / (numC - a1);

			if (numC >= a1 && numN <= numN0) System.out.println(1);
			else System.out.println(0);
		}
  }
}

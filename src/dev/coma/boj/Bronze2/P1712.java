package dev.coma.boj.Bronze2;

import java.util.Scanner;

public class P1712 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			int staticExpend = scanner.nextInt();
			int dynamicExpand = scanner.nextInt();
			int lapTopPrice = scanner.nextInt();

			int netIncome = lapTopPrice - dynamicExpand;
			if (netIncome <= 0) {
			  System.out.println(-1);
			} else {
			  System.out.println((staticExpend / netIncome) + 1);
			}
		}
  }
}

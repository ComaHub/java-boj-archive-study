package dev.coma.Bronze4;

import java.util.Scanner;

public class P6888 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			int startYear = scanner.nextInt();
			int endYear = scanner.nextInt();

			while (startYear <= endYear) {
			  System.out.println("All positions change in year " + startYear);
			  startYear += 60;
			}
		}
  }
}

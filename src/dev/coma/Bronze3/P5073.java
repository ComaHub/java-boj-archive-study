package dev.coma.Bronze3;

import java.util.Scanner;

public class P5073 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			int lineA, lineB, lineC;
			while (true) {
			  lineA = scanner.nextInt();
			  lineB = scanner.nextInt();
			  lineC = scanner.nextInt();
			  if (lineA == 0 && lineB == 0 && lineC == 0) break;

			  if (lineA >= lineB + lineC || lineB >= lineA + lineC || lineC >= lineA + lineB) {
			    System.out.println("Invalid");
			    continue;
			  }

			  if (lineA == lineB && lineB == lineC) {
			    System.out.println("Equilateral");
			  } else if (lineA != lineB && lineB != lineC && lineA != lineC) {
			    System.out.println("Scalene");
			  } else {
			    System.out.println("Isosceles");
			  }
			}
		}
  }
}

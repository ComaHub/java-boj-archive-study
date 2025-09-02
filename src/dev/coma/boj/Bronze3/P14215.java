package dev.coma.boj.Bronze3;

import java.util.Scanner;

public class P14215 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			int lineA = scanner.nextInt();
			int lineB = scanner.nextInt();
			int lineC = scanner.nextInt();

			if (lineA >= lineB + lineC) lineA = lineB + lineC - 1;
			if (lineB >= lineA + lineC) lineB = lineA + lineC - 1;
			if (lineC >= lineA + lineB) lineC = lineA + lineB - 1;

			System.out.println(lineA + lineB + lineC);
		}
  }
}

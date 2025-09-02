package dev.coma.boj.Bronze2;

import java.util.Scanner;

public class P1075 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			int numN = scanner.nextInt();
			int numF = scanner.nextInt();

			String result;
			if ((numN / 100 * 100) % numF == 0) {
			  result = String.valueOf(numN / 100 * 100);
			} else {
			  result = String.valueOf(((numN / 100 * 100) + numF) - (((numN / 100 * 100) + numF) % numF));
			}

			System.out.println(result.substring(result.length() - 2));
		}
  }
}

package dev.coma.boj.Bronze5;

import java.util.Scanner;

public class P26489 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			int count = 0;
			while (scanner.hasNext()) {
			  scanner.nextLine();
			  count++;
			}

			System.out.println(count);
		}
  }
}

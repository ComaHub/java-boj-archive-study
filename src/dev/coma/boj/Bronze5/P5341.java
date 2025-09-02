package dev.coma.boj.Bronze5;

import java.util.Scanner;

public class P5341 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			while (true) {
			  int layer = scanner.nextInt();
			  if (layer == 0) return;

			  int result = 0;
			  for (int i = 1; i <= layer; i++) {
			    result += i;
			  }

			  System.out.println(result);
			}
		}
  }
}

package dev.coma.boj.Bronze3;

import java.util.Scanner;

public class P16479 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			int k_length = scanner.nextInt();
			int top_length = scanner.nextInt();
			int bottom_length = scanner.nextInt();

			double triangle_bottom_length = (double) (top_length - bottom_length) / 2;
			double result = (k_length * k_length) - (triangle_bottom_length * triangle_bottom_length);

			System.out.println(result);
		}
  }
}

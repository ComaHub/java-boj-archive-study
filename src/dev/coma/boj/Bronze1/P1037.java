package dev.coma.boj.Bronze1;

import java.util.Scanner;

public class P1037 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			int number = scanner.nextInt();
			int max = 1;
			int min = 1000001;
			
			for (int i = 0; i < number; i++) {
			  int num = scanner.nextInt();
			  if (num > max) max = num;
			  if (num < min) min = num;
			}

			System.out.println(max * min);
		}
  }
}

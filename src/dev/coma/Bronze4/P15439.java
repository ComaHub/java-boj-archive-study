package dev.coma.Bronze4;

import java.util.Scanner;

public class P15439 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			int num = scanner.nextInt();
			System.out.println((num * num) - num);
		}
  }
}

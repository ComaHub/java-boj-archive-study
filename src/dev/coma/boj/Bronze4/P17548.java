package dev.coma.boj.Bronze4;

import java.util.Scanner;

public class P17548 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			String hey = scanner.nextLine();
			String e = hey.substring(1, hey.length() - 1);
			System.out.println("h" + e.repeat(2) + "y");
		}
  }
}

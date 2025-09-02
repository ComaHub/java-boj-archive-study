package dev.coma.boj.Bronze5;

import java.util.Scanner;

public class P4999 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			String myAh = scanner.nextLine();
			String docAh = scanner.nextLine();

			System.out.println(myAh.length() > docAh.length() ? "go" : "no");
		}
  }
}

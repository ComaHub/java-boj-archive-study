package dev.coma.boj.Bronze3;

import java.util.Scanner;

public class P10988 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			String word = scanner.nextLine();
			String reverseWord = new StringBuffer(word).reverse().toString();

			if (word.equals(reverseWord)) {
			  System.out.println("1");
			} else {
			  System.out.println("0");
			}
		}
  }
}

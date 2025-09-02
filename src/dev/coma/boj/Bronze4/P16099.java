package dev.coma.boj.Bronze4;

import java.util.Scanner;

public class P16099 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			int testCase = scanner.nextInt();

			for (int i = 0; i < testCase; i++) {
			  long telHeight = scanner.nextInt();
			  long telWidth = scanner.nextInt();

			  long eurHeight = scanner.nextInt();
			  long eurWidth = scanner.nextInt();

			  long telArea = telWidth * telHeight;
			  long eurArea = eurWidth * eurHeight;

			  if (telArea > eurArea) System.out.println("TelecomParisTech");
			  else if (telArea < eurArea) System.out.println("Eurecom");
			  else System.out.println("Tie");
			}
		}
  }
}

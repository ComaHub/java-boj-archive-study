package dev.coma.boj.Bronze4;

import java.util.Scanner;

public class P5554 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			int totalSecond = 0;
			for (int i = 0; i < 4; i++) {
			  totalSecond += scanner.nextInt();
			}

			System.out.println(totalSecond / 60);
			System.out.println(totalSecond % 60);
		}
  }
}

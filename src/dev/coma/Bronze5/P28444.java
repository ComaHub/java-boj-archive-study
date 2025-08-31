package dev.coma.Bronze5;

import java.util.Scanner;

public class P28444 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			System.out.println((scanner.nextInt() * scanner.nextInt()) - (scanner.nextInt() * scanner.nextInt() * scanner.nextInt()));
		}
  }
}

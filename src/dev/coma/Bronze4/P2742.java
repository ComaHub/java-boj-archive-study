package dev.coma.Bronze4;

import java.util.Scanner;

public class P2742 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			int num = scanner.nextInt();
			for (int i = num; i >= 1; i--) {
			  System.out.println(i);
			}
		}
  }
}

package dev.coma.Bronze3;

import java.util.Scanner;

public class P11719 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			StringBuilder sb = new StringBuilder();

			while (scanner.hasNext()) {
			  sb.append(scanner.nextLine() + "\n");
			}

			System.out.println(sb.toString());
		}
  }
}

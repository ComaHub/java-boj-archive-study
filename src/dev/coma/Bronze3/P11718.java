package dev.coma.Bronze3;

import java.util.Scanner;

public class P11718 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			String result = "";
			while (scanner.hasNext()) {
			  String line = scanner.nextLine();
			  result += (line + "\n");
			}

			System.out.println(result);
		}
  }
}

package dev.coma.Bronze2;

import java.util.Scanner;

public class P10820 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			int[] counter;

			while (scanner.hasNext()) {
			  String line = scanner.nextLine();
			  counter = new int[4]; // 소문자, 대문자, 숫자, 공백
			  for (int i = 0; i < line.length(); i++) {
			    char c = line.charAt(i);

			    if (c >= 'a' && c <= 'z') counter[0]++;
			    else if (c >= 'A' && c <= 'Z') counter[1]++;
			    else if (c >= '0' && c <= '9') counter[2]++;
			    else if (c == ' ') counter[3]++;
			  }

			  for (int i : counter) {
			    System.out.print(i + " ");
			  }

			  System.out.println();
			}
		}
  }
}

package dev.coma.Silver5;

import java.util.Scanner;

public class P1316 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			int testCase = scanner.nextInt();
			scanner.nextLine();

			int count = 0;
			for (int i = 0; i < testCase; i++) {
			  String word = scanner.nextLine();
			  if (isGroupWord(word)) count++;
			}

			System.out.println(count);
		}
  }

  public static boolean isGroupWord(String word) {
    StringBuffer sb = new StringBuffer();
    boolean result = true;

    for (int i = 0; i < word.length(); i++) {
      String s = String.valueOf(word.charAt(i));
      if (!sb.toString().contains(s)) {
        sb.append(s);
      } else if (i > 0 && !String.valueOf(word.charAt(i - 1)).equals(s)) {
        result = false;
      }
    }

    return result;
  }
}

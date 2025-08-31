package dev.coma.Silver5;

import java.util.Scanner;

public class P4659 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			while (true) {
			  String password = scanner.nextLine();
			  if (password.equals("end")) break;

			  if (isContain(password) && isContinuous(password) &&isSame(password)) {
			    System.out.printf("<%s> is acceptable.\n", password);
			  } else {
			    System.out.printf("<%s> is not acceptable.\n", password);
			  }
			}
		}
  }

  public static boolean isContain(String password) {
    String[] passwords = password.split("");
    String vowel = "aeiou";

    for (String word : passwords) {
      if (vowel.contains(word)) {
        return true;
      }
    }

    return false;
  }

  public static boolean isContinuous(String password) {
    String[] passwords = password.split("");
    String vowel = "aeiou";
    int consonantCount = 0;
    int vowelCount = 0;

    for (String word : passwords) {
      if (vowel.contains(word)) {
        consonantCount = 0;
        vowelCount++;
      } else {
        vowelCount = 0;
        consonantCount++;
      }

      if (consonantCount == 3 || vowelCount == 3) {
        return false;
      }
    }

    return true;
  }

  public static boolean isSame(String password) {
    for (int i = 0; i < password.length() - 1; i++) {
      String passwordSlice = password.substring(i, i + 2);

      if (passwordSlice.substring(0, 1).equals(passwordSlice.substring(1, 2)) && !passwordSlice.equals("ee") && !passwordSlice.equals("oo")) {
        return false;
      }
    }

    return true;
  }
}

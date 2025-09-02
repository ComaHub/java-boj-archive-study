package dev.coma.boj.Silver5;

import java.util.Scanner;

public class P2941 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			String croatianWord = scanner.nextLine();
			System.out.println(countCroatianWord(croatianWord));
		}

  }

  public static int countCroatianWord(String croatianWord) {
    int count = 0;
    int pointer = 0;

    for (int i = 0; i < croatianWord.length(); i++) {
      if (pointer > 0) {
        pointer--;
        continue;
      }

      if (croatianWord.substring(i, i + 1).equals("c")) {
        if (i < croatianWord.length() - 1 && "-=".contains(croatianWord.substring(i + 1, i + 2))) {
          pointer++;
          count++;
          continue;
        }
      }

      if (croatianWord.substring(i, i + 1).equals("l") || croatianWord.substring(i, i + 1).equals("n")) {
        if (i < croatianWord.length() - 1 && croatianWord.substring(i + 1, i + 2).equals("j")) {
          pointer++;
          count++;
          continue;
        }
      }

      if (croatianWord.substring(i, i + 1).equals("s") || croatianWord.substring(i, i + 1).equals("z")) {
        if (i < croatianWord.length() - 1 && croatianWord.substring(i + 1, i + 2).equals("=")) {
          pointer++;
          count++;
          continue;
        }
      }

      if (croatianWord.substring(i, i + 1).equals("d")) {
        if (i < croatianWord.length() - 1 && croatianWord.substring(i + 1, i + 2).equals("-")) {
          pointer++;
          count++;
          continue;
        } else if (i < croatianWord.length() - 2 && croatianWord.substring(i + 1, i + 3).equals("z=")) {
          pointer += 2;
          count++;
          continue;
        }
      }

      count++;
    }

    return count;
  }
}

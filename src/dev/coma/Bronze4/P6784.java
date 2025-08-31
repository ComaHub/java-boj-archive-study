package dev.coma.Bronze4;

import java.util.Scanner;

public class P6784 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      String[] answers = new String[scanner.nextInt()];
      scanner.nextLine();

      for (int i = 0; i < answers.length; i++) {
        answers[i] = scanner.nextLine();
      }

      int count = 0;
      for (int i = 0; i < answers.length; i++) {
        if (answers[i].equals(scanner.nextLine())) count++;
      }

      System.out.println(count);
    }
  }
}

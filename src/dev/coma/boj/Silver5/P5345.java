package dev.coma.boj.Silver5;

import java.util.Scanner;

public class P5345 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int testCase = Integer.parseInt(scanner.nextLine());
      String[] plu = {"P", "L", "U"};

      for (int i = 0; i < testCase; i++) {
        String input = scanner.nextLine();

        int pointer = 0;
        int count = 0;
        for (int j = 0; j < input.length(); j++) {
          String str = String.valueOf(input.charAt(j));

          if (str.equalsIgnoreCase(plu[pointer])) {
            pointer++;
          }

          if (pointer == plu.length) {
            count++;
            pointer = 0;
          }
        }

        System.out.println(count);
      }
    }
  }
}

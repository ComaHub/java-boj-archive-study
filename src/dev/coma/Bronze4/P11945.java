package dev.coma.Bronze4;

import java.util.Scanner;

public class P11945 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      String[] settings = scanner.nextLine().split(" ");
      int lines = Integer.parseInt(settings[0]);

      for (int i = 0; i < lines; i++) {
        String input = new StringBuilder(scanner.nextLine()).reverse().toString();

        System.out.println(input);
      }
    }
  }
}

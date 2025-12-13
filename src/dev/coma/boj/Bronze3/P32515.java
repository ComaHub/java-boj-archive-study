package dev.coma.boj.Bronze3;

import java.util.Scanner;

public class P32515 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int length = Integer.parseInt(scanner.nextLine());

      String[] jhBeat = scanner.nextLine().split("");
      String[] jhKey = scanner.nextLine().split("");
      String[] iaBeat = scanner.nextLine().split("");
      String[] iaKey = scanner.nextLine().split("");

      StringBuilder stringBuilder = new StringBuilder();
      for (int i = 0; i < length; i++) {
        if (!jhBeat[i].equals(iaBeat[i])) continue;

        if (jhKey[i].equals(iaKey[i])) {
          stringBuilder.append(jhKey[i]);
        } else {
          System.out.println("htg!");
          return;
        }
      }

      System.out.println(stringBuilder);
    }
  }
}

package dev.coma.boj.Bronze2;

import java.util.Scanner;

public class P11944 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int numN = scanner.nextInt();
      int numM = scanner.nextInt();

      String result = String.valueOf(numN).repeat(numN);
      if (result.length() > numM) {
        result = result.substring(0, numM);
      }

      System.out.println(result);
    }
  }
}

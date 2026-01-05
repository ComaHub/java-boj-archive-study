package dev.coma.boj.Bronze2;

import java.util.Scanner;

public class P2386 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      while (true) {
        String input = scanner.nextLine();

        if ("#".equals(input)) break;

        String alphabet = input.substring(0, 1);
        String[] inputs = input.substring(2).split("");

        int count = 0;
        for (String s : inputs) {
          if (s.equalsIgnoreCase(alphabet)) count++;
        }

        System.out.println(alphabet + " " + count);
      }
    }
  }
}

package dev.coma.Bronze3;

import java.util.Scanner;

public class P18005 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int numbers = scanner.nextInt();

      if (numbers % 2 == 1) System.out.println(0);
      else {
        if (numbers / 2 % 2 == 0) System.out.println(2);
        else System.out.println(1);
      }
    }
  }
}

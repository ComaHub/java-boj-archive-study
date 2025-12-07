package dev.coma.boj.Bronze1;

import java.util.Scanner;

public class P11557 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int testCase = Integer.parseInt(scanner.nextLine());
      for (int i = 0; i < testCase; i++) {
        int univNum = Integer.parseInt(scanner.nextLine());

        String univ = null;
        int maxDrink = -1;
        for (int j = 0; j < univNum; j++) {
          String[] input = scanner.nextLine().split(" ");
          int inputDrink = Integer.parseInt(input[1]);

          if (inputDrink > maxDrink) {
            univ = input[0];
            maxDrink = inputDrink;
          }
        }

        System.out.println(univ);
      }
    }
  }
}

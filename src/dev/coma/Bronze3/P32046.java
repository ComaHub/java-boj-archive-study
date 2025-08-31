package dev.coma.Bronze3;

import java.util.Scanner;

public class P32046 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      while (true) {
        int num = scanner.nextInt();
        if (num == 0) break;

        int[] snacks = new int[num];
        for (int i = 0; i < snacks.length; i++) {
          snacks[i] = scanner.nextInt();
        }

        System.out.println(calcPrice(snacks));
      }
    }
  }

  private static int calcPrice(int[] snacks) {
    int sum = 0;
    for (int snack : snacks) {
      if (sum + snack <= 300) sum += snack;
    }

    return sum;
  }
}

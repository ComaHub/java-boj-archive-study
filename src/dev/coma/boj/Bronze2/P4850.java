package dev.coma.boj.Bronze2;

import java.util.Scanner;

public class P4850 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      while (scanner.hasNext()) {
        int basketCount = scanner.nextInt();
        int weightPerCoin = scanner.nextInt();
        int lessWeight = scanner.nextInt();
        int totalCoinWeight = scanner.nextInt();

        int idealWeight = (((basketCount) * (basketCount - 1)) / 2) * weightPerCoin;
        int resultIndex;
        if (totalCoinWeight == idealWeight) resultIndex = basketCount;
        else resultIndex = (idealWeight - totalCoinWeight) / lessWeight;

        System.out.println(resultIndex);
      }
    }
  }
}

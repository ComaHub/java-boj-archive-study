package dev.coma.Bronze3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class P21312 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int drinkA = scanner.nextInt();
      int drinkB = scanner.nextInt();
      int drinkC = scanner.nextInt();

      List<Integer> drinkList = makeAllCocktail(drinkA, drinkB, drinkC);

      int bestDrink = selectBestCocktail(drinkList);
      System.out.println(bestDrink);
    }
  }

  private static List<Integer> makeAllCocktail(int drinkA, int drinkB, int drinkC) {
    List<Integer> drinkList = new ArrayList<>();
    drinkList.add(drinkA);
    drinkList.add(drinkB);
    drinkList.add(drinkC);
    drinkList.add(drinkA * drinkB);
    drinkList.add(drinkA * drinkC);
    drinkList.add(drinkB * drinkC);
    drinkList.add(drinkA * drinkB * drinkC);

    return drinkList;
  }

  private static int selectBestCocktail(List<Integer> drinkList) {
    drinkList.sort(Comparator.reverseOrder());

    for (Integer drink : drinkList) {
      if (drink % 2 == 1) return drink;
    }

    for (Integer drink : drinkList) {
      if (drink % 2 == 0) return drink;
    }

    return 0;
  }
}

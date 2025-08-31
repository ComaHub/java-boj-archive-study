package dev.coma.Bronze4;

import java.util.Scanner;

public class P6810 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      String input = "9780921418"
              + scanner.nextLine()
              + scanner.nextLine()
              + scanner.nextLine();

      String[] numbers = input.split("");
      int result = 0;
      for (int i = 0; i < numbers.length; i++) {
        int multiNum;
        if (i % 2 == 0) multiNum = 1;
        else multiNum = 3;

        result += (Integer.parseInt(numbers[i]) * multiNum);
      }

      System.out.println("The 1-3-sum is " + result);
    }
  }
}

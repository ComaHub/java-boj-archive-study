package dev.coma.boj.Bronze5;

import java.util.Scanner;

public class P31429 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int input = scanner.nextInt();

      switch (input) {
        case 1 -> System.out.println("12 1600");
        case 2 -> System.out.println("11 894");
        case 3 -> System.out.println("11 1327");
        case 4 -> System.out.println("10 1311");
        case 5 -> System.out.println("9 1004");
        case 6 -> System.out.println("9 1178");
        case 7 -> System.out.println("9 1357");
        case 8 -> System.out.println("8 837");
        case 9 -> System.out.println("7 1055");
        case 10 -> System.out.println("6 556");
        case 11 -> System.out.println("6 773");
      }
    }
  }
}

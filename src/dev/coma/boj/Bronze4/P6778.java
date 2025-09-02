package dev.coma.boj.Bronze4;

import java.util.Scanner;

public class P6778 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int antenna = scanner.nextInt();
      int eye = scanner.nextInt();

      if (antenna >= 3 && eye <= 4) {
        System.out.println("TroyMartian");
      }

      if (antenna <= 6 && eye >= 2) {
        System.out.println("VladSaturnian");
      }

      if (antenna <= 2 && eye <= 3) {
        System.out.println("GraemeMercurian");
      }
    }
  }
}

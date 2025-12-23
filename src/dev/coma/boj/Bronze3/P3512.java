package dev.coma.boj.Bronze3;

import java.util.Scanner;

public class P3512 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int roomCount = scanner.nextInt();
      int price = scanner.nextInt();
      scanner.nextLine();

      double totalRoom = 0;
      double totalPrice = 0;
      double bedroom = 0;
      double balcony = 0;
      for (int i = 0; i < roomCount; i++) {
        String[] input = scanner.nextLine().split(" ");
        double size = Double.parseDouble(input[0]);
        String roomName = input[1];

        if ("bedroom".equals(roomName)) {
          bedroom += size;
          totalRoom += size;
        } else if ("balcony".equals(roomName)) {
          balcony += size;
        } else {
          totalRoom += size;
        }
      }

      totalPrice = ((totalRoom + (balcony / 2)) * price);

      System.out.println((int) (totalRoom + balcony));
      System.out.println((int) bedroom);
      System.out.println(totalPrice);
    }
  }
}

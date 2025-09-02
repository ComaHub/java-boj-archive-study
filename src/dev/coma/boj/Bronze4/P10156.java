package dev.coma.boj.Bronze4;

import java.util.Scanner;

public class P10156 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			int price = scanner.nextInt();
			int amount = scanner.nextInt();
			int money = scanner.nextInt();

			int need = (price * amount) - money;
			if (need < 0) need = 0;

			System.out.println(need);
		}
  }
}

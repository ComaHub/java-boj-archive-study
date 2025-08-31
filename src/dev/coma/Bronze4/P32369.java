package dev.coma.Bronze4;

import java.util.Scanner;

public class P32369 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			int goodOnion = 1;
			int badOnion = 1;

			int testDay = scanner.nextInt();
			int goodPoint = scanner.nextInt();
			int badPoint = scanner.nextInt();

			for (int i = 1; i <= testDay; i++) {
			  goodOnion += goodPoint;
			  badOnion += badPoint;

			  if (goodOnion < badOnion) {
			    int temp = goodOnion;
			    goodOnion = badOnion;
			    badOnion = temp;
			  }

			  if (goodOnion == badOnion) {
			    badOnion--;
			  }
			}

			System.out.println(goodOnion + " " + badOnion);
		}
  }
}

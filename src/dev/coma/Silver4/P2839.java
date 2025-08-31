package dev.coma.Silver4;

import java.util.Scanner;

public class P2839 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			int sugarWeight = scanner.nextInt();
			int kg5 = sugarWeight / 5;
			int kg3 = 0;

			sugarWeight %= 5;
			switch (sugarWeight) {
			  case 1 -> {
			    kg5--;
			    kg3 = 2;
			  }

			  case 2 -> {
			    kg5 -= 2;
			    kg3 = 4;
			  }

			  case 3 -> kg3 = 1;

			  case 4 -> {
			    kg5--;
			    kg3 = 3;
			  }

			  default -> {}
			}

			if (kg5 < 0) System.out.println(-1);
			else System.out.println(kg5 + kg3);
		}
  }
}

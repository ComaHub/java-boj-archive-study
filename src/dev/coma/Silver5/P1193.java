package dev.coma.Silver5;

import java.util.Scanner;

public class P1193 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			int num = scanner.nextInt();
			int counter = 1;
			while (num - counter > 0) {
			  num -= counter++;
			}

			if (counter % 2 == 0) {
			  System.out.println(num + "/" + (counter - num + 1));
			} else {
			  System.out.println((counter - num + 1) + "/" + num);
			}
		}
  }
}

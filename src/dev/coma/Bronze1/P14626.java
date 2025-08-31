package dev.coma.Bronze1;

import java.util.Scanner;

public class P14626 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			String[] bookNumber = scanner.nextLine().split("");

			int targetIndex = 0;
			int sum = 0;
			for (int i = 0; i < bookNumber.length - 1; i++) {
			  if ("*".equals(bookNumber[i])) {
			    targetIndex = i;
			    continue;
			  }

			  if (i % 2 == 0) {
			    sum += Integer.parseInt(bookNumber[i]);
			  } else {
			    sum += 3 * (Integer.parseInt(bookNumber[i]));
			  }
			}

			int result = 10 - ((sum + Integer.parseInt(bookNumber[12])) % 10);
			if (result == 10) result = 0;

			if (targetIndex % 2 == 0) System.out.println(result);
			else {
			  switch (result) {
			    case 1 -> System.out.println(7);
			    case 2 -> System.out.println(4);
			    case 3 -> System.out.println(1);
			    case 4 -> System.out.println(8);
			    case 5 -> System.out.println(5);
			    case 6 -> System.out.println(2);
			    case 7 -> System.out.println(9);
			    case 8 -> System.out.println(6);
			    case 9 -> System.out.println(3);
			    default -> System.out.println(0);
			  }
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
  }
}

package dev.coma.boj.Bronze1;

import java.util.Scanner;

public class P1110 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			int number = scanner.nextInt();
			int firstNum = number;
			int count = 0;

			while (true) {
			  String[] numbers = new String[2];
			  if (number < 10) {
			    numbers[0] = "0";
			    numbers[1] = String.valueOf(number);
			  } else {
			    numbers = String.valueOf(number).split("");
			  }

			  int sum = 0;
			  for (String s : numbers) {
			    sum += Integer.parseInt(s);
			  }

			  int newNumber = Integer.parseInt(numbers[1] + (sum % 10));
			  count++;

			  if (newNumber == firstNum) {
			    System.out.println(count);
			    break;
			  } else {
			    number = newNumber;
			  }
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
  }
}

package dev.coma.boj.Bronze2;

import java.util.Scanner;

public class P2745 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			String[] line = scanner.nextLine().split(" ");
			String[] numbers = line[0].split("");
			int numeral = Integer.parseInt(line[1]);

			int pointer = numbers.length - 1;
			int result = 0;
			int multiplier = 1;
			while (pointer >= 0) {
			  int thisNum = "0123456789".contains(numbers[pointer]) ? Integer.parseInt(numbers[pointer]) : numbers[pointer].charAt(0) - 55;
			  result += thisNum * multiplier;

			  pointer--;
			  multiplier *= numeral;
			}

			System.out.println(result);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
  }
}

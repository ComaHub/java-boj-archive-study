package dev.coma.Bronze2;

import java.util.Scanner;

public class P1076 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			String[] resists = {scanner.nextLine(), scanner.nextLine(), scanner.nextLine()};
			String result = ("black".equals(resists[0]) ? "" : colorToNum(resists[0]) + "");
			result += colorToNum(resists[1]);
			result += "0".equals(result) ? "" : "0".repeat(colorToNum(resists[2]));

			System.out.println(result);
		}
  }

  static int colorToNum(String color) {
    return switch (color) {
      case "black" -> 0;
      case "brown" -> 1;
      case "red" -> 2;
      case "orange" -> 3;
      case "yellow" -> 4;
      case "green" -> 5;
      case "blue" -> 6;
      case "violet" -> 7;
      case "grey" -> 8;
      case "white" -> 9;
      default -> -1;
    };
  }
}

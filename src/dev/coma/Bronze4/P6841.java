package dev.coma.Bronze4;

import java.util.Scanner;

public class P6841 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      while (scanner.hasNext()) {
        printTranslation(scanner.nextLine());
      }
    }
  }

  private static void printTranslation(String shortForm) {
    System.out.println(switch (shortForm) {
      case "CU" -> "see you";
      case ":-)" -> "I’m happy";
      case ":-(" -> "I’m unhappy";
      case ";-)" -> "wink";
      case ":-P" -> "stick out my tongue";
      case "(~.~)" -> "sleepy";
      case "TA" -> "totally awesome";
      case "CCC" -> "Canadian Computing Competition";
      case "CUZ" -> "because";
      case "TY" -> "thank-you";
      case "YW" -> "you’re welcome";
      case "TTYL" -> "talk to you later";
      default -> shortForm;
    });
  }
}

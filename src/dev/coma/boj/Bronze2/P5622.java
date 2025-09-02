package dev.coma.boj.Bronze2;

import java.util.Scanner;

public class P5622 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			String[] alphaToNum = {"", "", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};
			String word = scanner.nextLine();

			System.out.println(timeToCall(alphaToNum, word));
		}
  }

  public static int timeToCall(String[] alphaToNum, String word) {
    String[] words = word.split("");
    int result = 0;

    for (String s : words) {
      for (int i = 0; i < alphaToNum.length; i++) {
        if (alphaToNum[i].contains(s)) { result += (i + 1); }
      }
    }

    return result;
  }
}

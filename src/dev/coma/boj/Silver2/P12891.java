package dev.coma.boj.Silver2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P12891 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int wordLength = scanner.nextInt();
      int passwordLength = scanner.nextInt();
      scanner.nextLine();

      String[] words = scanner.nextLine().split("");
      Map<String, Integer> needMap = new HashMap<>();
      needMap.put("A", scanner.nextInt());
      needMap.put("C", scanner.nextInt());
      needMap.put("G", scanner.nextInt());
      needMap.put("T", scanner.nextInt());

      Map<String, Integer> passwordMap = new HashMap<>();
      passwordMap.put("A", 0);
      passwordMap.put("C", 0);
      passwordMap.put("G", 0);
      passwordMap.put("T", 0);

      for (int i = 0; i < passwordLength; i++) {
        passwordMap.put(words[i], passwordMap.get(words[i]) + 1);
      }

      int startIdx = 0;
      int endIndex = passwordLength - 1;
      int counter = 0;
      if (checkPassword(passwordMap, needMap)) counter++;

      while (endIndex < words.length - 1) {
        passwordMap.put(words[startIdx], passwordMap.get(words[startIdx]) - 1);
        startIdx++;

        endIndex++;
        passwordMap.put(words[endIndex], passwordMap.get(words[endIndex]) + 1);

        if (checkPassword(passwordMap, needMap)) counter++;
      }

      System.out.println(counter);
    }
  }

  private static boolean checkPassword(Map<String, Integer> passwordMap, Map<String, Integer> needMap) {
    if (passwordMap.get("A") < needMap.get("A")) return false;
    if (passwordMap.get("C") < needMap.get("C")) return false;
    if (passwordMap.get("G") < needMap.get("G")) return false;
    if (passwordMap.get("T") < needMap.get("T")) return false;

    return true;
  }
}

package dev.coma.boj.Bronze2;

import java.util.*;

public class P9056 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int testCase = Integer.parseInt(scanner.nextLine());

      Master:
      for (int i = 0; i < testCase; i++) {
        String[] input = scanner.nextLine().split(" ");
        String bank = input[0];
        String word = input[1];

        List<String> bankList = Arrays.asList(bank.split(""));
        bankList.sort(Comparator.naturalOrder());

        List<String> wordList = Arrays.asList(word.split(""));
        wordList = new ArrayList<>(new HashSet<>(wordList));
        wordList.sort(Comparator.naturalOrder());

        if (bankList.size() != wordList.size()) System.out.println("NO");
        else {
          for (int j = 0; j < bankList.size(); j++) {
            if (!bankList.get(j).equals(wordList.get(j))) {
              System.out.println("NO");
              continue Master;
            }
          }

          System.out.println("YES");
        }
      }
    }
  }
}

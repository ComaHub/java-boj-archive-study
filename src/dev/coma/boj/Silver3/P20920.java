package dev.coma.boj.Silver3;

import java.io.*;
import java.util.*;

public class P20920 {
  private static final BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
  private static final BufferedWriter BW = new BufferedWriter(new OutputStreamWriter(System.out));
  private static final Map<String, Integer> WORD_COUNT = new HashMap<>();
  private static List<String> WORD_LIST = new ArrayList<>();

  public static void main(String[] args) {
    try (BR; BW) {
      StringTokenizer stringTokenizer = new StringTokenizer(BR.readLine());
      int testCase = Integer.parseInt(stringTokenizer.nextToken());
      int minLength = Integer.parseInt(stringTokenizer.nextToken());

      for (int i = 0; i < testCase; i++) {
        String word = BR.readLine();

        if (word.length() >= minLength) {
          addWordList(word);
        }
      }

      WORD_LIST = new ArrayList<>(new HashSet<>(WORD_LIST));

      sortWordList();
      printWordList();

    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  private static void addWordList(String word) {
    int count = WORD_COUNT.containsKey(word) ? WORD_COUNT.get(word) + 1 : 1;

    WORD_LIST.add(word);
    WORD_COUNT.put(word, count);
  }

  private static void sortWordList() {
    WORD_LIST.sort(new Comparator<String>() {
      @Override
      public int compare(String o1, String o2) {
        int o1Count = WORD_COUNT.get(o1);
        int o2Count = WORD_COUNT.get(o2);

        if (o1Count != o2Count) {
          return Integer.compare(o2Count, o1Count);
        } else if (o1.length() != o2.length()) {
          return Integer.compare(o2.length(), o1.length());
        } else {
          return o1.compareTo(o2);
        }
      }
    });
  }

  private static void printWordList() throws IOException {
    for (String word : WORD_LIST) {
      BW.write(word + "\n");
    }

    BW.flush();
  }
}

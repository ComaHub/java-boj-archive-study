package dev.coma.Silver5;

import java.io.*;
import java.util.*;

public class P1181 {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
    Set<String> set = new HashSet<>();
    List<String> list;

    int amountWord = Integer.parseInt(bufferedReader.readLine());
    for (int i = 0; i < amountWord; i++) {
      set.add(bufferedReader.readLine());
    }

    list = new ArrayList<>(set);
    list.sort(new Comparator<String>() {
      @Override
      public int compare(String o1, String o2) {
        if (o1.length() == o2.length()) {
          return o1.compareTo(o2);
        } else {
          return Integer.compare(o1.length(), o2.length());
        }
      }
    });

    for (String s : list) {
      bufferedWriter.write(s + "\n");
    }

    bufferedWriter.flush();

    bufferedReader.close();
    bufferedWriter.close();
  }
}

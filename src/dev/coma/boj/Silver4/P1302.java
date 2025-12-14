package dev.coma.boj.Silver4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class P1302 {
  public static void main(String[] args) {
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
      int bookCount = Integer.parseInt(br.readLine());
      List<String> bookList = new ArrayList<>();

      for (int i = 0; i < bookCount; i++) {
        bookList.add(br.readLine());
      }

      bookList.sort(Comparator.naturalOrder());

      String bestSeller = bookList.get(0);
      int count = 1;
      int bestCount = -1;
      for (int i = 1; i < bookList.size(); i++) {
        if (bookList.get(i - 1).equals(bookList.get(i))) {
          count++;

          if (i == bookList.size() - 1 && count > bestCount) {
            bestSeller = bookList.get(i);
            bestCount = count;
          }
        } else {
          if (count > bestCount) {
            bestSeller = bookList.get(i - 1);
            bestCount = count;
            count = 1;
          } else {
            count = 1;
          }
        }
      }

      System.out.println(bestSeller);
    } catch (Exception e) {
      System.err.println(e.getStackTrace()[0]);
    }
  }
}

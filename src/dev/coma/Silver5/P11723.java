package dev.coma.Silver5;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class P11723 {
  private static Set<Integer> set = new HashSet<>();

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

    int command = Integer.parseInt(bufferedReader.readLine());
    for (int i = 0; i < command; i++) {
      String[] order = bufferedReader.readLine().split(" ");

      switch (order[0]) {
        case "add" -> add(Integer.valueOf(order[1]));
        case "remove" -> remove(Integer.valueOf(order[1]));
        case "check" -> bufferedWriter.write(check(Integer.valueOf(order[1])) + "\n");
        case "toggle" -> toggle(Integer.valueOf(order[1]));
        case "all" -> all();
        case "empty" -> empty();
      }
    }

    bufferedWriter.flush();

    bufferedReader.close();
    bufferedWriter.close();
  }

  static void add(Integer num) {
    set.add(num);
  }

  static void remove(Integer num) {
    set.remove(num);
  }

  static int check(Integer num) {
    return set.contains(num) ? 1 : 0;
  }

  static void toggle(Integer num) {
    if (set.contains(num)) set.remove(num);
    else set.add(num);
  }

  static void all() {
    empty();
    for (int i = 1; i <= 20; i++) {
      set.add(i);
    }
  }

  static void empty() {
    set.clear();
  }
}

package dev.coma.boj.Silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class P14425 {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    Set<String> set = new HashSet<>();

    String[] settings = bufferedReader.readLine().split(" ");
    int wordNum = Integer.parseInt(settings[0]);
    int checkNum = Integer.parseInt(settings[1]);

    for (int i = 0; i < wordNum; i++) {
      set.add(bufferedReader.readLine());
    }

    int count = 0;
    for (int i = 0; i < checkNum; i++) {
      if (set.contains(bufferedReader.readLine())) count++;
    }

    System.out.println(count);
    bufferedReader.close();
  }
}

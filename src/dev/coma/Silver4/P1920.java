package dev.coma.Silver4;

import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class P1920 {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer stringTokenizer;
    Set<Long> set = new HashSet<>();

    int inputNum = Integer.parseInt(bufferedReader.readLine());
    stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
    for (int i = 0; i < inputNum; i++) {
      set.add(Long.valueOf(stringTokenizer.nextToken()));
    }

    int setSize = set.size();

    int checkNum = Integer.parseInt(bufferedReader.readLine());
    stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
    for (int i = 0; i < checkNum; i++) {
      Long item = Long.valueOf(stringTokenizer.nextToken());
      set.add(item);

      if (set.size() == setSize) bufferedWriter.write(1 + "\n");
      else {
        bufferedWriter.write(0 + "\n");
        set.remove(item);
      }
    }

    bufferedWriter.flush();
    bufferedReader.close();
    bufferedWriter.close();
  }
}

package dev.coma.Silver4;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class P10816 {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer stringTokenizer;
    Map<String, Integer> map = new HashMap<>();

    int inputCase = Integer.parseInt(bufferedReader.readLine());
    stringTokenizer = new StringTokenizer(bufferedReader.readLine());
    for (int i = 0; i < inputCase; i++) {
      String key = stringTokenizer.nextToken();
      if (!map.containsKey(key)) {
        map.put(key, 1);
        continue;
      }

      int value = map.get(key);
      map.put(key, ++value);
    }

    int keyCase = Integer.parseInt(bufferedReader.readLine());
    stringTokenizer = new StringTokenizer(bufferedReader.readLine());
    for (int i = 0; i < keyCase; i++) {
      Integer value = map.get(stringTokenizer.nextToken());

      bufferedWriter.write(value == null ? 0 + " " : value + " ");
    }

    bufferedWriter.flush();

    bufferedReader.close();
    bufferedWriter.close();
  }
}

package dev.coma.boj.Silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P11004 {
  public static void main(String[] args) throws IOException {
    try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
      String[] input = bufferedReader.readLine().split(" ");
      int numCount = Integer.parseInt(input[0]);
      int targetIdx = Integer.parseInt(input[1]) - 1;

      Integer[] numArr = Arrays.stream(bufferedReader.readLine().split(" "))
              .map(Integer::parseInt)
              .sorted()
              .toArray(Integer[]::new)
              ;

      System.out.println(numArr[targetIdx]);
    }
  }
}

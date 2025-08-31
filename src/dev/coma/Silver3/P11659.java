package dev.coma.Silver3;

import java.io.*;

public class P11659 {
  public static void main(String[] args) throws IOException {
    try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
         BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out))) {
      String[] setting = bufferedReader.readLine().split(" ");
      int numCount = Integer.parseInt(setting[0]);
      int testCase = Integer.parseInt(setting[1]);

      String[] numbers = bufferedReader.readLine().split(" ");
      int[] numberArr = new int[numCount];
      for (int i = 0; i < numberArr.length; i++) {
        numberArr[i] = Integer.parseInt(numbers[i]);
      }

      int[] numberSumArr = new int[numCount];
      numberSumArr[0] = numberArr[0];
      for (int i = 1; i < numberSumArr.length; i++) {
        numberSumArr[i] = numberSumArr[i - 1] + numberArr[i];
      }

      for (int i = 0; i < testCase; i++) {
        String[] pointer = bufferedReader.readLine().split(" ");
        int iPoint = Integer.parseInt(pointer[0]);
        int jPoint = Integer.parseInt(pointer[1]);

        if (iPoint <= 1) {
          bufferedWriter.write(numberSumArr[jPoint - 1] + "\n");
        } else {
          bufferedWriter.write((numberSumArr[jPoint - 1] - numberSumArr[iPoint - 2]) + "\n");
        }
      }

      bufferedWriter.flush();
    }
  }
}

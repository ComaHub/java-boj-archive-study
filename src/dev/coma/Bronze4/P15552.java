package dev.coma.Bronze4;

import java.io.*;
import java.util.StringTokenizer;

public class P15552 {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer stringTokenizer;

    int testCase = Integer.parseInt(bufferedReader.readLine());

    for (int i = 0; i < testCase; i++) {
      stringTokenizer = new StringTokenizer(bufferedReader.readLine());
      int num1 = Integer.parseInt(stringTokenizer.nextToken());
      int num2 = Integer.parseInt(stringTokenizer.nextToken());

      String result = String.valueOf(num1 + num2);
      bufferedWriter.write(result + "\n");
    }

    bufferedWriter.flush();
    
    bufferedReader.close();
    bufferedWriter.close();
  }
}

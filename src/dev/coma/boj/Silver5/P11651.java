package dev.coma.boj.Silver5;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class P11651 {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
    List<String> list = new ArrayList<>();

    int pointNum = Integer.parseInt(bufferedReader.readLine());
    for (int i = 0; i < pointNum; i++) {
      list.add(bufferedReader.readLine());
    }

    Collections.sort(list, new Comparator<String>() {
      @Override
      public int compare(String o1, String o2) {
        String[] o1Items = o1.split(" ");
        String[] o2Items = o2.split(" ");

        if (Integer.parseInt(o1Items[1]) > Integer.parseInt(o2Items[1])) return 1;
        else if (Integer.parseInt(o1Items[1]) < Integer.parseInt(o2Items[1])) return -1;
        else {
          if (Integer.parseInt(o1Items[0]) > Integer.parseInt(o2Items[0])) return 1;
          else if (Integer.parseInt(o1Items[0]) < Integer.parseInt(o2Items[0])) return -1;
          else return 0;
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

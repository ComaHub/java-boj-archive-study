package dev.coma.Silver4;

import java.io.*;
import java.util.*;

public class P1764 {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
    Set<String> notHearSet = new HashSet<>();
    Set<String> notLookSet = new HashSet<>();
    Set<String> notHearLookSet;
    List<String> notHearLookList;

    String[] setter = bufferedReader.readLine().split(" ");
    int notHearNum = Integer.parseInt(setter[0]);
    int notLookNum = Integer.parseInt(setter[1]);

    for (int i = 0; i < notHearNum; i++) {
      notHearSet.add(bufferedReader.readLine());
    }

    for (int i = 0; i < notLookNum; i++) {
      notLookSet.add(bufferedReader.readLine());
    }

    notHearLookSet = new HashSet<>(notHearSet);
    notHearLookSet.retainAll(notLookSet);

    notHearLookList = new ArrayList<>(notHearLookSet);
    notHearLookList.sort(Comparator.naturalOrder());

    System.out.println(notHearLookList.size());
    for (String s : notHearLookList) {
      bufferedWriter.write(s + "\n");
    }

    bufferedWriter.flush();

    bufferedReader.close();
    bufferedWriter.close();
  }
}

package dev.coma.Silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class P1269 {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer stringTokenizer;
    Set<String> groupA = new HashSet<>();
    Set<String> groupB = new HashSet<>();

    String[] settings = bufferedReader.readLine().split(" ");
    int groupASize = Integer.parseInt(settings[0]);
    int groupBSize = Integer.parseInt(settings[1]);

    stringTokenizer = new StringTokenizer(bufferedReader.readLine());
    for (int i = 0; i < groupASize; i++) {
      groupA.add(stringTokenizer.nextToken());
    }

    stringTokenizer = new StringTokenizer(bufferedReader.readLine());
    for (int i = 0; i < groupBSize; i++) {
      groupB.add(stringTokenizer.nextToken());
    }

    Set<String> unionAB = new HashSet<>(groupA);
    unionAB.addAll(groupB);

    Set<String> retainAB = new HashSet<>(groupA);
    retainAB.retainAll(groupB);

    unionAB.removeAll(retainAB);
    System.out.println(unionAB.size());
    
    bufferedReader.close();
  }
}

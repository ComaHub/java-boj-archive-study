package dev.coma.boj.Silver4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class P25192 {
  private static final Set<String> USER_SET = new HashSet<>();
  private static final BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));

  private static int gomCount = 0;

  public static void main(String[] args) {
    try (BR) {
      int chatLogCount = Integer.parseInt(BR.readLine());
      for (int i = 0; i < chatLogCount; i++) {
        analyzeLog(BR.readLine());
      }

      System.out.println(gomCount + USER_SET.size());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  private static void analyzeLog(String log) {
    if (log.equals("ENTER")) cleanUserSet();
    else addUserSet(log);
  }

  private static void cleanUserSet() {
    gomCount += USER_SET.size();
    USER_SET.clear();
  }

  private static void addUserSet(String user) {
    USER_SET.add(user);
  }
}

package dev.coma.boj.Bronze2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P23401 {
  private static class SprayLog {
    private int time;
    private int num;
    private int target;

    public SprayLog(int time, int num, int target) {
      this.time = time;
      this.num = num;
      this.target = target;
    }
  }

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int logs = scanner.nextInt();
      List<SprayLog> sprayLogs = new ArrayList<>();

      for (int i = 0; i < logs; i++) {
        sprayLogs.add(new SprayLog(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));
      }

      int appleScore = 0;
      int berryScore = 0;
      if (sprayLogs.get(0).num <= 4) appleScore += 100;
      else berryScore += 100;

      boolean combo;
      for (int i = 1; i < sprayLogs.size(); i++) {
        SprayLog log = sprayLogs.get(i);
        combo = isCombo(sprayLogs, i);

        if (log.num <= 4) appleScore += (100 + (combo ? 50 : 0));
        else berryScore += (100 + (combo ? 50 : 0));
      }

      System.out.println(appleScore + " " + berryScore);
    }
  }

  private static boolean isCombo(List<SprayLog> sprayLogs, int index) {
    SprayLog log = sprayLogs.get(index);

    for (int i = index - 1; i >= 0; i--) {
      SprayLog prevLog = sprayLogs.get(i);
      if (log.time - prevLog.time > 10) break;

      if (log.num == prevLog.num) return true;
    }

    return false;
  }
}

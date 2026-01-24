package dev.coma.boj.Bronze4;

import java.time.OffsetTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class P10882 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int testCase = Integer.parseInt(scanner.nextLine());
      String[] input = scanner.nextLine().split(" ");
      String[] time = input[0].split(":");
      int hour = Integer.parseInt(time[0]);
      int minute = Integer.parseInt(time[1]);

      OffsetTime offsetTime = OffsetTime.of(hour, minute, 0, 0, ZoneOffset.of(formatUtc(input[1])));

      for (int i = 0; i < testCase; i++) {
        String inputUtc = scanner.nextLine();

        OffsetTime newOffsetTime = offsetTime.withOffsetSameInstant(ZoneOffset.of(formatUtc(inputUtc)));
        System.out.println(newOffsetTime.format(DateTimeFormatter.ofPattern("HH:mm")));
      }
    }
  }

  private static String formatUtc(String utc) {
    String utcTime = utc.substring(3);
    StringBuilder stringBuilder = new StringBuilder();

    if (utcTime.contains(".5")) {
      String hour = String.format("%02d", Integer.parseInt(utcTime.substring(1, utcTime.length() - 2)));

      stringBuilder.append(utcTime, 0, 1).append(hour).append(":30");
      return stringBuilder.toString();
    } else {
      String hour = String.format("%02d", Integer.parseInt(utcTime.substring(1)));

      stringBuilder.append(utcTime, 0, 1).append(hour).append(":00");
      return stringBuilder.toString();
    }
  }
}

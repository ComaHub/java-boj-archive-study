package dev.coma.Bronze1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P31562 {
  private static final Scanner SC = new Scanner(System.in);

  public static void main(String[] args) {
    try (SC) {
      int songNum = SC.nextInt();
      int testCase = SC.nextInt();
      SC.nextLine();

      Map<String, String> songMap = createSongMap(songNum);

      for (int i = 0; i < testCase; i++) {
        String testSound = SC.nextLine().replaceAll(" ", "");

        System.out.println(songMap.getOrDefault(testSound, "!"));
      }
    }
  }

  private static Map<String, String> createSongMap(int songNum) {
    Map<String, String> map = new HashMap<>();
    for (int i = 0; i < songNum; i++) {
      String[] input = SC.nextLine().split(" ");
      String songName = input[1];
      String threeSound = input[2] + input[3] + input[4];

      if (map.get(threeSound) == null) {
        map.put(threeSound, songName);
      } else {
        map.put(threeSound, "?");
      }
    }

    return map;
  }

}

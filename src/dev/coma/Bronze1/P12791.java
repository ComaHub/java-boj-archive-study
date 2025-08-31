package dev.coma.Bronze1;

import java.util.HashMap;
import java.util.Scanner;

public class P12791 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			HashMap<Integer, String> hashMap = makeDatabase();
			StringBuffer stringBuffer;
			StringBuffer resultBuffer = new StringBuffer();

			int testCase = scanner.nextInt();
			for (int i = 0; i < testCase; i++) {
			  int startYear = scanner.nextInt();
			  int endYear = scanner.nextInt();
			  int count = 0;
			  stringBuffer = new StringBuffer();

			  for (int j = startYear; j <= endYear; j++) {
			    String[] yearValue;

			    if (hashMap.containsKey(j)) {
			      yearValue = hashMap.get(j).split(" ");

			      for (int k = 0; k < yearValue.length; k++) {
			        stringBuffer.append(j + " " + yearValue[k] + "\n");
			        count++;
			      }
			    }
			  }

			  String result = stringBuffer.toString();
			  resultBuffer.append(count + "\n" + result);
			}

			String finalResult = resultBuffer.toString();
			System.out.println(finalResult);
		}
  }

  private static HashMap<Integer, String> makeDatabase() {
    HashMap<Integer, String> hashMap = new HashMap<>();

    hashMap.put(1967, "DavidBowie");
    hashMap.put(1969, "SpaceOddity");
    hashMap.put(1970, "TheManWhoSoldTheWorld");
    hashMap.put(1971, "HunkyDory");
    hashMap.put(1972, "TheRiseAndFallOfZiggyStardustAndTheSpidersFromMars");
    hashMap.put(1973, "AladdinSane PinUps");
    hashMap.put(1974, "DiamondDogs");
    hashMap.put(1975, "YoungAmericans");
    hashMap.put(1976, "StationToStation");
    hashMap.put(1977, "Low Heroes");
    hashMap.put(1979, "Lodger");
    hashMap.put(1980, "ScaryMonstersAndSuperCreeps");
    hashMap.put(1983, "LetsDance");
    hashMap.put(1984, "Tonight");
    hashMap.put(1987, "NeverLetMeDown");
    hashMap.put(1993, "BlackTieWhiteNoise");
    hashMap.put(1995, "1.Outside");
    hashMap.put(1997, "Earthling");
    hashMap.put(1999, "Hours");
    hashMap.put(2002, "Heathen");
    hashMap.put(2003, "Reality");
    hashMap.put(2013, "TheNextDay");
    hashMap.put(2016, "BlackStar");

    return hashMap;
  }
}

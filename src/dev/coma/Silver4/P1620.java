package dev.coma.Silver4;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class P1620 {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
    Map<Integer, String> intMap = new HashMap<>();
    Map<String, Integer> strMap = new HashMap<>();

    String[] setting = bufferedReader.readLine().split(" ");
    int pokemons = Integer.parseInt(setting[0]);
    int problems = Integer.parseInt(setting[1]);

    int counter = 1;
    for (int i = 0; i < pokemons; i++) {
      String poke = bufferedReader.readLine();
      intMap.put(counter, poke);
      strMap.put(poke, counter);
      counter++;
    }

    for (int i = 0; i < problems; i++) {
      String problem = bufferedReader.readLine();

      try {
        int probInt = Integer.parseInt(problem);
        bufferedWriter.write(intMap.get(probInt) + "\n");
      } catch (NumberFormatException e) {
        bufferedWriter.write(strMap.get(problem) + "\n");
      }
    }

    bufferedWriter.flush();

    bufferedReader.close();
    bufferedWriter.close();
  }
}

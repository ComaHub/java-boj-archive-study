package dev.coma.boj.Silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.StringTokenizer;

class Cabbage {
  private int x;
  private int y;

  Cabbage(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof Cabbage)) return false;

    Cabbage cabbage = (Cabbage) o;
    return x == cabbage.x && y == cabbage.y;
  }

  @Override
  public int hashCode() {
    return Objects.hash(x, y);
  }
}

public class P1012 {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer stringTokenizer;
    List<Cabbage> list = new ArrayList<>();

    int testCase = Integer.parseInt(bufferedReader.readLine());
    for (int i = 0; i < testCase; i++) {
      int num = Integer.parseInt(bufferedReader.readLine().split(" ")[2]);
      for (int j = 0; j < num; j++) {
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        list.add(new Cabbage(Integer.parseInt(stringTokenizer.nextToken()), Integer.parseInt(stringTokenizer.nextToken())));
      }

      int count = 0;
      while (!list.isEmpty()) {
        findCabbage(list, list.get(0));
        count++;
      }

      System.out.println(count);
    }
    
    bufferedReader.close();
  }

  static void findCabbage(List<Cabbage> list, Cabbage cabbage) {
    if (!list.contains(cabbage)) return;

    list.remove(cabbage);

    findCabbage(list, new Cabbage(cabbage.getX() + 1, cabbage.getY()));
    findCabbage(list, new Cabbage(cabbage.getX() - 1, cabbage.getY()));
    findCabbage(list, new Cabbage(cabbage.getX() , cabbage.getY() + 1));
    findCabbage(list, new Cabbage(cabbage.getX() , cabbage.getY() - 1));
  }
}

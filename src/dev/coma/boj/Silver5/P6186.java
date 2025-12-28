package dev.coma.boj.Silver5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P6186 {

  private static class Grass {
    private final boolean grass;
    private boolean visited;

    Grass(boolean grass) {
      this.grass = grass;
      this.visited = false;
    }

    public boolean isGrass() {
      return grass;
    }

    public boolean isVisited() {
      return visited;
    }

    public void visit() {
      this.visited = true;
    }
  }

  public static void main(String[] args) {
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
      String[] inputSet = br.readLine().split(" ");
      int row = Integer.parseInt(inputSet[0]);
      int col = Integer.parseInt(inputSet[1]);

      Grass[][] field = new Grass[row][col];
      for (int i = 0; i < row; i++) {
        String[] inputLine = br.readLine().split("");

        for (int j = 0; j < inputLine.length; j++) {
          if ("#".equals(inputLine[j])) {
            field[i][j] = new Grass(true);
          } else {
            field[i][j] = new Grass(false);
          }
        }
      }

      int grassCount = 0;
      for (int i = 0; i < row; i++) {
        for (int j = 0; j < col; j++) {
          Grass grass = field[i][j];
          if (grass.isGrass() && !grass.isVisited()) {
            countGrass(field, i, j);
            grassCount++;
          }
        }
      }

      System.out.println(grassCount);
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  private static void countGrass(Grass[][] field, int pointX, int pointY) {
    Grass grass = field[pointX][pointY];
    if (!grass.isGrass() || grass.isVisited()) return;

    grass.visit();

    if (pointX != 0) countGrass(field, pointX - 1, pointY);
    if (pointY != 0) countGrass(field, pointX, pointY - 1);
    if (pointX != field.length - 1) countGrass(field, pointX + 1, pointY);
    if (pointY != field[0].length - 1) countGrass(field, pointX, pointY + 1);
  }
}

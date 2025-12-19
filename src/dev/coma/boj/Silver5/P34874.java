package dev.coma.boj.Silver5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P34874 {

  private static class Point {
    private int maxPoint;
    private List<Integer> pointList;

    Point(int maxPoint, List<Integer> pointList) {
      this.maxPoint = maxPoint;
      this.pointList = pointList;
    }

    public int getMaxPoint() {
      return maxPoint;
    }

    public List<Integer> getPointList() {
      return pointList;
    }
  }

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int peopleCount = scanner.nextInt();
      int storeCount = scanner.nextInt();

      List<Point> peopleList = new ArrayList<>();
      for (int i = 0; i < peopleCount; i++) {
        List<Integer> pointList = new ArrayList<>();
        int maxPoint = 0;

        for (int j = 0; j < storeCount; j++) {
          int input = scanner.nextInt();
          if (maxPoint < input) maxPoint = input;

          pointList.add(input);
        }

        Point point = new Point(maxPoint, pointList);
        peopleList.add(point);
      }

      for (int i = 0; i < storeCount; i++) {
        int changeCount = 0;

        for (Point point : peopleList) {
          if (point.getMaxPoint() != point.getPointList().get(i)) changeCount++;
        }

        System.out.print(changeCount + " ");
      }
    }
  }
}

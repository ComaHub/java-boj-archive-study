package dev.coma.boj.Bronze5;

import java.util.Scanner;

public class P24736 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int[] homePoint = setScore(scanner);
    int[] visitPoint = setScore(scanner);
    int[] scorePoint = {6, 3, 2, 1, 2};

    int homeSum = sum(homePoint, scorePoint);
    int visitSum = sum(visitPoint, scorePoint);

    System.out.println(homeSum + " " + visitSum);
  }

  public static int[] setScore(Scanner scanner) {
    int[] score = new int[5];
    for (int i = 0; i < score.length; i++) {
      score[i] = scanner.nextInt();
    }

    return score;
  }

  public static int sum(int[] score, int[] scorePoint) {
    int sum = 0;
    for (int i = 0; i < score.length; i++) {
      sum += score[i] * scorePoint[i];
    }

    return sum;
  }
}

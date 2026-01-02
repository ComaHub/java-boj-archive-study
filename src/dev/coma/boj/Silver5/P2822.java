package dev.coma.boj.Silver5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class P2822 {
  private static class Quiz {
    private int num;
    private int point;

    public Quiz(int num, int point) {
      this.num = num;
      this.point = point;
    }
  }

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      List<Quiz> quizList = new ArrayList<>();

      for (int i = 1; i <= 8; i++) {
        quizList.add(new Quiz(i, scanner.nextInt()));
      }

      quizList.sort(new Comparator<Quiz>() {
        @Override
        public int compare(Quiz o1, Quiz o2) {
          return Integer.compare(o2.point, o1.point);
        }
      });

      int sum = 0;
      List<Integer> topFiveQuizNum = new ArrayList<>();
      for (int i = 0; i < 5; i++) {
        Quiz quiz = quizList.get(i);

        sum += quiz.point;
        topFiveQuizNum.add(quiz.num);
      }

      topFiveQuizNum.sort(Comparator.naturalOrder());

      System.out.println(sum);
      for (Integer i : topFiveQuizNum) {
        System.out.print(i + " ");
      }
    }
  }
}

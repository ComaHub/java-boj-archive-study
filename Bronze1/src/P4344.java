import java.util.Scanner;

public class P4344 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int testCase = scanner.nextInt();
    for (int i = 0; i < testCase; i++) {
      int[] grades = new int[scanner.nextInt()];
      int sum = 0;
      for (int j = 0; j < grades.length; j++) {
        grades[j] = scanner.nextInt();
        sum += grades[j];
      }

      double avg = (double) sum / grades.length;
      int goodGradePeople = 0;
      for (int grade : grades) {
        if (grade > avg) {
          goodGradePeople++;
        }
      }

      System.out.printf("%.3f%%\n", ((double) goodGradePeople / grades.length * 100));
    }
  }
}

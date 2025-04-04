import java.util.Scanner;

public class P8958 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int testCase = scanner.nextInt();
    scanner.nextLine();
    for (int i = 0; i < testCase; i++) {
      String[] quizResult = scanner.nextLine().split("");
      int count = 0;
      int sum = 0;

      for (int j = 0; j < quizResult.length; j++) {
        if (quizResult[j].equals("O")) {
          count++;
          sum += count;
        } else {
          count = 0;
        }
      }

      System.out.println(sum);
    }
  }
}

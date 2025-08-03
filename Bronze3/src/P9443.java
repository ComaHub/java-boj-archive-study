import java.util.Arrays;
import java.util.Scanner;

public class P9443 {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner scanner = new Scanner(System.in);

    int probNum = scanner.nextInt();
    scanner.nextLine();
    String[] problems = new String[probNum];
    for (int i = 0; i < problems.length; i++) {
      problems[i] = scanner.nextLine();
    }

    Arrays.sort(problems);

    char startChar = 'A';
    int count = 0;
    for (int i = 0; i < problems.length; i++) {
      char probFirstChar = problems[i].charAt(0);

      if (probFirstChar == startChar) {
        count++;
        startChar++;
      }
    }

    System.out.println(count);
  }
}

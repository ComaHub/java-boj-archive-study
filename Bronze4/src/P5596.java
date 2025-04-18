import java.util.Scanner;

public class P5596 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int minkookGrade = 0;
    for (int i = 0; i < 4; i++) {
      minkookGrade += scanner.nextInt();
    }

    int mansaeGrade = 0;
    for (int i = 0; i < 4; i++) {
      mansaeGrade += scanner.nextInt();
    }

    System.out.println(Math.max(minkookGrade, mansaeGrade));
  }
}

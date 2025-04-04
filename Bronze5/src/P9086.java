import java.util.Scanner;

public class P9086 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int testCase = scanner.nextInt();
    scanner.nextLine(); // \n 버리기

    for (int i = 0; i < testCase; i++) {
      String line = scanner.nextLine();
      System.out.println(String.valueOf(line.charAt(0)) + (line.charAt(line.length() - 1)));
    }
  }
}

import java.util.Scanner;

public class P2720 {
  private static final int QUARTER = 25;
  private static final int DIME = 10;
  private static final int NICKEL = 5;


  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner scanner = new Scanner(System.in);
    StringBuilder stringBuilder;

    int testCase = scanner.nextInt();
    for (int i = 0; i < testCase; i++) {
      int inputRemainCent = scanner.nextInt();
      stringBuilder = new StringBuilder();

      stringBuilder.append(inputRemainCent / QUARTER).append(" ");
      inputRemainCent %= QUARTER;

      stringBuilder.append(inputRemainCent / DIME).append(" ");
      inputRemainCent %= DIME;

      stringBuilder.append(inputRemainCent / NICKEL).append(" ");
      inputRemainCent %= NICKEL;

      String result = stringBuilder.append(inputRemainCent).toString();
      System.out.println(result);
    }
  }
}

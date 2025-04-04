import java.util.Scanner;

public class P2231 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int number = scanner.nextInt();
    int startNum = number - (String.valueOf(number).length() * 9);
    if (startNum < 0) startNum = 0;

    boolean isExist = false;
    for (int i = startNum; i <= number; i++) {
      int calNum = cal(i);
      if (calNum == number) {
        isExist = true;
        System.out.println(i);
        break;
      }
    }

    if (!isExist) System.out.println(0);
  }

  public static int cal(int num) {
    String[] numString = String.valueOf(num).split("");
    for (String s : numString) {
      num += Integer.parseInt(s);
    }

    return num;
  }
}

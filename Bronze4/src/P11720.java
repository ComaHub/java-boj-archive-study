import java.util.Scanner;

public class P11720 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();
    String[] numbers = new String[n];
    scanner.nextLine(); // \n 처리

    String number = scanner.nextLine();
    for (int i = 0; i < number.length(); i++) {
      numbers[i] = String.valueOf(number.charAt(i));
    }

    int result = 0;
    for (String s : numbers) {
      result += Integer.parseInt(s);
    }

    System.out.println(result);
  }
}

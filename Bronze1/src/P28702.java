import java.util.Scanner;

public class P28702 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String[] words = new String[3];
    int num = 0;
    for (int i = 0; i < words.length; i++) {
      words[i] = scanner.nextLine();
      if (!words[i].equals("FizzBuzz") && !words[i].equals("Fizz") && !words[i].equals("Buzz")) {
        num = Integer.parseInt(words[i]) + (3 - i);
      }
    }

    if (num % 3 == 0 && num % 5 == 0) {
      System.out.println("FizzBuzz");
    } else if (num % 3 == 0) {
      System.out.println("Fizz");
    } else if (num % 5 == 0) {
      System.out.println("Buzz");
    } else {
      System.out.println(num);
    }
  }
}

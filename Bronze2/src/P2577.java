import java.util.Scanner;

public class P2577 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String abc = String.valueOf(scanner.nextInt() * scanner.nextInt() * scanner.nextInt());
    String[] abcArray = abc.split("");
    int[] result = new int[10];

    for (String i : abcArray) {
      for (int j = 0; j < 10; j++) {
        if (i.equals(j + "")) {
          result[j]++;
        }
      }
    }

    for (int i : result) {
      System.out.println(i);
    }

  }
}

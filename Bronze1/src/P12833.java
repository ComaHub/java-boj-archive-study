import java.util.Scanner;

public class P12833 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int numA = scanner.nextInt();
      int numB = scanner.nextInt();
      int numC = scanner.nextInt();

      if (numC % 2 == 0) {
        System.out.println(numA);
        return;
      }

      String binaryA = new StringBuilder(Integer.toBinaryString(numA)).reverse().toString();
      String binaryB = new StringBuilder(Integer.toBinaryString(numB)).reverse().toString();

      StringBuilder result = new StringBuilder();
      for (int i = 0; i < (int) Math.max(binaryA.length(), binaryB.length()); i++) {
        if (i >= binaryA.length()) {
          result.append(binaryB.charAt(i));
          continue;
        }

        if (i >= binaryB.length()) {
          result.append(binaryA.charAt(i));
          continue;
        }

        char a = binaryA.charAt(i);
        char b = binaryB.charAt(i);
        if (a != b) result.append(1);
        else result.append(0);
      }

      int resultNum = Integer.valueOf(result.reverse().toString(), 2);
      System.out.println(resultNum);
    }
  }
}
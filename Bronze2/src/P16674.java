import java.util.*;

public class P16674 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String num = scanner.nextLine();
    if (!isRelate(num)) System.out.println(0);
    else if (!isClose(num)) System.out.println(1);
    else if (!isBind(num)) System.out.println(2);
    else System.out.println(8);
  }

  static boolean isBind(String num) {
    int num2 = 0, num0 = 0, num1 = 0, num8 = 0;

    for (int i = 0; i < num.length(); i++) {
      char c = num.charAt(i);

      switch (c) {
        case '2' -> num2++;
        case '0' -> num0++;
        case '1' -> num1++;
        case '8' -> num8++;
      }
    }

    return num2 == num0 && num0 == num1 && num1 == num8;
  }

  static boolean isClose(String num) {
    String[] words = num.split("");
    Arrays.sort(words);

    StringBuilder stringBuilder = new StringBuilder();
    for (int i = 0; i < words.length; i++) {
      stringBuilder.append(words[i]);
    }

    String str = stringBuilder.toString();
    return str.matches("0+1+2+8+");
  }

  static boolean isRelate(String num) {
    return num.matches("(2|0|1|8)+");
  }
}

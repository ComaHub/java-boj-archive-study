import java.util.Scanner;

public class P32154 {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner scanner = new Scanner(System.in);

    int num = scanner.nextInt();

    if (num == 1) {
      System.out.println("11");
    } else if (num <= 4) {
      System.out.println("9");
    } else {
      System.out.println("8");
    }

    if (num == 1) {
      System.out.println("A B C D E F G H J L M");
    } else if (num <= 3) {
      System.out.println("A C E F G H I L M");
    } else if (num <= 4) {
      System.out.println("A B C E F G H L M");
    } else if (num <= 9) {
      System.out.println("A C E F G H L M");
    } else {
      System.out.println("A B C F G H L M");
    }
  }
}

import java.util.Scanner;

public class P15963 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      String[] input = scanner.nextLine().split(" ");

      System.out.println(input[0].equals(input[1]) ? 1 : 0);
    }
  }
}

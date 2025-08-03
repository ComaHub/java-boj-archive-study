import java.util.Scanner;

public class P16673 {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner scanner = new Scanner(System.in);

    int year = scanner.nextInt();
    int pointOfLoveKorea = scanner.nextInt();
    int pointOfAddictBuying = scanner.nextInt();

    int result = 0;
    for (int i = 1; i <= year; i++) {
      result += ((pointOfLoveKorea * i) + (pointOfAddictBuying * i * i));
    }

    System.out.println(result);
  }
}

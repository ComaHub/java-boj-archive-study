import java.util.Scanner;

public class P30802 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int people = scanner.nextInt();
    int[] size = new int[6];
    for (int i = 0; i < 6; i++) {
      size[i] = scanner.nextInt();
    }

    int shirtBox = scanner.nextInt();
    int penBox = scanner.nextInt();

    int shirtDemand = 0;
    for (int i : size) {
      shirtDemand += (i % shirtBox == 0) ? (i / shirtBox) : (i / shirtBox) + 1;
    }
    System.out.println(shirtDemand);
    System.out.println((people / penBox) + " " + (people % penBox));
  }
}
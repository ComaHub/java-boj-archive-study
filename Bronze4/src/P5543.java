import java.util.Scanner;

public class P5543 {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner scanner = new Scanner(System.in);

    int burgerMin = 2001;
    for (int i = 0; i < 3; i++) {
      int price = scanner.nextInt();
      if (price < burgerMin) burgerMin = price;
    }

    int drinkMin = 2001;
    for (int i = 0; i < 2; i++) {
      int price = scanner.nextInt();
      if (price < drinkMin) drinkMin = price;
    }

    System.out.println(burgerMin + drinkMin - 50);
  }
}

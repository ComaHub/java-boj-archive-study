import java.util.Scanner;

public class P28453 {
  public static int divideMyLevel(int level) {
    if (level >= 300) return 1;
    else if (level >= 275) return 2;
    else if (level >= 250) return 3;
    else return 4;
  }

  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner scanner = new Scanner(System.in);

    int[] levels = new int[scanner.nextInt()];
    for (int i = 0; i < levels.length; i++) {
      levels[i] = divideMyLevel(scanner.nextInt());
    }

    for (int level : levels) {
      System.out.print(level + " ");
    }
  }
}

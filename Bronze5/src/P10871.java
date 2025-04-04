import java.util.Scanner;

public class P10871 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();
    int x = scanner.nextInt();

    int[] arrays = new int[n];
    for (int i = 0; i < arrays.length; i++) {
      arrays[i] = scanner.nextInt();
    }

    for (int i : arrays) {
      if (i < x) {
        System.out.print(i + " ");
      }
    }
  }
}

import java.util.Scanner;

public class P17256 {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner scanner = new Scanner(System.in);

    int[] cake_A = {scanner.nextInt(), scanner.nextInt(), scanner.nextInt()};
    int[] cake_C = {scanner.nextInt(), scanner.nextInt(), scanner.nextInt()};

    int[] cake_B = {cake_C[0] - cake_A[2], cake_C[1] / cake_A[1], cake_C[2] - cake_A[0]};
    for (int i : cake_B) {
      System.out.print(i + " ");
    }
  }
}

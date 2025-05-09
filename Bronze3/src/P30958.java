import java.util.Scanner;

public class P30958 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int logoLength = scanner.nextInt();
    scanner.nextLine();
    String[] logoSplit = scanner.nextLine().split("");

    int[] alphabet = new int[26];
    for (int i = 0; i < logoSplit.length; i++) {
      if (!logoSplit[i].equals(",") && !logoSplit[i].equals(".") && !logoSplit[i].equals(" ")) {
        int idx = logoSplit[i].charAt(0) - 97;
        alphabet[idx]++;
      }
    }

    int max = -1;
    for (int i : alphabet) {
      if (i > max) max = i;
    }

    System.out.println(max);
  }
}

import java.util.Arrays;
import java.util.Scanner;

public class P25178 {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner scanner = new Scanner(System.in);

    scanner.nextLine();
    String[] word = scanner.nextLine().split("");
    String[] newWord = scanner.nextLine().split("");

    if (isSideSame(word, newWord) && isMidSame(word, newWord)) System.out.println("YES");
    else System.out.println("NO");
  }

  static boolean isSideSame(String[] arr1, String[] arr2) {
    return (arr1[0].equals(arr2[0]) && arr1[arr1.length - 1].equals(arr2[arr2.length - 1]));
  }

  static boolean isMidSame(String[] arr1, String[] arr2) {
    StringBuilder stringBuilder1 = new StringBuilder();
    StringBuilder stringBuilder2 = new StringBuilder();

    for (int i = 0; i < arr1.length; i++) {
      if (!"aeiou".contains(arr1[i])) stringBuilder1.append(arr1[i]);
    }

    for (int i = 0; i < arr2.length; i++) {
      if (!"aeiou".contains(arr2[i])) stringBuilder2.append(arr2[i]);
    }

    String result1 = stringBuilder1.toString();
    String result2 = stringBuilder2.toString();

    Arrays.sort(arr1);
    Arrays.sort(arr2);
    if (!String.join("", arr1).equals(String.join("", arr2))) return false;

    return result1.equals(result2);
  }
}

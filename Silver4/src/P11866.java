import java.util.Scanner;

public class P11866 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();
    int k = scanner.nextInt();
    int[] people = new int[n];
    int[] result = new int[n];
    int count = 1;
    int peopleCount = 0;
    int resultCount = 0;

    while (resultCount < n) {
      if (people[peopleCount] != -1) {
        if (count == k) {
          people[peopleCount] = -1;
          result[resultCount] = peopleCount + 1;
          resultCount++;
          peopleCount++;
          if (peopleCount == n) {
            peopleCount = 0;
          }
          count = 1;
        } else {
          peopleCount++;
          if (peopleCount == n) {
            peopleCount = 0;
          }
          count++;
        }
      } else {
        peopleCount++;
        if (peopleCount == n) {
          peopleCount = 0;
        }
      }
    }

    System.out.print("<");
    for (int i = 0; i < result.length; i++) {
      System.out.print(result[i]);
      if (i < result.length - 1) {
        System.out.print(", ");
      }
    }
    System.out.println(">");
  }
}

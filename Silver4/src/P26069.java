import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class P26069 {
  private static final Set<String> danceSet = new HashSet<>();
  private static final String FIRST_DANCER = "ChongChong";

  public static void main(String[] args) {
    StringTokenizer stringTokenizer;
    danceSet.add(FIRST_DANCER);

    try (Scanner scanner = new Scanner(System.in)) {
      int testCase = scanner.nextInt();
      scanner.nextLine();

      for (int i = 0; i < testCase; i++) {
        stringTokenizer = new StringTokenizer(scanner.nextLine());
        meetPeople(stringTokenizer.nextToken(), stringTokenizer.nextToken());
      }
    }

    System.out.println(danceSet.size());
  }

  private static void meetPeople(String person1, String person2) {
    if (danceSet.contains(person1) || danceSet.contains(person2)) {
      danceSet.add(person1);
      danceSet.add(person2);
    }
  }
}

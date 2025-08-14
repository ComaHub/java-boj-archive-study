import java.util.Scanner;

public class P20492 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int reward = scanner.nextInt();

      int firstReward = (int) (reward * 0.78);
      int secondReward = reward - ((int) (reward * 0.2 * 0.22));

      System.out.println(firstReward + " " + secondReward);
    }
  }
}

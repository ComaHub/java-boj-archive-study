import java.util.*;

public class P14713 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    List<Queue<String>> list = new ArrayList<>();

    int bird = scanner.nextInt();
    scanner.nextLine();
    for (int i = 0; i < bird; i++) {
      list.add(new ArrayDeque<>());
      String[] words = scanner.nextLine().split(" ");

      for (int j = 0; j < words.length; j++) {
        list.get(i).offer(words[j]);
      }
    }

    String[] mySentence = scanner.nextLine().split(" ");
    Set<String> set = new HashSet<>(Arrays.asList(mySentence));
    if (mySentence.length != set.size()) {
      System.out.println("Impossible");
      return;
    }

    if (isCorrect(list, mySentence)) System.out.println("Possible");
    else System.out.println("Impossible");
  }

  static boolean isCorrect(List<Queue<String>> list, String[] mySentence) {
    Master:
    for (int i = 0; i < mySentence.length; i++) {
      String word = mySentence[i];

      for (int j = 0; j < list.size(); j++) {
        if (word.equals(list.get(j).peek())) {
          list.get(j).poll();
          continue Master;
        }
      }

      return false;
    }

    for (Queue<String> queue : list) {
      if (!queue.isEmpty()) return false;
    }

    return true;
  }
}

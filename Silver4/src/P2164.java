import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class P2164 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Deque<Integer> queue = new ArrayDeque<>();

    int num = scanner.nextInt();
    for (int i = 1; i <= num; i++) {
      queue.offer(i);
    }

    while (queue.size() > 1) {
      queue.poll();
      queue.offer(queue.poll());
    }

    System.out.println(queue.poll());
  }
}

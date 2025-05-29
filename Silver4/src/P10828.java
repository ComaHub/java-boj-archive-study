import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.NoSuchElementException;

public class P10828 {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    Deque<Integer> stack = new ArrayDeque<>();

    int inputNumCommand = Integer.parseInt(bufferedReader.readLine());
    for (int i = 0; i < inputNumCommand; i++) {
      String[] command = bufferedReader.readLine().split(" ");

      switch (command[0]) {
        case "push" -> stack.push(Integer.valueOf(command[1]));

        case "pop" -> {
          try {
            System.out.println(stack.pop());
          } catch (NoSuchElementException e) {
            System.out.println(-1);
          }
        }

        case "size" -> System.out.println(stack.size());

        case "empty" -> {
          if (stack.isEmpty()) System.out.println(1);
          else System.out.println(0);
        }

        case "top" -> System.out.println(stack.peek() == null ? -1 : stack.peek());

        default -> {}
      }
    }
  }
}

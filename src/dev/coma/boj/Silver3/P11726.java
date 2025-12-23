package dev.coma.boj.Silver3;

import java.util.Scanner;

public class P11726 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int num = scanner.nextInt();
      int[] memory = new int[num + 1];

      if (num == 1) {
        System.out.println(1);
        return;
      }

      memory[0] = 0;
      memory[1] = 1;
      memory[2] = 2;
      for (int i = 3; i <= num; i++) {
        memory[i] = (memory[i - 1] + (memory[i - 2] * 2) - memory[i - 2]) % 10007;
      }

      System.out.println(memory[num]);
    }
  }
}

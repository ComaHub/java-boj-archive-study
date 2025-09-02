package dev.coma.boj.Gold5;

import java.util.Scanner;

public class P1013 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			int testCase = scanner.nextInt();
			scanner.nextLine();
			for (int i = 0; i < testCase; i++) {
			  String tel = scanner.nextLine();

			  if (isMyPattern(tel)) System.out.println("YES");
			  else System.out.println("NO");
			}
		}
  }

  static boolean isMyPattern(String tel) {
    return tel.matches("(100+1+|01)+");
  }
}

package dev.coma.Bronze2;

import java.util.Scanner;

public class P2231 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			int number = scanner.nextInt();
			int startNum = number - (String.valueOf(number).length() * 9);
			if (startNum <= 0) startNum = 1;

			for (int i = startNum; i <= number; i++) {
			  if (cal(i) == number) {
			    System.out.println(i);
			    return;
			  }
			}
		}

    System.out.println(0);
  }

  public static int cal(int num) {
    String[] numString = String.valueOf(num).split("");
    for (String s : numString) {
      num += Integer.parseInt(s);
    }

    return num;
  }
}

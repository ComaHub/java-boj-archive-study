package dev.coma.Bronze3;

import java.util.Scanner;

public class P10214 {
  private static final int INNING = 9;

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			int testCase = scanner.nextInt();
			for (int i = 0; i < testCase; i++) {
			  int yonseiPoint = 0;
			  int koreaPoint = 0;

			  for (int j = 0; j < INNING; j++) {
			    yonseiPoint += scanner.nextInt();
			    koreaPoint += scanner.nextInt();
			  }

			  System.out.println(yonseiPoint == koreaPoint ? "Draw" : (yonseiPoint > koreaPoint ? "Yonsei" : "Korea"));
			}
		}
  }
}

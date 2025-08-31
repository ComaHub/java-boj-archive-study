package dev.coma.Bronze1;

import java.util.Scanner;

public class P10798 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			String[][] words = new String[5][15];
			for (int i = 0; i < 5; i++) {
			  String line = scanner.nextLine();

			  for (int j = 0; j < 15; j++) {
			    if (j >= line.length()) break;

			    words[i][j] = String.valueOf(line.charAt(j));
			  }
			}

			StringBuffer sb = new StringBuffer();
			for (int i = 0; i < 15; i++) {
			  for (int j = 0; j < 5; j++) {
			    if (words[j][i] != null) {
			      sb.append(words[j][i]);
			    }
			  }
			}

			String result = sb.toString();
			System.out.println(result);
		}
  }
}

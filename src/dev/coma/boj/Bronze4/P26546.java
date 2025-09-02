package dev.coma.boj.Bronze4;

import java.util.Scanner;

public class P26546 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			int testCase = scanner.nextInt();
			scanner.nextLine();
			for (int i = 0; i < testCase; i++) {
			  String[] line = scanner.nextLine().split(" ");
			  String removeWord = line[0].substring(Integer.parseInt(line[1]), Integer.parseInt(line[2]));

			  System.out.println(line[0].replace(removeWord, ""));
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
  }
}

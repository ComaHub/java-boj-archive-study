package dev.coma.boj.Bronze4;

import java.util.Scanner;

public class P10797 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			int pointer = scanner.nextInt();
			int[] carNum = new int[5];
			for (int i = 0; i < carNum.length; i++) {
			  carNum[i] = scanner.nextInt();
			}

			int count = 0;
			for (int i : carNum) {
			  if (i == pointer) count++;
			}

			System.out.println(count);
		}
  }
}

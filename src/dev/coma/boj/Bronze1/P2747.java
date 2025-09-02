package dev.coma.boj.Bronze1;

import java.util.ArrayList;
import java.util.Scanner;

public class P2747 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			ArrayList<Integer> arrayList = new ArrayList<>();
			arrayList.add(0);
			arrayList.add(1);

			int num = scanner.nextInt();
			for (int i = 2; i <= num; i++) {
			  arrayList.add(arrayList.get(i - 2) + arrayList.get(i - 1));
			}

			System.out.println(arrayList.get(num));
		}
  }
}

package dev.coma.boj.Bronze1;

import java.util.ArrayList;
import java.util.Scanner;

public class P2748 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			ArrayList<Long> arrayList = new ArrayList<>();
			arrayList.add((long) 0);
			arrayList.add((long) 1);

			int num = scanner.nextInt();
			for (int i = 2; i <= num; i++) {
			  arrayList.add(arrayList.get(i - 2) + arrayList.get(i - 1));
			}

			System.out.println(arrayList.get(num));
		}
  }
}

package dev.coma.boj.Bronze2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class P2750 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			ArrayList<Integer> arrayList = new ArrayList<>();

			int num = scanner.nextInt();
			for (int i = 0; i < num; i++) {
			  arrayList.add(scanner.nextInt());
			}

			arrayList.sort(Comparator.naturalOrder());
			for (int i = 0; i < arrayList.size(); i++) {
			  System.out.println(arrayList.get(i));
			}
		}
  }
}

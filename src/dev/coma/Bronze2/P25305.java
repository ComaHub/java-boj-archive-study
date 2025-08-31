package dev.coma.Bronze2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class P25305 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			ArrayList<Integer> arrayList = new ArrayList<>();

			int people = scanner.nextInt();
			int grantedPeople = scanner.nextInt();

			for (int i = 0; i < people; i++) {
			  arrayList.add(scanner.nextInt());
			}

			arrayList.sort(Comparator.reverseOrder());

			System.out.println(arrayList.get(grantedPeople - 1));
		}
  }
}

package dev.coma.boj.Bronze3;

import java.util.ArrayList;
import java.util.Scanner;

public class P13225 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			ArrayList<Integer> arrayList;

			int testCase = scanner.nextInt();
			for (int i = 0; i < testCase; i++) {
			  int number = scanner.nextInt();
			  arrayList = new ArrayList<>();

			  if (number == 1) {
			    arrayList.add(1);
			  } else {
			    arrayList.add(1);
			    arrayList.add(number);
			  }

			  for (int j = 2; (j * j) <= number; j++) {
			    if (number % j == 0) {
			      arrayList.add(j);
			      if (number / j != j) arrayList.add(number / j);
			    }
			  }

			  System.out.println(number + " " + arrayList.size());
			}
		}
  }
}

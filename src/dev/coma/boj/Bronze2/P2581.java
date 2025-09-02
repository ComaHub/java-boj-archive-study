package dev.coma.boj.Bronze2;

import java.util.ArrayList;
import java.util.Scanner;

public class P2581 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			ArrayList<Integer> arrayList = new ArrayList<>();

			int m = scanner.nextInt();
			int n = scanner.nextInt();

			for (int i = m; i <= n; i++) {
			  if (isPrime(i)) {
			    arrayList.add(i);
			  }
			}

			if (arrayList.isEmpty()) {
			  System.out.println(-1);
			  return;
			}

			int sum = 0;
			int min = 10001;
			for (int i = 0; i < arrayList.size(); i++) {
			  int thisNum = arrayList.get(i);
			  sum += thisNum;
			  if (min > thisNum) min = thisNum;
			}

			System.out.println(sum);
			System.out.println(min);
		}

  }

  public static boolean isPrime(int num) {
    boolean result = true;

    if (num == 0 || num == 1) {
      result = false;
    } else {
      for (int i = 2; (i * i) <= num; i++) {
        if (num % i == 0) {
          result = false;
          break;
        }
      }
    }

    return result;
  }
}

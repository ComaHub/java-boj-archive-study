package dev.coma.Bronze3;

import java.util.ArrayList;
import java.util.Scanner;

public class P3009 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			ArrayList<Integer> xList = new ArrayList<>();
			ArrayList<Integer> yList = new ArrayList<>();

			for (int i = 0; i < 3; i++) {
			  Integer x = scanner.nextInt();
			  Integer y = scanner.nextInt();

			  if (xList.contains(x)) {
			    xList.remove(x);
			  } else {
			    xList.add(x);
			  }

			  if (yList.contains(y)) {
			    yList.remove(y);
			  } else {
			    yList.add(y);
			  }
			}

			System.out.println(xList.get(0) + " " + yList.get(0));
		}
  }
}

package dev.coma.boj.Silver5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P17269 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			List<Integer> list = new ArrayList<>();
			List<Integer> backupList;

			int myNameLength = scanner.nextInt();
			int yourNameLength = scanner.nextInt();
			scanner.nextLine();

			String[] name = scanner.nextLine().split(" ");
			String myName = name[0];
			String yourName = name[1];

			int myPointer = 0;
			int yourPointer = 0;
			while (myPointer < myNameLength || yourPointer < yourNameLength) {
			  if (myPointer < myNameLength) list.add(changeEngToNum(myName.charAt(myPointer++)));
			  if (yourPointer < yourNameLength) list.add(changeEngToNum(yourName.charAt(yourPointer++)));
			}

			while (list.size() > 2) {
			  backupList = list;
			  list = new ArrayList<>();

			  for (int i = 0; i < backupList.size() - 1; i++) {
			    list.add((backupList.get(i) + backupList.get(i + 1)) % 10);
			  }
			}

			String result;
			if (list.get(0) % 10 != 0) {
			  result = "" + (list.get(0) % 10) + (list.get(1) % 10) + "%";
			} else {
			  result = (list.get(1) % 10) + "%";
			}

			System.out.println(result);
		}
  }

  public static int changeEngToNum(char c) {
    return switch (c) {
      case 'C', 'G', 'I', 'J', 'L', 'O', 'S', 'U', 'V', 'W', 'Z' -> 1;
      case 'B', 'D', 'N', 'P', 'Q', 'R', 'T', 'X', 'Y' -> 2;
      case 'A', 'F', 'H', 'K', 'M' -> 3;
      case 'E' -> 4;
      default -> 0;
    };
  }
}

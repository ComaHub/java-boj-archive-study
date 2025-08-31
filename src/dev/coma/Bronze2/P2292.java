package dev.coma.Bronze2;

import java.util.Scanner;

public class P2292 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			int roomNum = scanner.nextInt();
			int floor = 1;
			int roomCount = 1;
			int addPoint = 0;
			while (roomCount < roomNum) {
			  addPoint += 6;
			  roomCount += addPoint;
			  floor++;
			}

			System.out.println(floor);
		}
  }
}

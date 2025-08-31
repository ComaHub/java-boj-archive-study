package dev.coma.Silver3;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class P1966 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			List<Integer> list = new LinkedList<>();

			int testCase = scanner.nextInt();
			for (int i = 0; i < testCase; i++) {
			  int numOfDocs = scanner.nextInt();
			  int myDocIndex = scanner.nextInt();
			  int count = 0;
			  list.clear();

			  for (int j = 0; j < numOfDocs; j++) {
			    list.add(scanner.nextInt());
			  }

			  Master:
			  while (true){
			    int item = list.remove(0);

			    for (Integer num : list) {
			      if (num > item) {
			        list.add(item);

			        if (myDocIndex == 0) {
			          myDocIndex = list.size() - 1;
			        } else {
			          myDocIndex--;
			        }

			        continue Master;
			      }
			    }

			    count++;
			    myDocIndex--;
			    if (myDocIndex < 0) break;
			  }

			  System.out.println(count);
			}
		}
  }
}

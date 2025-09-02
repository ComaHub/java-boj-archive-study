package dev.coma.boj.Bronze1;

import java.util.Scanner;

public class P2816 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			int channel = scanner.nextInt();
			scanner.nextLine();

			int kbs1_index = 0;
			int kbs2_index = 0;
			for (int i = 0; i < channel; i++) {
			  String s = scanner.nextLine();

			  if ("KBS1".equals(s)) kbs1_index = i;
			  if ("KBS2".equals(s)) kbs2_index = i;
			}

			if (kbs1_index > kbs2_index) kbs2_index++;
			for (int i = 1; i <= kbs1_index; i++) {
			  System.out.print(1);
			}

			for (int i = 1; i <= kbs1_index; i++) {
			  System.out.print(4);
			}

			for (int i = 1; i <= kbs2_index; i++) {
			  System.out.print(1);
			}

			for (int i = 1; i < kbs2_index; i++) {
			  System.out.print(4);
			}
		}
  }
}

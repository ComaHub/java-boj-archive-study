package dev.coma.boj.Bronze2;

import java.util.Scanner;

public class P27891 {
  public static final String NLCS = "northlondo";
  public static final String BHA = "branksomeh";
  public static final String KIS = "koreainter";
  public static final String SJA = "stjohnsbur";

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			String encoded = scanner.nextLine();
			for (int i = 0; i < 26; i++) {
			  if (i != 0) {
			    String[] words = encoded.split("");

			    for (int j = 0; j < words.length; j++) {
			      char c = words[j].charAt(0);
			      c--;

			      if (c < 'a') c = 'z';
			      words[j] = String.valueOf(c);
			    }

			    encoded = String.join("", words);
			  }

			  if (NLCS.equals(encoded)) {
			    System.out.println("NLCS");
			    break;
			  }

			  if (BHA.equals(encoded)) {
			    System.out.println("BHA");
			    break;
			  }

			  if (KIS.equals(encoded)) {
			    System.out.println("KIS");
			    break;
			  }

			  if (SJA.equals(encoded)) {
			    System.out.println("SJA");
			    break;
			  }
			}
		}
  }
}

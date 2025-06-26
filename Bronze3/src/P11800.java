import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P11800 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int testCase = scanner.nextInt();
    scanner.nextLine();
    for (int i = 0; i < testCase; i++) {
      String[] inputNumbers = scanner.nextLine().split(" ");

      System.out.print("Case " + (i + 1) + ": ");
      if (inputNumbers[0].equals(inputNumbers[1])) sameNum(inputNumbers);
      else diffNum(inputNumbers);
    }
  }

  static void sameNum(String[] numbers) {
    String result = String.join("", numbers);
    switch (result) {
      case "11" -> System.out.println("Habb Yakk");
      case "22" -> System.out.println("Dobara");
      case "33" -> System.out.println("Dousa");
      case "44" -> System.out.println("Dorgy");
      case "55" -> System.out.println("Dabash");
      case "66" -> System.out.println("Dosh");
    }
  }

  static void diffNum(String[] numbers) {
    Map<String, String> nickMap = new HashMap<>();
    nickMap.put("1", "Yakk");
    nickMap.put("2", "Doh");
    nickMap.put("3", "Seh");
    nickMap.put("4", "Ghar");
    nickMap.put("5", "Bang");
    nickMap.put("6", "Sheesh");

    if (Integer.parseInt(numbers[0]) < Integer.parseInt(numbers[1])) {
      String temp = numbers[1];
      numbers[1] = numbers[0];
      numbers[0] = temp;
    }

    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = nickMap.get(numbers[i]);
    }

    if ("Sheesh".equals(numbers[0]) && "Bang".equals(numbers[1])) {
      System.out.println("Sheesh Beesh");
    } else {
      System.out.println(String.join(" ", numbers));
    }
  }
}

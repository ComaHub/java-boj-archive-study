import java.util.Scanner;

public class P30087 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int testCase = scanner.nextInt();
    scanner.nextLine(); // \n 버리기

    for (int i = 0; i < testCase; i++) {
      String seminar = scanner.nextLine();

      switch (seminar) {
        case "Algorithm":
          System.out.println("204");
          break;

        case "DataAnalysis":
          System.out.println("207");
          break;

        case "ArtificialIntelligence":
          System.out.println("302");
          break;

        case "CyberSecurity":
          System.out.println("B101");
          break;

        case "Network":
          System.out.println("303");
          break;

        case "Startup":
          System.out.println("501");
          break;

        case "TestStrategy":
          System.out.println("105");
          break;

        default:
          System.out.println("잘못 입력했습니다.");

      }
    }
  }
}

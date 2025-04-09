import java.util.Scanner;

public class P27889 {
  private static final String NLCS = "North London Collegiate School";
  private static final String BHA = "Branksome Hall Asia";
  private static final String KIS = "Korea International School";
  private static final String SJA = "St. Johnsbury Academy";

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String schoolName = scanner.nextLine();
    if (schoolName.equals("NLCS")) System.out.println(NLCS);
    else if (schoolName.equals("BHA")) System.out.println(BHA);
    else if (schoolName.equals("KIS")) System.out.println(KIS);
    else if (schoolName.equals("SJA")) System.out.println(SJA);
  }
}

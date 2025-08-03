import java.util.Scanner;

public class P25206 {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner scanner = new Scanner(System.in);

    double gradeSum = 0;
    double pointSum = 0;
    int classes = 20;
    for (int i = 0; i < classes; i++) {
      String[] info = scanner.nextLine().split(" ");
      double grade = Double.parseDouble(info[1]);
      String point = info[2];

      if ("P".equals(point)) continue;

      gradeSum += grade;
      pointSum += grade * switch (point) {
        case "A+" -> 4.5;
        case "A0" -> 4.0;
        case "B+" -> 3.5;
        case "B0" -> 3.0;
        case "C+" -> 2.5;
        case "C0" -> 2.0;
        case "D+" -> 1.5;
        case "D0" -> 1.0;
        default -> 0.0;
      };
    }

    System.out.println(pointSum / gradeSum);
  }
}

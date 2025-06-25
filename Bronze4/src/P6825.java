import java.util.Scanner;

public class P6825 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    double weight = scanner.nextDouble();
    double height = scanner.nextDouble();

    double bmi = weight / (height * height);

    if (bmi > 25.0) System.out.println("Overweight");
    else if (bmi >= 18.5) System.out.println("Normal weight");
    else System.out.println("Underweight");
  }
}

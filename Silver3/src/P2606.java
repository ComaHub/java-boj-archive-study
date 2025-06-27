import java.util.*;

class Computer {
  private int comNo;
  private List<Computer> relations = new ArrayList<>();

  public Computer(int comNo) {
    this.comNo = comNo;
  }

  public List<Computer> getRelations() {
    return relations;
  }
}

public class P2606 {
  private static final Set<Computer> VIRUS_COM = new HashSet<>();

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    Computer[] computers = new Computer[scanner.nextInt() + 1];
    int relates = scanner.nextInt();

    for (int i = 1; i < computers.length; i++) {
      computers[i] = new Computer(i);
    }

    for (int i = 1; i <= relates; i++) {
      Computer leftCom = computers[scanner.nextInt()];
      Computer rightCom = computers[scanner.nextInt()];

      leftCom.getRelations().add(rightCom);
      rightCom.getRelations().add(leftCom);
    }

    virus(computers[1]);
    System.out.println(VIRUS_COM.size() - 1);
  }

  static void virus(Computer computer) {
    if (VIRUS_COM.contains(computer)) return;

    VIRUS_COM.add(computer);

    List<Computer> list = computer.getRelations();
    for (Computer com : list) {
      virus(com);
    }
  }
}

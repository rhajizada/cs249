import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of Human troops: ");
        int HumanTroops = input.nextInt();
        System.out.println("Enter the number of Orc troops: ");
        int OrcTroops = input.nextInt();
        Army<Human> gondor = new Army("Gondor", new Human(), HumanTroops);
        Army<Orc> mordor = new Army("Mordor", new Orc(), OrcTroops);
        int battleCnt = 0;
        System.out.println(gondor.toString());
        System.out.println(mordor.toString());
        System.out.println(gondor.getSoldierCnt());
        System.out.println(mordor.getSoldierCnt());

        while (!gondor.isDefeated() && !mordor.isDefeated()) {
            System.out.println("BATTLE " + battleCnt);
            mordor.attacks(gondor);
            gondor.attacks(mordor);

            System.out.println(gondor.toString());
            System.out.println(mordor.toString());
            battleCnt++;
        }
        if (!gondor.isDefeated()) {
            System.out.println(gondor.getName() + " is victorious!");
        } else if (!mordor.isDefeated()) {
            System.out.println(mordor.getName() + " is victorious!");
        } else {
            System.out.println("Both sides lost!");
        }
    }

}

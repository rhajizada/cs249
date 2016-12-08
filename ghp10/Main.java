/*
    ghp10 test driver
    Written by Rufat Hajizada for cs249
    Labguage: java*/


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of Human troops: ");
        int HumanTroops = input.nextInt();
        System.out.println("Enter the number of Orc troops: ");
        int OrcTroops = input.nextInt();
        Army<Human> gondor = new Army("Gondor");
        Army<Orc> mordor = new Army("Mordor");
        for(int i = 0; i < HumanTroops; i++){
            gondor.addSoldier(new Human());
        }
        for(int i = 0; i < OrcTroops; i++){
            mordor.addSoldier(new Orc());
        }

        int battleCnt = 0;
        while (!gondor.isDefeated() && !mordor.isDefeated()) {
            System.out.println("BATTLE " + battleCnt);

            gondor.attacks(mordor);
            mordor.attacks(gondor);

            System.out.println(gondor.toString());
            System.out.println(mordor.toString());
            battleCnt++;
        }
        System.out.println("BATTLES FOUGHT: " + battleCnt);
        if (!gondor.isDefeated()) {
            System.out.println(gondor.getName() + " is victorious!");
        } else if (!mordor.isDefeated()) {
            System.out.println(mordor.getName() + " is victorious!");
        } else {
            System.out.println("Both sides lost!");
        }
    }

}

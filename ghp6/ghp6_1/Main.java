/*  ghp6 part 1 test driver
 Written by Rufat Hajizada for CS249
 Language: Java
*/
import java.util.*;
public class Main {
    private static Player  player = new Player(3, 3);
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {


        String name = " ";
        while(!name.equals("None")) {
            System.out.println("Enter item name, weight, and value: ");
            name = input.next();
            if(name.equals("None")){
                break;
            }
            else {
                double weight = input.nextInt();
                double value = input.nextInt();
                System.out.println("Is this a weapon? [Y/N]");
                char weaponStatus = input.next().toUpperCase().charAt(0);
                if (weaponStatus == 'Y') {
                    System.out.println("Enter weapon's damage: ");
                    int damage = input.nextInt();
                    player.addToInventory(name, weight, value, damage);
                } else {
                    player.addToInventory(name, weight, value);
                }
            }


        }
        player.printInventory();
    }


    }


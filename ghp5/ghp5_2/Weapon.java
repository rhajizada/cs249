/*  ghp5 part 1 Weapon Class
    Written by Rufat Hajizada for CS249
    Language: Java
*/
public class Weapon {
    private static String name; // name of the weapon
    private static int damage; // damage of the weapon
    Weapon(){
        // default constructor
    }
    Weapon(String name, int damage){
        // constructor sets the weapon name and damage
        this.name = name;
        this.damage = damage;
    }
    private String getName(){
        // returns the name of the weapon
        return this.name;
    }

    private int getDamage() {
        // returns damage of the weapon
        return this.damage;
    }

    public static void printWeapon(){
        // prints the weapon name if there is no weapon prints "NO WEAPON"
        if ( damage == 0 && name == null){
            System.out.println("NO WEAPON");
        }
        else {
            System.out.println(name);
        }
    }
}

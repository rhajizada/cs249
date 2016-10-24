/**
 * Created by hajizar on 10/20/2016.
 */
public class Weapon {
    private static String name;
    private static int damage;
    Weapon(){
    }
    Weapon(String name, int damage){
        this.name = name;
        this.damage = damage;
    }
    private String getName(){
        return this.name;
    }

    private int getDamage() {
        return this.damage;
    }

    public static void printWeapon(){
        if ( damage == 0 && name == null){
            System.out.println("NO WEAPON");
        }
        else {
            System.out.println(name);
        }
    }
}

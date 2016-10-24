/*  ghp5 part 2 test driver
 Written by Rufat Hajizada for CS249
 Language: Java
*/
public class ghp5_2 {

    public static void main(String[] args) {
        Player player = new Player(100, 100);
        player.getCurrentWeapon().printWeapon();
        Weapon sword = new Weapon("Common Sword", 50);
        player.setWeapon(sword);
        player.getCurrentWeapon().printWeapon();
        Weapon coolSword = new Weapon("Glamdring, the Foe-Hammer", 1500);
        player.setWeapon(coolSword);
        player.getCurrentWeapon().printWeapon();
    }
}

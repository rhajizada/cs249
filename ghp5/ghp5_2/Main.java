public class Main {

    public static void main(String[] args) {
        Player player = new Player(100, 100);
        player.getCurrentWeapon().printWeapon();
        Weapon sword = new Weapon("Common Sword", 50);
        player.getCurrentWeapon().printWeapon();
        Weapon coolSword = new Weapon("Glamdring, the Foe-Hammer", 1500);
        player.getCurrentWeapon().printWeapon();


    }
}

/*  ghp6 part 1 Weapon Class
 Written by Rufat Hajizada for CS249
 Language: Java
*/
public class Weapon extends Item {
    // Weapon class in a subclass of Item class
    public int damage;
    // deafult constructor
    Weapon(){
        super();
        this.damage = 0;
    }
    Weapon(String name, double weight, double value, int damage){
        // constructor that sets name wight value and damage
        super(name, weight, value);
        this.damage = damage;
    }
    protected void setDamage(int damage){
        // sets damage of the object to the input damage
        this.damage = damage;
    }
    protected int getDamage(){
        // returns the damge of the object
        return this.damage;
    }
    public String toString(){
       // overriden toString method returns the string contatining information aboutt the weapon
        return super.toString() + String.format("Damage: %d\n", this.damage);
    }

    public void printWeapon( ){
        // prints the weapon on the screen
        // prints the weapon name if there is no weapon prints "NO WEAPON"
        if ( damage == 0 && name == null){
            System.out.println("NO WEAPON");
        }
        else {
            System.out.println(name);
        }
    }
}

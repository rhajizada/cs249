/**
 * Created by hajizar on 10/28/2016.
 */
public class Weapon extends Item {
    public int damage;
    Weapon(){
        super();
        this.damage = 0;
    }
    Weapon(String name, double weight, double value, int damage){
        super(name, weight, value);
        this.damage = damage;
    }
    protected void setDamage(int damage){
        this.damage = damage;
    }
    protected int getDamage(){
        return this.damage;
    }
    public String toString(){
        return super.toString() + String.format("Damage: %d\n", this.damage);
    }

    public void printWeapon( ){
        // prints the weapon name if there is no weapon prints "NO WEAPON"
        if ( damage == 0 && name == null){
            System.out.println("NO WEAPON");
        }
        else {
            System.out.println(name);
        }
    }
}

/*  ghp5 part 2 Player Class
 Written by Rufat Hajizada for CS249
 Language: Java
*/
import java.awt.geom.Point2D;
import java.util.ArrayList;

public class Player {
    private double x; // X axis position
    private double y; // Y axis position
    private int health; // health points
    private Point2D.Double position = new Point2D.Double(); // position on map
    private Item currentWeapon = new Weapon(); // current weapon - instance of weapon class
    private Item currentItem = new Item();
    private ArrayList<Item> inventory = new ArrayList<>();
    Player(){
        // default constructor
        this.x = 0;
        this.y = 0;
        this.health = 100;
        Point2D.Double position = new Point2D.Double(this.x, this.y);
    }
    Player(double x, double y){
        // constructor that sets position and health
        this.x =x;
        this.y = y;
        this.health = 100;
        Point2D.Double position = new Point2D.Double(this.x, this.y);
    }
    protected void setPosition (int x, int y){
        // sets the position to x,y
        this.x = x;
        this.y = y;
    }

    protected void setHealth( int health){
        // sets the health to health
        this.health = health;
    }

    protected void setWeapon( Weapon weapon){
        // sets weapon to weapon
        this.currentWeapon = weapon;
    }

    protected void setItem(Item item){
        this.currentItem = item;
    }

    protected void setItem( String name, int weight, int value){
        // creates new instance of Weapon class
        this.currentItem = new Item(name, weight, value);
    }

    protected void setWeapon( String name, int weight, int value, int damage){
        // creates new instance of Weapon class
        this.currentWeapon = new Weapon(name, weight, value, damage);
    }

    protected int getHealth(){
        // returns the health level
        return this.health;
    }

    protected Point2D.Double getPosition(){
        //returns the position of the player
        return this.position;
    }

    protected Item getCurrentWeapon(){
        // returns the current weapon
        return this.currentWeapon;
    }

    protected Item getCurrentItem(){
        return this.currentItem;
    }

    protected void addToInventory(String name, double value, double weight){
            this.inventory.add(new Item(name, weight, value));
    }
    protected void addToInventory(String name, double weight, double value,int damage){
        this.inventory.add(new Weapon(name, weight, value, damage));
    }

    protected void printInventory(){
        for (Item item:this.inventory) {
            System.out.print(item.toString());
        }
    }

}
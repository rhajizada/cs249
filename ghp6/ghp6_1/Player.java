/*  ghp6 part 1 Player Class
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
    private Item currentItem = new Item(); //current Item - instance of item class
    private ArrayList<Item> inventory = new ArrayList<>(); // inventroy - array list that holds all the items
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
        // sets current weapon to weapon input
        this.currentWeapon = weapon;
    }

    protected void setItem(Item item){
        // sets cuurent item to item input
        this.currentItem = item;
    }

    protected void setItem( String name, double weight, double value){
        // creates new instance of item class and assigns it to current item
        this.currentItem = new Item(name, weight, value);
    }

    protected void setWeapon( String name, double weight, double value, int damage){
        // creates new instance of Weapon class and assigns it to current weapon
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
        // returnw current item
        return this.currentItem;
    }

    protected void addToInventory(String name, double value, double weight){
        // creates new instance of item class and adds it to the inventory
            this.inventory.add(new Item(name, weight, value));
    }
    protected void addToInventory(String name, double weight, double value,int damage){
        // creates new instance of weapon class and adds in to the inventory
        this.inventory.add(new Weapon(name, weight, value, damage));
    }

    protected void removeItem(int x){
        // takes integer input and removes item from the inventory
        this.inventory.remove(x);
    }

    protected void printInventory(){
        // prints the inventory to the screen
        for (Item item:this.inventory) {
            System.out.print(item.toString());
        }
    }

}

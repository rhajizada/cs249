/*  ghp5 part 2 Player Class
 Written by Rufat Hajizada for CS249
 Language: Java
*/
import java.awt.geom.Point2D;
public class Player {
    private double x; // X axis position
    private double y; // Y axis position
    private int health; // health points
    Point2D.Double position = new Point2D.Double(); // position on map
    private Weapon currentWeapon = new Weapon(); // current weapon - instance of weapon class
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
    public void setPosition (int x, int y){
        // sets the position to x,y
        this.x = x;
        this.y = y;
    }

    public void setHealth( int health){
        // sets the health to health
        this.health = health;
    }

    public void setWeapon( Weapon weapon){
        // sets weapon to weapon
        this.currentWeapon = weapon;
    }

    public void setWeapon( String name, int damage){
        // creates new instance of Weapon class
        this.currentWeapon = new Weapon(name, damage);
    }

    public int getHealth(){
        // returns the health level
        return this.health;
    }

    public Point2D.Double getPosition(){
        //returns the position of the player
        return this.position;
    }

    public Weapon getCurrentWeapon(){
        // returns the current weapon
        return this.currentWeapon;
    }
}

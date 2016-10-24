/**
 * Created by hajizar on 10/20/2016.
 */
import java.awt.geom.Point2D;
public class Player {
    private double x;
    private double y;
    private int health;
    Point2D.Double position = new Point2D.Double();
    private Weapon currentWeapon = new Weapon();
    Player(){
        this.x = 0;
        this.y = 0;
        this.health = 100;
        Point2D.Double position = new Point2D.Double(this.x, this.y);
    }
    Player(double x, double y){
        this.x =x;
        this.y = y;
        this.health = 100;
        Point2D.Double position = new Point2D.Double(this.x, this.y);
    }
    public void setPosition (int x, int y){
        this.x = x;
        this.y = y;
    }

    public void setHealth( int health){
        this.health = health;
    }

    public void setWeapon( Weapon weapon){
        this.currentWeapon = weapon;
    }

    public void setWeapon( String name, int damage){
        this.currentWeapon = new Weapon(name, damage);
    }

    public int getHealth(){
        return this.health;
    }

    public Point2D.Double getPosition(){
        return this.position;
    }

    public Weapon getCurrentWeapon(){
        return this.currentWeapon;
    }
}

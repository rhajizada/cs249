import java.util.Scanner;

/**
 * Created by rufathajizada on 11/9/16.
 */
public abstract class Monster implements Loadable, Drawable {
    protected int x = 0;
    protected int y = 0;
    protected int health = 100;
    protected Monster(){}
    protected Monster(int x, int y, int health){
        this.x = x;
        this.y = y;
        this.health = health;
    }

    protected int getX(){
        return this.x;
    }
    protected int getY(){
        return this.y;
    }
    protected int getHealth(){
        return this.health;
    }
    protected void setX(int x){
        this.x = x;
    }
    protected void setY(int y){
        this.y= y;
    }
    protected void setHealth(int health){
        this.health = health;
    }

    public void load(Scanner input) throws Exception{
        this.x = input.nextInt();
        this.y = input.nextInt();
        this.health = input.nextInt();
    }
}

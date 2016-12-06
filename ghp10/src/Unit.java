/**
 * Created by rufathajizada on 12/5/16.
 */
public abstract class Unit {
    int attack;
    int health;
    boolean alive;
    String name;
    Unit(){}
    Unit(String name, int attack, int health ){
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.alive = true;
    }

    public String getName(){return this.name;}
    public int getHealth(){return this.health;}
    public int getAttack(){ return this.attack;}
    public void setHeath(int health){ this.health = health;}
    public boolean isAlive(){ return alive;}
    public boolean kill(int health){
        if(health<= 0){
            alive = false;
        }
        else{
            alive=true;
        }
        return this.alive;
    }
    public String toString(){
        return name;
    }
    public void attack(Unit other){
        if(this.kill(this.getHealth()) && other.kill(other.getHealth())) {
           int currentAttack = 1 + (int) (Math.random() * this.attack);
            other.setHeath(getHealth() - currentAttack);
        }
        other.kill(other.getHealth());
    }
}

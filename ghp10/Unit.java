/*
    ghp10 abstract class Unit
    Written by Rufat Hajizada for cs249
    Language: Java
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

    public String toString(){
        return name;
    }
    public void attack(Unit other){
        if((this.getHealth()) > 0 && (other.getHealth() > 0)) {
           int currentAttack = (int) (Math.random() * this.attack);
            other.setHeath(other.getHealth() - currentAttack);
        }

    }
}

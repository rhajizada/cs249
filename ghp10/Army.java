import java.util.ArrayList;

/* 
    ghp10 generic class Army
    Written by Rufat Hajizada for cs249
    Language: Java
*/

public class Army<E extends Unit> {
    ArrayList<E> soldiers = new ArrayList<E>();
    String name;
    Army(String name){
        this.name = name;
    }


    public String getName(){ return this.name; }
    public void addSoldier(E soldier){
        soldiers.add(soldier);
    }
    public void removeSoldier(E soldier){
        soldiers.remove(soldier);
    }
    public void removeSoldier(int soldier){
        soldiers.remove(soldier);
    }
    public E getSoldier(int i){
        return soldiers.get(i);
    }
    public int getSoldierCnt(){
        return soldiers.size();
    }
    public boolean isDefeated(){
        if(getSoldierCnt() <= 0){
            return true;
        }
        else{
            return false;
        }
    }
    @Override
    public String toString(){
        String result = this.getName() + ": ";
        for(int i = 0; i < getSoldierCnt(); i++){
            result += soldiers.get(i).getHealth() + " ";
        }
        return result;
    }
    public <T extends Unit> void attacks(Army<T> other){
        ArrayList<E> deathToll = new ArrayList<E>();
        assert(!this.soldiers.isEmpty()&&!other.soldiers.isEmpty());
        for(int i = 0; i < this.getSoldierCnt(); i++ ) {
            int randomIndex = this.getRandom(other);
            if(other.getSoldierCnt() == 0){
                break;
            }

            E attacker = this.getSoldier(i);
            T attacked = other.getSoldier(randomIndex);
            attacker.attack(attacked);

            if(other.getSoldier(randomIndex).getHealth() <= 0){
                other.removeSoldier(randomIndex);
            }

            else if( other.getSoldier(randomIndex).getHealth() > 0){
                other.getSoldier(randomIndex).attack(this.getSoldier(i));
                if(this.getSoldier(i).getHealth() <= 0){
                    deathToll.add(this.getSoldier(i));
                }
            }
        }
        this.soldiers.removeAll(deathToll);
    }

    public <T extends Unit> int getRandom(Army<T> other){
        return (int) (Math.random() * ( other.getSoldierCnt()));
    }
}

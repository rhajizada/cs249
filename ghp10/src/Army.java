import java.util.ArrayList;


/**
 * Created by rufathajizada on 12/5/16.
 */
public class Army<E extends Unit> {
    ArrayList<E> soldiers = new ArrayList<E>();
    String name;
    Army(String name){
        this.name = name;
    }
    public void reSize(int size, E e){
        soldiers = new ArrayList<E>(size);
        int i = 0;
        while( i < size){
            soldiers.add(i, e);
            i++;
        }
    }

    public String getName(){ return this.name; }
    public void addSoldier(E soldier){
        soldiers.add(soldier);
    }
    public void removeSoldier(E soldier){
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
        int randomIndex;
        for(int i = 0; i < this.getSoldierCnt(); i++ ) {
            randomIndex = (int) (Math.random() * ( other.getSoldierCnt()));
            this.getSoldier(i).attack(other.getSoldier(randomIndex));
            if(other.getSoldier(randomIndex).getHealth() <= 0){
                other.removeSoldier(other.getSoldier(i));
            }
            else{
                other.getSoldier(randomIndex).attack(this.getSoldier(i));
                if(this.getSoldier(i).getHealth() <= 0){
                    deathToll.add(this.getSoldier(i));
                }
            }
        }
        this.soldiers.removeAll(deathToll);
    }
}

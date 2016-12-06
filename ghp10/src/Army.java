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
        for(int i = 0; i <= size; i++){
            soldiers.add(i, e);
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
        int i = 0;
        int randomIndex;
        while(other.isDefeated()) {
            randomIndex = (int) (Math.random() * other.getSoldierCnt()) + 1;
            this.getSoldier(i).attack(other.getSoldier(randomIndex));
            if(!other.getSoldier(randomIndex).kill(other.getSoldier(randomIndex).getHealth())){
                other.removeSoldier(other.getSoldier(i));
            }
            else{
                other.getSoldier(i).attack(this.getSoldier(i));
                if(!this.getSoldier(i).kill(this.getSoldier(i).getHealth())){
                    deathToll.add(this.getSoldier(i));
                }
            }
        }
        this.soldiers.removeAll(deathToll);
    }
}

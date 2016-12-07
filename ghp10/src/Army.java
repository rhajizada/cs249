import java.util.ArrayList;


/**
 * Created by rufathajizada on 12/5/16.
 */
public class Army<E extends Unit> {
    ArrayList<E> soldiers = new ArrayList<E>();
    String name;
    Army(String name, E e, int size){

        this.name = name;
        this.soldiers = new ArrayList<E>(size);
        for(int i =0;i< size;i++)
            this.soldiers.add(e);
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
        assert(!this.soldiers.isEmpty()&&!other.soldiers.isEmpty());
        for(int i = 0; i < this.getSoldierCnt(); i++ ) {
            int randomIndex = this.getRandom(other);
            this.getSoldier(i).attack(other.getSoldier(randomIndex));

            if(other.getSoldier(randomIndex).getHealth() <= 0){
                other.removeSoldier(other.getSoldier(randomIndex));
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

/**
 * Created by rufathajizada on 11/9/16.
 */
public class Spider extends Monster {
    Spider(){};
    Spider(int x, int y, int health){
        super(x, y, health);
    }
    @Override
    public void drawToMap(Map screen) {
        if (screen != null) {
            screen.mapData[this.x][this.y] = 's';
        }
    }
}

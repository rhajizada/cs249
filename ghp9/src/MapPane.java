import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 * Created by hajizar on 11/16/2016.
 */
public class MapPane extends Pane {
    final static int TILE_WIDTH = 32;
    final static int TILE_HEIGHT = 32;
    Map currentMap;
    MapPane(Map map){
        this.currentMap = map;
        for(int i = 0; i < currentMap.mapRows;i++){
            for(int j = 0; j < currentMap.mapCols;j++){
                Tile tile = new Tile(j*TILE_WIDTH, i*TILE_HEIGHT, currentMap.getMapLocation(j, i));
                getChildren().add(tile);
            }
        }

    }

    private class Tile extends Rectangle{
        Tile(double x, double y, char type){
            super(x, y, TILE_WIDTH, TILE_HEIGHT);
             if(type ==' '){
                 setFill(Color.BLACK);
             }
             if(type == '#'){
                 setFill(Color.GREY);
             }
             if(type =='.'){
                 setFill(Color.LIGHTGREY);
             }
        }
    }
}

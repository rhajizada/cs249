/**
 * Created by hajizar on 10/28/2016.
 */
public class Map {
    protected int mapRows;
    protected int mapCols;
    protected char [][]mapData;
    Map(int mapRows, int mapCols){
        this.mapRows = mapRows;
        this.mapCols = mapCols;
        mapData = new char[this.mapCols][this.mapRows];
        for(int i = 0; i < this.mapRows;i++){
            for(int j = 0; j < this.mapCols;j++){
                mapData[j][i] = '.';
            }
        }
    }

    protected boolean copyTo(Map other){
        if(other == null && ( other.mapCols == this.mapCols) && (other.mapRows == this.mapRows)) {
            return false;
        }
        else{
            for(int i = 0; i < this.mapRows;i++){
                for(int j = 0; j < this.mapCols;j++){
                    other.mapData[j][i] = this.mapData[j][i];
                }
            }
            return true;
        }

    }

    protected void draw(){
        int j = 0;
        for(int x = 0; x < this.mapCols; x++){
            for(int y = 0; y < this.mapRows;y++){
                j++;
                System.out.print(this.mapData[x][y]);
                if ( j % 10 == 0 && j != 0 ){
                    System.out.println(' ');
                }
            }
        }
    }

    protected boolean setMapLocation(int x, int y, char c){
        if(x < this.mapCols && y <this.mapRows){
            mapData[y][x] = c;
            return true;
        }
        else{
            return false;
        }
    }

}

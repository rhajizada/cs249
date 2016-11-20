import java.util.NoSuchElementException;
import java.util.Scanner;

/*  ghp6 part 2 Map Class
 Written by Rufat Hajizada for CS249
 Language: Java
*/
public class Map implements Loadable{
    protected int mapRows; //number of rows in the map
    protected int mapCols; // number of columns in the map
    protected char [][]mapData; // map itself
    Map(){
        this.mapRows = 0;
        this.mapCols = 0;
        this.mapData = new char[0][0];
    }
    Map(int mapRows, int mapCols){
        //constructs map and fills it in with dots
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
        // copies one map to another
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
        // outputs the map on the scren
        int y = 0;
        int x = 0;
        while(y < this.mapCols){
            for(x = 0;x < this.mapData[y].length;x++){
                System.out.print(this.mapData[y][x]);
            }
            System.out.println(" ");
            y++;
        }
    }

    protected boolean setMapLocation(int x, int y, char c){
        // sets the input character to the input location in the map
        if(x < this.mapCols && y <this.mapRows){
            mapData[y][x] = c;
            return true;
        }
        else{
            return false;
        }
    }
    protected void copyMap(Map newMap){
        this.mapCols = newMap.getMapCols();
        this.mapRows = newMap.getMapRows();
        int y = 0;
        int x = 0;
        while(y < this.mapCols){
            for(x = 0;x < this.mapData[y].length;x++){
                this.mapData[y][x] = newMap.getMapLocation(y,x);
            }
            y++;
        }

    }

    protected int getMapRows(){return this.mapRows;}
    protected int getMapCols(){return this.mapCols;}

    public char getMapLocation(int y, int x){
        if(y <= this.mapCols || x <= this.mapRows){
            return this.mapData[y][x];

        }
        else{
            return ' ';
        }
    }

    public boolean canMoveTo(int y, int x){
        if(y >this.mapRows || x > this.mapCols){
            return false;
        }
        else if(this.mapData[y][x] == '.'){
            return true;
        }
        else{
            return false;
        }
    }


    @Override
    public void load(Scanner input) throws Exception {
        this.mapData = new char[0][0];
        this.mapRows = 0;
        this.mapCols = 0;
        Integer mapRows = Integer.parseInt(input.nextLine());
        Integer mapCols = Integer.parseInt(input.nextLine());
        this.mapRows = mapRows;
        this.mapCols = mapCols;
        this.mapData = new char[this.mapCols][this.mapRows];
        int i =0;
        while(input.hasNextLine()) {
            this.mapData[i] = (input.nextLine()).toCharArray();
            i++;
        }

    }
}

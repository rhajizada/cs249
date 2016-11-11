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
        // sets the input character to the input location in the map
        if(x < this.mapCols && y <this.mapRows){
            mapData[y][x] = c;
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
        for(int i = 0; i < this.mapCols; i++){
            String bufStr = input.nextLine();
            char[] buffer = new char[bufStr.length()];
            for(int j = 0; j < bufStr.length(); j++){
                buffer[j] = bufStr.charAt(j);
            }
            this.mapData[i] = buffer;
        }

    }
}

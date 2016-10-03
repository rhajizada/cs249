import java.util.*;
public class ghp4_2 {
    private static final int ROWS = 20;
    private static final int COLUMNS = 10;
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        final double EPS = 1e-14;
        char[][] map;
        char[][] displayBuffer;
        displayBuffer = new char [ROWS][COLUMNS];
        map = new char[ROWS][COLUMNS];
        displayBuffer = map;

        for(int x = 0; x < ROWS; x++){
            for(int y = 0; y < COLUMNS;y++){
                map[x][y] = '.';
            }
        }
        Mover(displayBuffer);


    }

    public static void Mover (char map[][]){
        int[] position;
        int moveX = 0;
        int moveY = 0;
        char movedDisplay[][];
        movedDisplay = new char[ROWS][COLUMNS];
        position = new int[2];
        char move = ' ';
        map[0][0] = '@';
        Renderer(map);
        while (move != 'q') {
            move = input.next().charAt(0);
            for (int x = 0; x < ROWS; x++) {
                for (int y = 0; y < COLUMNS; y++) {
                    if (map[x][y] == '@') {
                        position[0] = x;
                        position[1] = y;
                        map[x][y] = '.';
                        break;
                    }
                }
            }
            if (move == 'w'){
                moveX = position[0] - 1;
                moveY = position[1];
                if (StatusCheck(moveX, moveY)){
                    map[moveX][moveY] = '@';
                }
                else{
                    map[position[0]][position[1]] = '@';
                }

            }
            else if (move == 'a'){
                moveX = position[0];
                moveY = position[1] - 1;
                if (StatusCheck(moveX, moveY)){
                    map[moveX][moveY] = '@';
                }
                else{
                    map[position[0]][position[1]] = '@';
                }
            }
            else if (move == 's'){
                moveX = position[0]+1;
                moveY = position[1];
                if (StatusCheck(moveX, moveY)){
                    map[moveX][moveY] = '@';
                }
                else{
                    map[position[0]][position[1]] = '@';
                }
            }
            else if (move == 'd'){
                moveX = position[0];
                moveY = position[1]+1;
                if (StatusCheck(moveX, moveY)){
                    map[moveX][moveY] = '@';
                }
                else{
                    map[position[0]][position[1]] = '@';
                }
            }
            else{
                System.out.println("Wrong input!");
                map[position[0]][position[1]] = '@';
            }
            Renderer(map);
        }
    }

    public static void Renderer(char map[][]){
        int j = 0;
        for(int x = 0; x < ROWS-1; x++){
            for(int y = 0; y < COLUMNS;y++){
                j++;
                System.out.print(map[x][y]);
                if ( j % 10 == 0 && j != 0 ){
                    System.out.println(' ');
                }
            }
        }
    }

    public static boolean StatusCheck(int moveX, int moveY){
        if (moveX < ROWS - 1 && moveY < COLUMNS && moveX>=0 && moveY >= 0){
            return true;
        }
        else {
            return false;
        }
    }


}

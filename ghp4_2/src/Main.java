public class Main {

    public static void main(String[] args) {
	    final int ROWS = 10;
        final int COLUMNS = 20;
        final double EPS = 1e-14;
        char[][] map;
        map = new char[10][20];
        for(int x = 0; x < ROWS; x++){
            for(int y = 0; y < COLUMNS;y++){
                map[x][y] = '.';
            }
        }
        int j = 0;
        for(int x = 1; x < ROWS-1; x++){
            for(int y = 1; y < COLUMNS-1;y++){
                j++;
                System.out.print(map[x-1][y-1]);
                if ( x % 10 == 0 ){
                    System.out.println(' ');
                }
            }
        }
    }
}

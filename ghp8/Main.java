import java.io.File;
//import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	try{
        Map baseMap = new Map();
        int numberOfMonsters;
        Scanner monsterScanner;
        Scanner mapScanner;
        System.out.print("Enter the level (01/02)?: ");
        Scanner input = new Scanner(System.in);
        String levelName = input.nextLine();
        mapScanner = new Scanner(new File("Map" + levelName +".txt"));
        baseMap.load(mapScanner);

        mapScanner.close();
        monsterScanner = new Scanner(new File("Monsters" + levelName + ".txt"));
        numberOfMonsters = monsterScanner.nextInt();
        ArrayList<Monster> monsterArray = new ArrayList<>(numberOfMonsters);
        while(monsterScanner.hasNext()){
            String currentMonster = monsterScanner.next();
            Monster m;
            if (currentMonster.equals("Orc")){
                m = new Orc();
            }
            else if(currentMonster.equals("Spider"))
            {
                m = new Spider();
            }
            else{
                m = new Orc();
            }

            if(m != null) {
                m.load(monsterScanner);
                monsterArray.add( m);
            }
        }
        monsterScanner.close();
        for(Monster m: monsterArray){
            m.drawToMap(baseMap);
        }
        baseMap.draw();

    }
    catch(Exception ex){
        System.err.println("Game error");
        ex.printStackTrace();
    }
    }

}

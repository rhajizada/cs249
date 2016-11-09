/*  ghp7 part 2 test driver
 Written by Rufat Hajizada for CS249
 Language: Java
*/
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try{
            System.out.print("Enter URL or path to the file: ");
            Scanner input = new Scanner(System.in);
            String path = input.nextLine();
             WordCountData myFileOrPath = new WordCountData();
             myFileOrPath = WordCounter.count(path);
            System.out.println(myFileOrPath.result());
            myFileOrPath.printer();

        }
	 catch (Exception ex) {
            System.out.println("OH NO");
            ex.printStackTrace();
        }
    }
}

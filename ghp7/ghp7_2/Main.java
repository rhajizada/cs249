import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try{
            Scanner input = new Scanner(System.in);
            String path = input.nextLine();
            WordCounter fileOrSite = WordCounter.WordCountData(path);
            System.out.println(WordCounter.toString(fileOrSite));
        }
	 catch (Exception ex) {
            System.out.println("OH NO");
            ex.printStackTrace();
        }
    }
}

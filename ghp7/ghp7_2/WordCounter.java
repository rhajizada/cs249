/*  ghp7 part 2 WordCounter Class
 Written by Rufat Hajizada for CS249
 Language: Java
*/
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;


public class WordCounter {

    public static WordCountData count(String path) throws Exception {
        int wordCnt = 0;
        int charCnt = 0;
        int lineCnt = 0;
        // WordCountData method takes string from user checks whether
        // it is URL or file and counts number of characters, words and lines
            if (path.contains("http")) {
                URL url = new URL(path);
                Scanner pageInput = new Scanner(url.openStream());
                while (pageInput.hasNext()) {
                    String line = pageInput.nextLine();
                    wordCnt += line.split(" ").length;
                    charCnt += line.length();
                    lineCnt++;
                }
            } else {
                Scanner inputFile = new Scanner(new File(path));
                while (inputFile.hasNext()) {
                    String line = inputFile.nextLine();
                    wordCnt += line.split(" ").length;
                    charCnt += line.length();
                    lineCnt++;
                }
                inputFile.close();

            }
            return new WordCountData(charCnt, wordCnt, lineCnt);
        }
    }

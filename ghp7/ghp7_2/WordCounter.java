
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

/**
 * Created by hajizar on 11/3/2016.
 */
public class WordCounter {
    private static int charCnt = 0;
    private static int wordCnt = 0;
    private static int lineCnt = 0;

    WordCounter(int charCnt, int wordCnt, int lineCnt) {
        this.charCnt = charCnt;
        this.wordCnt = wordCnt;
        this.lineCnt = lineCnt;
    }

    public static WordCounter WordCountData(String path) throws Exception {
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
            return new WordCounter(charCnt, wordCnt, lineCnt);
        }
    public static String toString(WordCounter fileOrSite){
        return String.format("Number of chars: %d\nNumber of words: %d\nNumber of lines: %d\n", fileOrSite.charCnt, fileOrSite.wordCnt, fileOrSite.lineCnt);
    }
    }

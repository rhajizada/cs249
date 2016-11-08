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
    private static int charCnt = 0; // number of characters
    private static int wordCnt = 0; // number of words
    private static int lineCnt = 0; // number of lines

    WordCounter(int charCnt, int wordCnt, int lineCnt)
    // deafault constructor
        this.charCnt = charCnt;
        this.wordCnt = wordCnt;
        this.lineCnt = lineCnt;
    }

    public static WordCounter WordCountData(String path) throws Exception {
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
            return new WordCounter(charCnt, wordCnt, lineCnt);
        }
    public static String toString(WordCounter fileOrSite){
        // toString method takes WordCounter object and outputs string with number of characters
        // words and lines
        return String.format("Number of chars: %d\nNumber of words: %d\nNumber of lines: %d\n", fileOrSite.charCnt, fileOrSite.wordCnt, fileOrSite.lineCnt);
    }

    }

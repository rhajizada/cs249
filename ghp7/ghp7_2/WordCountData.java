/*  ghp7 part 2 WordCountData Class
 Written by Rufat Hajizada for CS249
 Language: Java
*/
import java.io.*;
public class WordCountData {
    private int charCnt ; // number of characters
    private int wordCnt ; // number of words
    private int lineCnt ; // number of lines
    private String path;

    WordCountData(){
        // deafault constructor
        this.charCnt = 0;
        this.wordCnt = 0;
        this.lineCnt = 0;
    }
    WordCountData(int charCnt, int wordCnt, int lineCnt){

        this.charCnt = charCnt;
        this.wordCnt = wordCnt;
        this.lineCnt = lineCnt;
    }


    public int getCharCnt(){return this.charCnt;} //charCnt getter
    public int getWordCnt(){return this.wordCnt;} //wordCnt getter
    public int getLineCnt(){return this.lineCnt;} //lineCnt getter
    public String result(){
        // toString method takes WordCounter object and outputs string with number of characters
        // words and lines
        return String.format(" Number of chars: %d \n Number of words: %d \n Number of lines: %d \n ", this.charCnt, this.wordCnt, this.lineCnt);
    }

    public void printer() throws Exception{
        // creates file and prints output int it
        File outputFile = new File("output.txt");
        FileOutputStream is = new FileOutputStream(outputFile);
        OutputStreamWriter osw = new OutputStreamWriter(is);
        Writer w = new BufferedWriter(osw);
        w.write(this.result());
        w.close();
    }
}


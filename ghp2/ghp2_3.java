/*  ghp2 part 3
 This program takes user input and replaces the word "squirrel" with "...SQUIRREL!..."
 Written by Rufat Hajizada for CS249
 Language: Java
*/
import java.util.*;
public class ghp2_3 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter a line of text: ");
        String line = input.nextLine(); // User input
        System.out.printf("%s", SquirrelChecker(line));

    }




    public static String SquirrelChecker(String line){
        String[] words =line.split(" "); // Splits the sentence in words and puts it in array words
        String newSentence = "";
        int FoundIndex = 8;
        // SquirrelChecker checks the line input and if it contains word "squirrel" replaces it with "...SQUIRREL!..."
        for( int i = 0; i < words.length; i++){
            if (words[i].contains("squirrel") ){ 
                if(words[i].compareTo( "squirrel")!= 0){
                    if (words[i].charAt(FoundIndex) != ' ') {
                        words[i] = "...SQUIRREl!..." + words[i].substring(FoundIndex);
                    }
                }
                else {
                    words[i] = "...SQUIRREL!...";
                }
            }
            else{}
            newSentence +=words[i] + " ";
        }
        return newSentence;
    }

}


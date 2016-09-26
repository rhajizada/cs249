
/*  ghp3 part 2
 This program takes the string input from user, counts and outputs number of consonants and vowels in the sentence
 Written by Rufat Hajizada for CS249
 Language: Java
*/
import java.util.*;
public class ghp3_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    System.out.println("Enter a string: ");
        String userLine = input.nextLine(); //UserInput
        VowelCounter(userLine);

    }
    public static void VowelCounter(String userLine){
        String[] words =userLine.split(" "); //Splits string into words
        int j ;
        int vowelCounter = 0;
        int consonantCounter = 0;
        for (int i = 0; i < words.length; i++){
            words[i] = words[i].toUpperCase();
            for( j = 0;j < words[i].length();j++){
                boolean isVowel = false || words[i].charAt(j)=='A' || words[i].charAt(j) == 'E' || words[i].charAt(j) == 'I' || words[i].charAt(j) == 'O' || words[i].charAt(j) == 'U';
                if ( isVowel){
                    vowelCounter++;
                }
                else if ( Character.isAlphabetic(words[i].charAt(j)) && !isVowel){
                    consonantCounter++;
                }
                ;
            }
        }
        System.out.println("The number of vowels is " + vowelCounter);
        System.out.println("The number of consonants is "  + consonantCounter);
        System.out.println("The price is $" + (vowelCounter* 250));
    }
}


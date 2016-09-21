
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    System.out.println("Enter a string: ");
        String userLine = input.nextLine();
        VowelCounter(userLine);

    }
    public static void VowelCounter(String userLine){
        String[] words =userLine.split(" ");
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


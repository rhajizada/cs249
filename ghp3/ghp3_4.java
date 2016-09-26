/*  ghp3 part 4
 This program that converts number with texts into the numbers
 Written by Rufat Hajizada for CS249
 Language: Java
*/
import java.util.*;
public class ghp3_4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the numer: ");
        String userNumber = input.nextLine(); //Takes number input from the user
        String parts[] = userNumber.split("-");
        int i = 0;
        System.out.print(userNumber + " is translated to " + parts[0] + '-' + parts[1]+'-');
        while(i < parts[2].length()){
            System.out.print(getNumber(parts[2].toUpperCase().charAt(i)));
            i++;
        }
    }
    public static int getNumber(char upperCaseLetter){
        // This function converts the char to letter
        int symbol =0;
        switch (upperCaseLetter) {
            case 'A':
                symbol = 2;
                break;
            case 'B':
                symbol = 2;
                break;
            case 'C':
                symbol = 2;
                break;
            case 'D':
                symbol = 3;
                break;
            case 'E':
                symbol = 3;
                break;
            case 'F':
                symbol = 3;
                break;
            case 'G':
                symbol = 4;
                break;
            case 'H':
                symbol = 4;
                break;
            case 'I':
                symbol = 4;
                break;
            case 'J':
                symbol = 5;
                break;
            case 'K':
                symbol = 5;
                break;
            case 'L':
                symbol = 5;
                break;
            case 'M':
                symbol = 6;
                break;
            case 'N':
                symbol = 6;
                break;
            case 'O':
                symbol = 6;
                break;
            case 'P':
                symbol = 7;
                break;
            case 'Q':
                symbol = 7;
                break;
            case 'R':
                symbol = 7;
                break;
            case 'S':
                symbol = 7;
                break;
            case 'T':
                symbol = 8;
                break;
            case 'U':
                symbol = 8;
                break;
            case 'V':
                symbol = 8;
                break;
            case 'W':
                symbol = 9;
                break;
            case 'X':
                symbol = 9;
                break;
            case 'Y':
                symbol = 9;
                break;
            case 'Z':
                symbol = 9;
                break;

        }
        return symbol;
    }

}

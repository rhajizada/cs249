/*  ghp2 part 1
 This program solves 2x2 system of linear equations using Crammer's rule
 Written by Rufat Hajizada for CS249
 Language: Java
*/

import java.util.*;
public class ghp2_1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Instance of class Scanner used for input
        System.out.println("Welcome to Homework # 2\nIn this homework we are going to solve 2x2 system of linear equations\nUsing Crammer's rule\n");
        System.out.println("Enter coefricient a ( ax + by = e ): ");
        double a = input.nextDouble(); // Coeficient A, User input
        System.out.println("Enter coeficient b ( ax + by = e ): ");
        double b = input.nextDouble(); // Coeficient B, User Input
        System.out.println("Enter coeficient e ( ax + by = e ): ");
        double e = input.nextDouble(); // Coeficient E, User input
        System.out.println("Enter coeficient c ( cx + dy = f ): ");
        double c = input.nextDouble(); // Coeficient C, User input
        System.out.println("Enter coeficient d ( cx + dy = f ): ");
        double d = input.nextDouble(); // Coeficient D, User input
        System.out.println("Enter coeficient f ( cx + dy = f ): ");
        double f = input.nextDouble(); // Coeficient F, user input
        double EPS = 1e-14; // to check if answer is NaN
        if (Math.abs(a*d - b*c) < EPS){
            System.out.println("There  is no solution");
        }
        else {
            double x = (e * d - b * f) / (a * d - b * c);
            double y = (a * f - e * c) / (a * d - b * c);
            System.out.println("X is " + x + " and Y is " + y);
        }
    }

}

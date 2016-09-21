/*  ghp2 part 2
 This program calculates area of regular polygon
 Written by Rufat Hajizada for CS249
 Language: Java
*/
import java.util.*;
public class ghp2_2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
	System.out.println("This program calculates area of regular polygon");
        System.out.println("Enter number of sides of polygon: ");
        int sides = input.nextInt(); // Number of sides of the polygon, user's input
        System.out.println("Enter the length of side of the polygon: ");
        double length = input.nextDouble(); // Length of the side of the polygon, user's input
        double area =(length*length*sides)/ (Math.tan(Math.PI/sides)*4); // Area of the polygon
        System.out.println("Area of the polygon is equal to: " + area);

    }
}

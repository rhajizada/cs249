import java.util.*;
public class Main {

    public static void main(String[] args)  {
        System.out.print("INPUT: ");
	    Scanner input = new Scanner(System.in);
        String expression = input.next();
        try {
            System.out.println("Answer is: "  + Calculator.eval(expression));
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}

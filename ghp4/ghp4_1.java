import java.util.*;
public class ghp4_1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double coef[];
        double answers[];
        double EPS = 1e-14;
        answers = new double[3];
        coef= new double[3];
        System.out.println("This program solves quadratic equations: ");
        System.out.println("Enter a, b and c: ");
        coef[0] = input.nextDouble(); // Coeficient a
        coef[1] = input.nextDouble(); // Coeficient b
        coef[2] = input.nextDouble(); // Coeficient c
        if ( solveQuadratic(coef)[1] == solveQuadratic(coef)[2] && !(solveQuadratic(coef)[1] == - 99999) && !( solveQuadratic(coef)[2] == - 99999)){
            System.out.println("Equation has one solution: " + solveQuadratic(coef)[1]);
        }
        else if (!(solveQuadratic(coef)[1] == - 99999) && !( solveQuadratic(coef)[2] == - 99999)) {
            System.out.printf("Equation has two solutions: %f %f", solveQuadratic(coef)[1], solveQuadratic(coef)[2]);
        }
        else {
            System.out.println("Equation does not have solutions");
        }
        }
    public static double[] solveQuadratic(double [] eqn){
        double roots[];
        double EPS = 1e-14;
         roots = new double[4];
        /*
        roots[0] = Discriminant
        roots[1] = x1
        roots[2] = x2
         */
        roots = new double[3];
        roots[1] = -99999;
        roots[2] = roots[1];
        roots[0] = eqn[1]*eqn[1] - (4*eqn[0]*eqn[2]);
        if( (roots[0] > 0 || roots[0] < EPS) && !(roots[0] < 0)) {
            roots[1] = (-eqn[1] + roots[0]) / (2 * eqn[0]);
            roots[2] = (-eqn[1] - roots[0]) / (2 * eqn[0]);
        }
        return roots;
    }
}

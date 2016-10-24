/*  ghp5 part 1 test driver
 Written by Rufat Hajizada for CS249
 Language: Java
*/
public class ghp5_1 {

    public static void main(String[] args) {
	    Circle2D c1 = new Circle2D(0, 0, 4);
        Circle2D c2 = new Circle2D(0, 0, 3);
        Circle2D c3 = new Circle2D(5, 5, 1);
        System.out.println("Area of the circle: " + c1.getArea());
        System.out.println("Perimeter of the circle: " + c1.getPerimeter());
        System.out.println("Circle contains (2,2)? " + c1.contains(2, 2) );
        System.out.println("Circle contains " + c2.getPosition() + " " + c2.getRadius() + "? " + c1.contains(c2));
        System.out.println("Circle1 overlapses "+ c3.getPosition() + " " + c3.getRadius() + "? " + c1.overlaps(c3));
    }
}

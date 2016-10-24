public class ghp5_1 {

    public static void main(String[] args) {
	    Circle2D c1 = new Circle2D(0, 0, 4);
        Circle2D c2 = new Circle2D(0, 0, 3);
        Circle2D c3 = new Circle2D(5, 5, 1);
        System.out.println("Area of circle1: " + c1.getArea());
        System.out.println("Perimeter of circle1: " + c1.getPerimeter());
        System.out.println("Circle1 contains (2,2)? " + c1.contains(2, 2) );
        System.out.println("Circle1 contains circle2? " + c1.contains(circle2));
        System.out.println("Circle1 overlapses circle3? " + c1.overlaps(circle3));
    }
}

public class ghp5_1 {

    public static void main(String[] args) {
	    Circle2D circle1 = new Circle2D(0, 0, 4);
        Circle2D circle2 = new Circle2D(0, 0, 3);
        Circle2D circle3 = new Circle2D(5, 5, 1);
        System.out.println("Area of circle1: " + circle1.getArea());
        System.out.println("Perimeter of circle11: " + circle1.getPerimeter());
        System.out.println("Circle1 contains (2,2)? " + circle1.contains(2, 2) );
        System.out.println("Circle1 contains circle2? " + circle1.contains(circle2));
        System.out.println("Circle1 overlapses circle3? " + circle1.overlaps(circle3));
    }
}

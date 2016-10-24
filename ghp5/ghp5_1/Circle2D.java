/*  ghp5 part 1 Circle2D Class
 Written by Rufat Hajizada for CS249
 Language: Java
*/
import java.awt.geom.Point2D;

public class Circle2D {
    private double x; // X axis position
    private double y; // Y axis position
    private Point2D.Double position = new Point2D.Double(); // Position ( instance of Point2D class)
    private double radius; // Radius of the circle
    Circle2D() {
        // default constructor
        this.x = 0;
        this.y = 0;
        this.radius = 1;
    }
    Circle2D(double x, double y, double radius){
        // constructor that sets position and radius to user input
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    protected double getArea(){
        // returns area of circle
        return Math.PI*radius*radius;
    }

    protected double getPerimeter(){
        // returns perimeter of circle
        return Math.PI*2*radius;
    }

    private double getDistance(double x, double y){
        // returns
        return Math.sqrt((this.x-x)*(this.x-x)+ (this.y-y)*(this.y-y));
    }

    protected boolean contains(double x, double y){
        // checks if circle contains the point x,y
        if(getDistance(x, y) < this.radius){
            return true;
        }
        else{
            return false;
        }
    }

    private void setPosition(){
        // sets position of circle center to Point2D.Double object
        position = new Point2D.Double(this.x, this.y);
    }

    protected boolean contains(Circle2D circle){
        // checks if this circle contains other circle
        if(Math.abs(this.radius - circle.radius) > getDistance(circle.x, circle.y)){
            return true;
        }
        else{
            return false;
        }

    }

    protected boolean overlaps(Circle2D circle){
        // checks if this circle overlapses other circle
        if (!(this.radius+circle.radius < getDistance(circle.x, circle.y))){
            return true;
        }
        else {
            return false;
        }
    }

    protected Point2D.Double getPosition(){
        // returns position of circle center
        setPosition();
        return this.position;
    }
    
    protected double getRadius(){
        // returns radius
        return this.radius;
    }

}

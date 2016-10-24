/**
 * Created by rufathajizada on 10/19/16.
 */
import java.awt.geom.Point2D;

public class Circle2D {
    private double x;
    private double y;
    private Point2D.Double position = new Point2D.Double();
    private double radius;
    Circle2D() {
        this.x = 0;
        this.y = 0;
        this.radius = 1;
    }
    Circle2D(double x, double y, double radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    protected double getArea(){
        return Math.PI*radius*radius;
}

    protected double getPerimeter(){
        return Math.PI*2*radius;
    }

    private double getDistance(double x, double y){
        return Math.sqrt((this.x-x)*(this.x-x)+ (this.y-y)*(this.y-y));
    }

    protected boolean contains(double x, double y){
        if(getDistance(x, y) < this.radius){
            return true;
        }
        else{
            return false;
        }
    }

    private void setPosition(){
        position = new Point2D.Double(this.x, this.y);
    }

    protected boolean contains(Circle2D circle){
        if(Math.abs(this.radius - circle.radius) > getDistance(circle.x, circle.y)){
            return true;
        }
        else{
            return false;
        }

    }

    protected boolean overlaps(Circle2D circle){
        if (!(this.radius+circle.radius < getDistance(circle.x, circle.y))){
            return true;
        }
        else {
            return false;
        }
    }

    protected Point2D.Double getPosition(){
        setPosition();
        return this.position;
    }
    
    protected double getRadius(){
        return this.radius;
    }

}

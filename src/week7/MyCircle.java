package week7;

import week7.MyCircle;
import week7.MyPoint;

public class MyCircle extends MyPoint {
    private MyPoint center;
    private int radius;

    public MyCircle() {
    }

    public MyCircle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    public MyCircle(MyPoint center,int radius) {
        this.radius = radius;
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public MyPoint getCenter() {
        return center;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public int getCenterX() {
        return center.x;
    }

    public void setCenterX(){
        this.center.x = center.x;
    }
    public int getCenterY() {
        return center.y;
    }

    public void setCenterY(){
        this.center.y = center.y;
    }

    public int[] getCenterXY(){
        int[] XY = new int[2];
        XY[0] = center.x;
        XY[1] = center.y;
        return XY;
    }

    public void setCenterXY(int x, int y){
        center.x = x;
        center.y = y;
    }

    @Override
    public String toString() {
        return String.format("MyCircle[radius=%d,center=%s]",radius,center.toString());
    }

    public double getArea(){
        double area = 3.1415*(Math.pow(radius,2));
        return area;
    }

    public double getCircumference(){
        double circumference = 2*(3.1415*radius);
        return circumference;
    }

    public double distance(MyCircle another){
        return center.distance(another.center);
    }

}
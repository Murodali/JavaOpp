package Exam;

public class MovableCircle implements Movable {
    private int radius;
    MovablePoint center;
    //Constructor
    MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.center = new MovablePoint(x,y,xSpeed,ySpeed);
        this.radius = radius;
    }
    //toString method
    public String toString() {
        return String.format("MovableCircle{radius=%s,center=%s}", radius, super.toString());
    }
    
    @Override
    public void moveUp() {
        center.moveUp();
    }
    @Override
    public void moveDown() {
        center.moveDown();

    }
    @Override
    public void moveLeft() {
        center.moveLeft();
    }
    @Override
    public void moveRight() {
        center.moveRight();
    }
}

package Exam;

public class MovableRectangle implements Movable{
    private MovablePoint topLeft;
    private MovablePoint bottomRight;
    //Constructor
    MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed){
        this.topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        this.bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }
    //toString method
    public String toString(){
        return String.format("Rectangle{%s,%s}",topLeft,bottomRight);
    }
    @Override
    public void moveUp() {
        this.bottomRight.moveUp();
        this.topLeft.moveUp();
    }
    @Override
    public void moveDown() {
        this.bottomRight.moveDown();
        this.topLeft.moveDown();
    }
    @Override
    public void moveLeft() {
        this.bottomRight.moveLeft();
        this.topLeft.moveLeft();
    }
    @Override
    public void moveRight() {
        this.bottomRight.moveRight();
        this.topLeft.moveRight();
    }
}

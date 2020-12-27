package Exam;

public class MovablePoint implements Movable{
    private int x, y, xSpeed, ySpeed;
    //Constructor
    public MovablePoint(int x, int y, int xSpeed, int ySpeed){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    //toString method
    public String toString() {
        return String.format("MovablePoint[Coordinates(%s,%s), Speed=(%s,%s)]",x,y,xSpeed,ySpeed);
    }
    @Override
    public void moveUp() {
        this.y -= this.ySpeed;
    }
    @Override
    public void moveDown() {
        this.y += this.ySpeed;
    }
    @Override
    public void moveLeft() {
        this.x -= this.xSpeed;
    }

    @Override
    public void moveRight() {
        this.x += this.xSpeed;
    }
}

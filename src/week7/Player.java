package week7;

import week7.Ball;

import java.util.Random;

public class Player {
    private int number;
    private float x;
    private float y;
    private float z=0.0f;

    public Player(int number, float x, float y, float z) {
        this.number = number;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getNumber() {
        return number;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getZ() {
        return z;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void move(float xDisp,float yDisp){
        this.x += xDisp;
        this.y += yDisp;
    }

    public void jump(float zDisp){
        this.z = zDisp;
    }

    public boolean near(Ball ball){
        float dist = (float) Math.sqrt(Math.pow(x-ball.getX(),2)+Math.pow(y-ball.getY(),2));
        if(dist<8){
            return true;
        }
        return false;
    }

    public void kick(Ball ball) {
        if(near(ball)==true) {
            Random r = new Random();
            float r1 = r.nextFloat() + r.nextInt(20);
            float r2 = r.nextFloat() + r.nextInt(20);
            ball.setXYZ((ball.getX() + r1), (ball.getX() + r2), 0.0f);
        }
    }

    @Override
    public String toString() {
        return String.format("Player %02d is at (%.1f,%.1f,%.1f)",number,x,y,z);
    }

    public static void main(String[] args) {
        Player player = new Player(13, 0.0f, 0.0f,0.0f);
        System.out.println(player);
    }
}

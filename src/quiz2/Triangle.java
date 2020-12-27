package quiz2;

public class Triangle {

    //declaration of variables
    public double side1;
    public double side2;
    public double side3;

    // this is the constructor
    Triangle(double side1, double side2, double side3) throws TriangleException {
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) throw new TriangleException();
        if (side1 + side2 < side3) throw new TriangleException();
        if (side1 + side3 < side2) throw new TriangleException();
        if (side2 + side3 < side1) throw new TriangleException();
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    boolean isEquilateral() {
        return this.side1 == this.side2 && this.side2 == this.side3;
    }

    boolean isIsosceles() {
        return this.side1 == this.side2 || this.side1 == this.side3 || this.side2 == this.side3;
    }

    boolean isScalene() {
        return this.side1 != this.side2 && this.side1 != this.side3 && this.side2 != this.side3;
    }
}
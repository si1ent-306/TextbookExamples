package ClassPractice;

public class Triangle extends GeometricObject{
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public double getArea(double side1, double side2,double side3){
        return side1 * side2 * side3;
    }
    public double getPerimiter(double side1, double side2,double side3){
        return side1 + side2 + side3;
    }

    @Override
    public String toString() {
        return "Triangle: " +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3;
    }
}

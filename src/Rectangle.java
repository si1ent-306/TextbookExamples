public class Rectangle {
    double width = 1;
    double height = 1;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double getArea(double width, double height){
        return width * height;
    }
    public double getPerimeter(double width, double height){
        return 2 * (width + height);
    }
}

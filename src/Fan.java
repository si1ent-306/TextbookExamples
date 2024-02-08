public class Fan {
    private static int SLOW  = 1;
    private static int MEDIUM  = 2;
    private static int LONG  = 3;
    public int speed = SLOW;
    public boolean on = false;
    public double radius = 5;
    public String color = "Blue";
    public Fan() {
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Fan{" +
                "speed=" + speed +
                ", on=" + on +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
    public static void main(String[] args){
        Fan Fan1 = new Fan();
        Fan1.setOn(true);
        Fan1.setSpeed(LONG);
        Fan1.setRadius(10);
        Fan1.setColor("Yellow");
        System.out.println("Fan 1");
        System.out.println(Fan1.toString());
        Fan Fan2 = new Fan();
        Fan2.setSpeed(MEDIUM);
        Fan2.setColor("Blue");
        Fan2.setRadius(5);
        Fan2.setOn(false);
        System.out.println("Fan 2");
        System.out.println(Fan2.toString());
    }
}


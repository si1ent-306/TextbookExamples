public class footToMetersMethod {
    public static void main(String[] args){
        double feet =metersToFeet(80);
        double meters = feetToMeters(80);
        for(double i = 0; i <= 10; i++){
            System.out.print(i + " : meters ");
            System.out.print( " " + metersToFeet(i) + " : feet ");
            System.out.println();
        }
        System.out.println("-------------------------------------------------------");
        for(double i = 0; i <= 10; i++){
            System.out.print(i + " : feet ");
            System.out.print(" "+feetToMeters(i) + " : meters ");
            System.out.println();
        }

    }
    public static double metersToFeet(double meters){
        double foot = 3.279 * meters;
        return foot;
    }
    public static double feetToMeters(double feet){
        double meter = 0.305 * feet;
        return meter;
    }

}

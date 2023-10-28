public class footToMetersMethod {
    public static void main(String[] args){
        double c =celsiusToFarenhiet(80);
        double f = farenhietToCelsius(80);
        System.out.println(c);
        System.out.println(f);

    }
    public static double celsiusToFarenhiet(double celsius){
        double farenhiet = (9.0 / 5) * celsius + 32;
        return farenhiet;
    }
    public static double farenhietToCelsius(double farenhiet){
        double celsius = (5.0 / 9) * (farenhiet - 32);
        return celsius;
    }

}

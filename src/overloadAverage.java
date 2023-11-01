import java.util.Scanner;

public class overloadAverage {
    public static void main(String[] args){
        Scanner inputLine = new Scanner(System.in);
        System.out.println("Enter an array(int): ");
        int number = inputLine.nextInt();
        int[] intArray = new int[10];
        for(int i = 0; i < intArray.length; i++) {
            intArray[i]  = number;
            number = inputLine.nextInt();
        }
        System.out.println(average(intArray));
        System.out.println("Enter an array(double): ");
        double dNumber = inputLine.nextDouble();
        double[] doubleArray = new double[10];
        for(int i = 0; i < 10; i++) {
            doubleArray[i]  = dNumber;
            dNumber = inputLine.nextDouble();
        }
        System.out.println(average(doubleArray));

    }
    public static double average(int[] array){
        int average = 0;
        for(int i = 0; i < array.length; i++){
            average = average + array[i];
        }
        average = average/ array.length;
        return average;
    }

    public static double average(double[] array){
        double average = 0;
        for(int i = 0; i < array.length; i++){
            average = average + array[i];
        }
        average = average/ array.length;
        return average;
    }
}

import java.util.Scanner;
import java.util.stream.DoubleStream;

public class streamsAnalyzingNumbers {
    public static void main(String[] args){
        Scanner inputLine = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        double[] numbers = new double[inputLine.nextInt()];
        double sum = 0;
        System.out.println("Enter the numbers: ");
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = inputLine.nextDouble();
        }
        double average = DoubleStream.of(numbers).average().getAsDouble();
        System.out.println("Average is " + average);
        System.out.println("Numbers under the above the average is " + DoubleStream.of(numbers).filter(value -> value > average).count());
    }
}

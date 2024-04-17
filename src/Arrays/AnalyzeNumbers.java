package Arrays;

import java.util.Scanner;

public class AnalyzeNumbers {
    public static void main(String[] args){
        Scanner inputLine = new Scanner(System.in);
        System.out.println("Enter the number of items: ");
        int n = inputLine.nextInt();
        int array[] = new int[n];
        int total = 0;
        System.out.println("Enter the numbers: ");
        for(int i = 0; i < array.length; i++){
            array[i] = inputLine.nextInt();
            total += array[i];
        }
        double average = total / n;
        int count = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] > average){
                count++;
            }
        }
        System.out.println("The average of the numbers is "  + average);
        System.out.println("The number of numbers above the average is "  + count);
    }
}

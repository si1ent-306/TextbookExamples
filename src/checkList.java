import java.util.Arrays;
import java.util.Scanner;

public class checkList {
    public static void main(String[] args){
        //The arrays list1 and list2 are strictly identical if their corresponding elements are equal.
        Scanner inputLine = new Scanner(System.in);
        System.out.println("Enter a list (1): ");
        int number = inputLine.nextInt();
        int[] intArray = new int[6];
        for(int i = 0; i < intArray.length -1; i++) {
            intArray[i]  = number;
            number = inputLine.nextInt();
        }

        System.out.println("Enter a list (2): ");
        int number2 = inputLine.nextInt();
        int[] newIntArray = new int[6];
        for(int i = 0; i < newIntArray.length -1 ; i++) {
            newIntArray[i]  = number2;
            number2 = inputLine.nextInt();
        }
       System.out.println(equals(intArray, newIntArray));
        // Write a method that returns if list1 and list2 are strictly identical
        //Write a test program that prompts the user to enter two lists of integers and displays whether the two are strictly identical.
        // Note the first number in the input for each list indicates the number of the elements in the list. This number is not part of the list
    }
    public static boolean equals(int[] list1, int[] list2){
        boolean equals = Arrays.equals(list1, list2);
        return equals;
    }
}

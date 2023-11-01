import java.util.Scanner;

public class distinctNumbers {
    public static void main(String[] args) {
        Scanner inputLine = new Scanner(System.in);
        int[] counts = new int[101]; // Array to store counts for numbers 1 to 100
        //If a number is inputed more than once the index of that number increases;

        // Read integers until 0 is entered
        System.out.println("Enter numbers between 1 and 100 (enter 0 to stop):");
        int num = inputLine.nextInt();
        int counter = 0;
        //Check if the number is 0
        while (num != 0) {
            //check if the number is valid
            counter++;
            if (num >= 1 && num <= 100) {
                //Up the index of that number by one(all are 0 by default)
                counts[num]++;
            } else {
                System.out.println("Number out of range (1 to 100). Please enter a valid number.");
            }
            //assign the next value to the num variable
            num = inputLine.nextInt();
        }
        System.out.println("The numbers that repeat: ");
        for(int i = 0; i < counter; i++){
            if(counts[i] >= 1);{
                System.out.print(counts[i] + " ");
            }
        }
    }
}

import java.util.Scanner;

public class asciiValueReversed {
    public static void main(String[] args){
        //Write a program that receives an ASCII code (an integer between 0 and 127)
        for(int i = 0; i < 5; i++) {
            System.out.println("Enter an character to display as an integer: ");
            Scanner inputLine = new Scanner(System.in);
            char character = inputLine.nextLine().charAt(0);
            // and displays its character
            System.out.println((int) character);
        }
    }
}

import java.util.Scanner;

public class stringLengthMethod {
    public static void main(String[] args){
        // Write a program that prompts the user to enter a string
        Scanner inputLine = new Scanner(System.in);
        System.out.print("Enter a string to test: ");
        String string = inputLine.nextLine().replace(" ", "");
        // and displays its length
        stringLength(string);
    }

    private static void stringLength(String string) {
        int length = string.length();
        System.out.println(length);
    }
}

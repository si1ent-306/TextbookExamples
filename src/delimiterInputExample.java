import java.util.Scanner;

public class delimiterInputExample {
    public static void main(String[] args){
        Scanner inputLine = new Scanner(System.in);
        System.out.print("Enter a String");
        //Initialize the string delimiter
        inputLine.useDelimiter("\\s");
        //checks if the tokenized Strings has next token
        while(inputLine.hasNext()) {
        //prints the next token
            int year = inputLine.nextInt( );
            int age = inputLine.nextInt( );
            String feeling = inputLine.next( );
            String town = inputLine.next( );
            System.out.println(year);
            System.out.println(age);
            System.out.println(feeling);
            System.out.println(town);
        }
    }
}

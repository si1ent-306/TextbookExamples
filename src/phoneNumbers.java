import java.util.Scanner;

public class phoneNumbers {
    public static void main(String[] args){
        //Write a program that prompts the user to enter a lowercase or uppercase letter
        // and displays its corresponding number.
        // For a nonletter input, display invalid input
        Scanner inputLine = new Scanner(System.in);
        System.out.println("Enter a letter");
        System.out.print(getNumber(inputLine.nextLine().toLowerCase()));

    }
    public static int getNumber(String upperCaseLetter){
        for(int i = 0; i < upperCaseLetter.length(); i++){
            int number = 0;
            if(upperCaseLetter.charAt(i) == 'a' ||
                    upperCaseLetter.charAt(i) == 'b' ||
                    upperCaseLetter.charAt(i) == 'c'){
                number = number + 2;
                number = number * 10;
            }
            if(upperCaseLetter.charAt(i) == 'd' ||
                    upperCaseLetter.charAt(i) == 'e' ||
                    upperCaseLetter.charAt(i) == 'f' ){
                number = number + 3;
                number = number * 10;
            }
            if(upperCaseLetter.charAt(i) == 'g' ||
                    upperCaseLetter.charAt(i) == 'h' ||
                    upperCaseLetter.charAt(i) == 'i' ){
                number = number + 4;
                number = number * 10;
            }
            if(upperCaseLetter.charAt(i) == 'j' ||
                    upperCaseLetter.charAt(i) == 'k' ||
                    upperCaseLetter.charAt(i) == 'l' ){
                number = number + 5;
                number = number * 10;
            }
            if(upperCaseLetter.charAt(i) == 'm' ||
                    upperCaseLetter.charAt(i) == 'n' ||
                    upperCaseLetter.charAt(i) == 'o' ){
                number = number + 6;
                number = number * 10;
            }
            if(upperCaseLetter.charAt(i) == 'p' ||
                    upperCaseLetter.charAt(i) == 'q' ||
                    upperCaseLetter.charAt(i) == 'r'||
            upperCaseLetter.charAt(i) == 's' ){
                number = number + 7;
                number = number * 10;
            }
            if(upperCaseLetter.charAt(i) == 't' ||
                    upperCaseLetter.charAt(i) == 'u' ||
                    upperCaseLetter.charAt(i) == 'v' ){
                number = number + 8;
                number = number * 10;
            }
            if(upperCaseLetter.charAt(i) == 'w' ||
                    upperCaseLetter.charAt(i) == 'x' ||
                    upperCaseLetter.charAt(i) == 'y' ||
                    upperCaseLetter.charAt(i) == 'z' ){
                number = number + 9;
                number = number * 10;
            }
            return number;
        }
        return -1;
    }
}

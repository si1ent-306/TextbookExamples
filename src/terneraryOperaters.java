import java.util.Scanner;

public class terneraryOperaters {
    public static void main(String[] args){
        //Boolean-Expression ? True Expression : False Expression
        Scanner inputLine = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = inputLine.nextInt();
        boolean msg = num > 10 ? true : false;
        if(msg){
            System.out.println("Number is greater than 10");
        }else{
        System.out.println("Number is less than or equal to 10");
        }
    }
}

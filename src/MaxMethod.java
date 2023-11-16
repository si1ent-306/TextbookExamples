import java.util.Scanner;

public class MaxMethod {
    public static void main(String[] args){
        Scanner inputLine = new Scanner(System.in);
        System.out.println("Enter 2 numbers: ");
        int num1 = inputLine.nextInt();
        int num2 = inputLine.nextInt();
        System.out.println(max(num1, num2));
    }
    public static int max(int num1, int num2){
         int result = (num1 > num2)? num1 : num2;
         return result;
    }
}

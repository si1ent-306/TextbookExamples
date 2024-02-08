import java.util.Scanner;

public class InputMismatchException {
    public static void main(String[] args){
        try{
            boolean continueV = true;
            Scanner inputLine = new Scanner(System.in);
            System.out.println("Calculate this sum");
            while(continueV) {
                int num1 = (int) ((Math.random() * 10) + 1);
                int num2 = (int) ((Math.random() * 10) + 1);
                int solution = num1 + num2;
                System.out.println(num1 + " + " + num2);
                int inputedAnswer = inputLine.nextInt();
                if (solution == inputedAnswer) {
                    System.out.println("Correct!");
                    continueV = false;
                } else {
                    System.out.println("Try again");
                }
            }
        }catch (java.util.InputMismatchException exception){
            System.out.println("Wrong input");

        }
    }
}

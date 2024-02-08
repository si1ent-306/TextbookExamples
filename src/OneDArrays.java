import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class OneDArrays {
    public static void main(String[] args) {
        try {
            int[] matrix = new int[10];
            Scanner inputLine = new Scanner(System.in);
            System.out.println("Enter values for " + matrix.length + " :");
            for(int i = 0; i < matrix.length; i++){

                matrix[i] = inputLine.nextInt();
            }
            System.out.println(Arrays.toString(matrix));
        }
        catch (InputMismatchException ex){
            System.out.println("Only integers");
        }

    }
}

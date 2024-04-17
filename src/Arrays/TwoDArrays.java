package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArrays {
    public static void main(String[] args) {
        int[][] matrix = new int[2][2];
        Scanner inputLine = new Scanner(System.in);
        System.out.println("Enter values for " + matrix.length + " and " + matrix[0].length + " :");
        for(int row = 0; row < matrix.length; row++){
            for(int column = 0; column < matrix[0].length; column++){
                matrix[row][column] = inputLine.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(matrix));
    }
}

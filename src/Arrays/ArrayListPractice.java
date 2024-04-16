package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {
        //Write a program that randomly fills in 0s and 1s into an n-by-n matrix,
        Scanner inputLine = new Scanner(System.in);
        System.out.print("Enter a number for the length: ");
        int length = inputLine.nextInt();
        System.out.println(length);
        Integer[][] table = new Integer[length][length];
        // add object to that ArrayList
        for(int i = 0; i < table.length; i++){
            for(int j = 0; j < table[i].length; j++){
                int random = ((int) (Math.random() * 2));
                table[i][j] = random;
            }
        }
        // prints the matrix,
        ArrayList list = new ArrayList(Arrays.asList(table));
        System.out.println(Arrays.deepToString(list.toArray()));

        // and finds the rows and columns with the most 1s.
        // (Hint: Use two s to store the row and column indices with the most s.)
    }
}

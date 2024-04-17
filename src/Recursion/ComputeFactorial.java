package Recursion;

import java.util.Scanner;

public class ComputeFactorial {
    public static void main(String[] args){
        Scanner inputLine = new Scanner(System.in);
        System.out.println("Enter a number to calculate the factorial: ");
        int n = inputLine.nextInt();
        System.out.println("Factorial of "+ n + " is " + factorial(n));
    }

    private static long factorial(int n) {
    if(n==0)
        return 1;
    else
        return n * factorial(n-1);

    }
}

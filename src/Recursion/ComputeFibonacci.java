package Recursion;

import java.util.Scanner;

public class ComputeFibonacci {
    public static void main(String[] args){
        Scanner inputLine = new Scanner(System.in);
        System.out.println("Enter an index for a Fibonacci Number : ");
        int n = inputLine.nextInt();
        System.out.println("Fibonacci of "+ n + " is " + fib(n));
    }

    private static long fib(int n) {
        if(n==0)
            return 0;
        else if(n==1)
            return 1;
        else
            return fib(n-1) + fib(n-2);

    }
}

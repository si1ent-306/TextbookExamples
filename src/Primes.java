import java.util.ArrayList;
import java.util.Scanner;

public class Primes {

    public static void main(String[] args) {
        Scanner inputLine = new Scanner(System.in);
        System.out.println("Enter an int[1]: ");
        int firstInt = inputLine.nextInt();
        System.out.println("Enter an int[2]: ");
        int lastInt = inputLine.nextInt();
        System.out.println(findPrimes(firstInt, lastInt));
    }

    public static ArrayList<Integer> findPrimes(int start, int end) {

        ArrayList<Integer> primes = new ArrayList<>();

        for(int n = start; n < end; n++) {
            boolean prime = true;

            int i = 2;
            while(i <= n/2) {
                if(n % i == 0) {
                    prime = false;
                    break;
                }
                i++;
            }

            if(prime) {
                primes.add(n);
            }
        }

        return primes;
    }

}
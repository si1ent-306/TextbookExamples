import java.util.Scanner;

public class RecursivePalindromeUsingSubstring {
    public static boolean isPalindrome(String s){
        if(s.length() <= 1)
            return true;
        else if (s.charAt(0) != s.charAt(s.length()-1))
            return false;
        else
            return isPalindrome(s.substring(1, s.length()-1));
    }
    public static void main(String[]args){
        Scanner inputLine = new Scanner(System.in);
        System.out.println("Enter a line to check if it is a palindrome: ");
        String line = inputLine.nextLine();
        System.out.println("Is " + line + " a plaindrome: " + isPalindrome(line));
//        System.out.println("IS noon a plaindrome: " + isPalindrome("noon"));
//        System.out.println("IS a a plaindrome: " + isPalindrome("a"));
//        System.out.println("IS ada a plaindrome: " + isPalindrome("ada"));

    }
}

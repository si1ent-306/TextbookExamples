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
        System.out.println("IS Moon a plaindrome: " + isPalindrome("moon"));
        System.out.println("IS noon a plaindrome: " + isPalindrome("noon"));
        System.out.println("IS a a plaindrome: " + isPalindrome("a"));
        System.out.println("IS ada a plaindrome: " + isPalindrome("ada"));

    }
}

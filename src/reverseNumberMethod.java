public class reverseNumberMethod {
    // Write a method with the following header to display an integer in reverse order:
    public static void main(String[] args){
        int reverseNumber = reverse(1234);
        System.out.println(reverseNumber);
    }
    public static int reverse(int number) {
        //number = 1234
        //remainder = 1234 % 10 = 4
        //reverse = 0 * 10 + 4 = 0 + 4 = 4
        //number = 1234 / 10 = 123
        int reverse = 0;
        while (number != 0) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }
        return reverse;
    }
}

public class sortNumberMethod {
    public static void main(String[] args){
       displaySortedNumbers(60, 20, 35);

    }
    //Write a method with the following header to display three numbers in increasing order:
    public static void displaySortedNumbers(double num1, double num2, double num3){
       double max = Math.max(num1, Math.max(num2, num3));
       double min = Math.min(num1, Math.min(num2, num3));
       double mid = (num1 + num2 + num3) - (max + min);
       System.out.println(max + " " + mid + " " + min);
    }

}
